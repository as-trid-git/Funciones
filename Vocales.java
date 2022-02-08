import javax.swing.JOptionPane;

public class Vocales {

    public static int numVocales(String frase){

        char [] voc= {'a','e','i','o','u'};

        char contadorVoc;

        boolean esVoc;

        int contador=0;

        for(int i=0;i<frase.length();i++){
            contadorVoc=frase.charAt(i);
            esVoc=false;

            for(int j=0;j<voc.length && !esVoc;j++){

                if(contadorVoc==voc[j]){
                    esVoc=true;

                }

            } if(esVoc){
                contador++;

            }

        } return contador;

    }

    public static void main(String[] args) {

        String texto= JOptionPane.showInputDialog(null, "Escribe una frase", 
                                                        "Vocales", 
                                                        JOptionPane.INFORMATION_MESSAGE);

        int vocales= numVocales(texto.toLowerCase());

        System.out.println("La frase tiene " + vocales + " vocales. ");
        
    }
    
}
