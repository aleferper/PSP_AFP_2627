import java.util.Random;

public class Hilo implements Runnable {
    @Override
    public void run() {

        Random random = new Random();
        int numAleatorio = random.nextInt(100) +1;
        for (int i = 1; i <= numAleatorio; i++) {
            try {
                Random r = new Random();
                int aleatorio = r.nextInt(500, 1001);
                String getThreadNeame = Thread.currentThread().getName();
                if (esPrimo(i)){
                    System.out.println(getThreadNeame + ": " + i);
                    Thread.sleep(aleatorio);
                }

            } catch (InterruptedException ie) {
                System.out.println("Error al procesars el hilo");
            }
        }

    }

    public boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }

        if(num == 2){
            return true;
        }

        if(num%2 == 0){
            return false;
        }

        for(int i = 3; i < num; i+=2){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}