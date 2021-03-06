package Commons;

import java.util.concurrent.TimeUnit;

public class LoopTaskA implements Runnable {

    private static int count = 0;
    private int id;

    public void run(){
        System.out.println("##### TASK "+ id + " STARTING.#####");
        for(int i = 10; i > 0 ; i--){
            System.out.println(id+ " TICK TICK " +i);
            try {
                TimeUnit.MILLISECONDS.sleep((long)Math.random()*1000);
            } catch (Exception e) {

            }
        }
        System.out.println("##### TASK "+ id + " DONE.#####");
    }
    public LoopTaskA() {
        this.id = ++count;
    }

}
