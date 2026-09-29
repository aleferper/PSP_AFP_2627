package Threads_Runnable;

public class Tostadora {
    static void main() {
      try{

          Cafetera cafetera = new Cafetera();
          Thread thread = new Thread(cafetera);
          thread.start();
          PrepararCafe();
      }
      catch (InterruptedException ie){
          System.out.println("Hilo interrumpido.");
      }
    }

    static void PrepararCafe() throws InterruptedException {
        System.out.println("Preparando cafetera");
        Thread.sleep(2000);
        System.out.println("Calentando tostada");
        Thread.sleep(2000);
        System.out.println("Poniendo aceite en la tostada");
        Thread.sleep(2000);
        System.out.println("Poniendo sal en la tostada");
        Thread.sleep(2000);
        System.out.println("Sirviendo tostada");
    }
}
