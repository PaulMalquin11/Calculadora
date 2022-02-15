import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un núm");
        int num1 = entrada.nextInt();
        Numero obj1 = new Numero(num1);
    }
}
