public class Primo {

    public static boolean primoIs(int numero){

        if(numero<1){
            return false;

        }

        for(int i=(int)Math.sqrt(numero);i>1;i--){
            if(numero%i==0){
                return false;

            }
        }
        return true;

    }

    public static void main(String[] args) {

        System.out.println(primoIs(30));
        
    }
    
}
