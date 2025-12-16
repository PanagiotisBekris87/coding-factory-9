package gr.aueb.cf.cf9.ch16.threads;

public class Main {

    public static void main(String[] args) {
        Runnable worker = new WorkerThread();
        Runnable worker2 = new WorkerThread();
        WorkerThread worker3 = new WorkerThread();
        WorkerThread worker4 = new WorkerThread();
        WorkerThread worker5 = new WorkerThread();
        WorkerThread worker6 = new WorkerThread();

        Thread thread = new Thread(worker);
        thread.start();
        new Thread(worker2).start();            // Anonymous initializing
        new Thread(worker3).start();
        System.out.println("Halfway");
        new Thread(worker4).start();
        new Thread(worker5).start();
        new Thread(worker6).start();
        System.out.println("End");
    }
}
