package threadsApi;

public class FourthWay {
    public static void main(String[] args) {
        System.out.println("Main thread Begins");
        /**
         * Overloaded Thread Constructor takes
         * a Runnable object as a parameter and
         * Thread is created
         */
        Thread t1 = new Thread(new FourthTask());
        Thread t2 = new Thread(new FourthTask());

        /**
         * Once the thread is created,
         * we can either call RUN or START method
         */
        t1.start();
        t2.start();

        System.out.println("Main thread Ends");
    }
}

class FourthTask implements Runnable {

    private static int count = 0;
    private int id;

    public void run(){
        System.out.println("Running Method Run for "+ id );
        for(int i = 10; i > 0 ; i--){
            System.out.println(id+ " TICK TICK " +i);
        }
    }
    FourthTask() {
        System.out.println("Starting Thread");
        this.id = ++count;
    }

}

