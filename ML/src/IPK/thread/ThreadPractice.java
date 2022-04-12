package IPK.thread;

public class ThreadPractice implements Runnable {

    private final int threadNumber;

    public ThreadPractice(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <= 5; i++) {
            ThreadPractice thread_1 = new ThreadPractice(i);
            Thread thread = new Thread(thread_1);
            thread.start();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " ******** " + threadNumber);
        }
    }
}
