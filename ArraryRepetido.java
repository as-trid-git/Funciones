public class ArraryRepetido {

    public static boolean eleRepetido(int []array1, int [] array2){

        for(int i=0;i<array1.length;i++){

            for(int j=0;j<array2.length;j++){

                if(array1[i]==array2[j]){
                    
                    return true;
                    

                }

            }

        }
        return false;

    }

    public static void main(String[] args) {

        int [] a={1,2,3,4,5,6};
        int [] b={};
        
        System.out.println(eleRepetido(a,b));
    }
    
}
