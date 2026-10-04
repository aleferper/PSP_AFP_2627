package Runnable;

import java.util.Scanner;

public class numeros {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce n1: ");
        int n1 = sc.nextInt();

        System.out.print("Introduce n2: ");
        int n2 = sc.nextInt();

        Thread t = new Thread(new Hilo(n1, n2));
        t.start();

        if(t.isAlive())
            System.out.println("Hilo lanzado");



    }
}
