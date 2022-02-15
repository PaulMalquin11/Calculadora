import java.util.Scanner;

public class Operacion {
    int n1,n2;

    public Operacion(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
        Calculo();
    }

    public void Calculo(){
        System.out.println("Ingrese el tipo de operación");
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Suma, 2. Resta, 3. Multiplicacion, 4. Division");
        int var = entrada.nextInt();
        switch (var){
            case 1:
                int suma = n1+n2;
                System.out.println("La suma es: " + suma);
                Calculo();
                break;
            case 2:
                int resta = n1-n2;
                System.out.println("La resta es: " + resta);
                Calculo();
                break;
            case 3:
                int multi = n1*n2;
                System.out.println("La multi es: " + multi);
                Calculo();
                break;
            case 4:
                int div = n1/n2;
                System.out.println("La div es: " + div);
                Calculo();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }


}
