package gr.aueb.cf.cf9.ch16.threads;

public class WorkerThread implements Runnable {


    @Override
    public void run() {
        // Critical Section

        for (long i = 1L; i <= 10_000_000_000L; i++) {
            if (i == 10_000_000_000L) {
                System.out.println("Done!");
            }
        }
    }
}
