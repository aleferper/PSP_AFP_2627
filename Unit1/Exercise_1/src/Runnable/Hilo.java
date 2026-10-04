package Runnable;

import java.util.Random;

public class Hilo implements Runnable{

    private final int n1;
    private final int n2;

    public Hilo(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public void run() {

        for (int i = n1; i <= n2; i++){
            try {
                Random r = new Random();
                int aleatorio = r.nextInt(1,1000);
                Thread.sleep(aleatorio);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
