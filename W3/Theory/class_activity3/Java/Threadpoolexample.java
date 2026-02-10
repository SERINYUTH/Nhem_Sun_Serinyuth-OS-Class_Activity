// Threadpoolexample.java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpoolexample {
    public static void main(String[] args) {
        int numTasks = 5; // number of tasks to run
        ExecutorService pool = Executors.newCachedThreadPool(); // dynamic threads

        for (int i = 0; i < numTasks; i++) {
            pool.execute(new SimpleTask());
        }

        pool.shutdown(); // wait for all tasks to finish
    }
}
