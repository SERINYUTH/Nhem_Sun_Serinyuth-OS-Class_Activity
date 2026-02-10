// SimpleTask.java
class SimpleTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + ": step " + i);
            try {
                Thread.sleep(2000); // Sleep 2 seconds to simulate work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread was interrupted");
            }
        }
    }
}
