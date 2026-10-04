package Clase_Anonima;

import java.util.Random;
import java.util.Scanner;

public class numeros_anonima {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce n1: ");
        int n1 = sc.nextInt();

        System.out.print("Introduce n2: ");
        int n2 = sc.nextInt();

        Thread t = new Thread(new Runnable() {
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
        });

        t.start();

        if(t.isAlive())
            System.out.println("Hilo lanzado");



    }
}
