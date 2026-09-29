package Threads_Runnable;

public class Cafetera implements Runnable{
    @Override
    public void run() {
        try{
            System.out.println("Calentando cafetera");
            Thread.sleep(2000);
            System.out.println("Poniendo taza");
            Thread.sleep(2000);
            System.out.println("Poniendo cafe");
            Thread.sleep(2000);
            System.out.println("Poniendo leche");
            Thread.sleep(2000);
            System.out.println("Sirviendo cafe con leche");
        }
        catch (InterruptedException ie){
            System.out.println("Hilo interrumpido");
        }
    }
}
