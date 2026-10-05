import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Introduce número: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Thread> listaHilo = new ArrayList<>();

        for (int i = 1; i <= n ; i++){
            Thread hilo = new Thread(new Hilo());
            hilo.setName("Hilo " + i);
            listaHilo.add(hilo);
            System.out.println("Hilo " + i + " lanzado");
            hilo.start();
        }
        sc.close();

        boolean todosFinalizados = false;

        while(!todosFinalizados){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println("Error: " + ie.getMessage());
            }

            boolean algunoVivo = false;

            System.out.println("\n--- ESTADO DE LOS HILOS ---");
            for (Thread h : listaHilo) {
                System.out.println("ID: " + h.getId() + " | Nombre: " + h.getName() + " | Estado: " + h.getState());
                if (h.isAlive()) {
                    algunoVivo = true;
                }
            }

            todosFinalizados = !algunoVivo;
        }

        System.out.println("Todos los hilos han terminado.");
    }
}