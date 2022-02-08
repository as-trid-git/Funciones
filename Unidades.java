import java.util.Scanner;

public class Unidades {

    public static int numUnidades(int cantidad){

        int cifras=1;

        for(int i=cantidad;i>=10;i/=10){
            cifras++;

        }
        return cifras;

    }

    public static void main(String[] args) {

        Scanner lector= new Scanner(System.in);

        int numero;

        do{
            System.out.println("Escribe una cantidad positiva: ");
            numero=lector.nextInt();

        } while(numero<0);

        int cifra=numUnidades(numero);

        System.out.println("Iiene: " + cifra + " cifra(s)" );
        
    }
    
}
