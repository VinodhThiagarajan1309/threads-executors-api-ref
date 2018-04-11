package threadsApi;

public class ThirdWay {

    public static void main(String[] args) {
            System.out.println("Main thread Begins");
            new ThirdTask();
            new ThirdTask();
            System.out.println("Main thread Ends");
        }
    }

    class ThirdTask implements Runnable {

        private static int count = 0;
        private int id;

        public void run(){
            System.out.println("Running Method Run for "+ id );
            for(int i = 10; i > 0 ; i--){
                System.out.println(id+ " TICK TICK " +i);
            }
        }
        ThirdTask() {
            System.out.println("Starting Thread");
            this.id = ++count;
            new Thread(this).start();
        }

    }
