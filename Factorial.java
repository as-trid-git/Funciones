public class Factorial {

    public static int factorialdev(int numero ){

        if(numero<0){
            System.out.println("El num no se puede calcular, es menor a cero");
            //return -1;
        }

        if(numero==1 || numero==0){
            System.out.println("El factorial es:");
            return 1;

        }

        int resultado=numero;

        for(int i=(numero-1);i>1;i--){
            resultado*=i;

        }

        return resultado;

    }

    public static void main(String[] args) {

        System.out.println(factorialdev(30));
        
    }
    
}
