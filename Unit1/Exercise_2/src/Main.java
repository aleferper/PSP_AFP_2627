import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Introduce número: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int i = 1; i <= n ; i++){
            Thread hilo = new Thread(new Hilo());
            hilo.setName("Hilo " + i);
            hilo.start();
        }
        sc.close();

    }
}