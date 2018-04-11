package threadsApi;

public class SecondWay {

        public static void main(String[] args) {
            System.out.println("Main thread Begins");
            Thread t = new SecondTask();
            t.start();
            Thread t2 = new SecondTask();
            t2.start();
            System.out.println("Main thread Ends");

        }
    }

    class SecondTask extends Thread {

        private static int count = 0;
        private int id;
        @Override
        public void run(){
            System.out.println("Running Method Run for "+ id );
            for(int i = 10; i > 0 ; i--){
                System.out.println(id+ " TICK TICK " +i);
            }
        }
        SecondTask() {
            System.out.println("Starting Thread");
            this.id = ++count;
        }

    }
