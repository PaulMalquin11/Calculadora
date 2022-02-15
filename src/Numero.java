public class Numero {
    int n1;

    public Numero(int n1) {
        this.n1 = n1;
        Calculo();
    }

    public void Calculo(){
        int resultado;
        resultado = n1%10;
        if(resultado == 0){
            System.out.println("Si es multiplo de 10: "  + resultado);
        }else{
            System.out.println("no es");
        }
    }
}
