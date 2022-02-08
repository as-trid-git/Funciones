public class Random {

    public static int generaNum(int min, int max){

        return (int)Math.floor(Math.random()*(min-(max+1))+(max+1));

    }

    public static void main(String[] args) {

        int num1=0;
        int num2=100;

        for(int i=0;i<100;i++){
            System.out.println(generaNum(num1, num2));

        }

        
        
    }
    
}
