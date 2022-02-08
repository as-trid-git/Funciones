public class Ascii {

    public static int codigoAscii(char caracter){

        return (int)caracter; //casteo

    }

    public static void main(String[] args) {
        
    char car=' ';

    System.out.println("El carácter: " + car + " asocia el código " + codigoAscii(car));
        
    }


    
}
