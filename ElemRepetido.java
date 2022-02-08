
public class ElemRepetido {

    public static boolean eleRepetido(int []array){

        for(int i=0;i<array.length;i++){

            for(int j=i+1;j<array.length;j++){

                if(array[i]==array[j]){
                    //System.out.println(array[i]);
                    return true;
                    

                }

            }

        }
        return false;

    }

    public static void main(String[] args) {

        int [] a={1,2,3,4,5,6,7,8,9};

        System.out.println(eleRepetido(a));

        
    }
    
}
