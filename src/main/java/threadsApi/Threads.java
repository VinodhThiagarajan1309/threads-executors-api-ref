package threadsApi;

public class Threads {

    public static void main(String[] args) {
        System.out.println("Main thread Begins");
        Thread t = new FirstTask();
        Thread t2 = new FirstTask();
        System.out.println("Main thread Ends");
    }
}

class FirstTask extends Thread {

    private static int count = 0;
    private int id;
    @Override
    public void run(){
        System.out.println("Running Method Run for "+ id );
       for(int i = 10; i > 0 ; i--){
           System.out.println(id+ " TICK TICK " +i);
       }
    }
    FirstTask() {
        System.out.println("Starting Thread");
        this.id = ++count;
        this.start();
    }

}