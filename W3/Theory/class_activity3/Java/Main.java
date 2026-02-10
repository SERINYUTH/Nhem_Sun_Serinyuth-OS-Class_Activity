// Main.java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor(); // only 1 thread
        executor.execute(new SimpleTask()); // run one task
        executor.shutdown(); // finish after task completes
    }
}
