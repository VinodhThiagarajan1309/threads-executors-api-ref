package threadsApi;

public class FifthWay {

    public static void main(String[] args) {
        System.out.println("Main thread starts here");

        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("Running Method Run for "  );
                for(int i = 10; i > 0 ; i--){
                    System.out.println( " TICK TICK " +i);
                }
            }
        });

        t.start();
        t.start();

        System.out.println("Main thread ends here");
    }
}
