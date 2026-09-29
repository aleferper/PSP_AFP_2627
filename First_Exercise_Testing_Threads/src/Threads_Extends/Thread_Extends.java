package Threads_Extends;

public class Thread_Extends {
    static void main() {
      try{

          Cafetera cafetera = new Cafetera();
          cafetera.start();
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
