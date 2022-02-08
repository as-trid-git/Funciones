public class CCC {

    public static void validarCCC(String CCC)throws Exception{

        if(CCC.length()!=20){
            throw new Exception("La longitud debe ser de 20 caracteres");

        }

        String msjError="";
        String aux;
        String entOfi;
        String numCuenta;
        String digControlresultado;

        int digEntofi, digNumcuenta;

        for(int i=0;i<4;i++){ //bucle de las 4 secciones a revisar

            try {
                
           

                switch(i){

                    case 0: //entidad

                        aux=CCC.substring(0, 4);  // del 0 al 3, el ult no lo toma
                        msjError="El código entidad no es número";
                        Integer.parseInt(aux);  //parsear convertir a num
                        break;

                    case 1: //oficina
                        aux=CCC.substring(4, 8);  
                        msjError="El código de oficina no es número";
                        Integer.parseInt(aux);  

                        break;
                    
                    
                    case 3: //num de control
                        aux=CCC.substring(8, 10);  
                        msjError="El código de control no es número";
                        Integer.parseInt(aux);  

                        entOfi="00"+CCC.substring(0,8);
                        numCuenta=CCC.substring(10, 20);

                        digEntofi= obtenerDigControl(entOfi);
                        digNumcuenta=obtenerDigControl(numCuenta);

                        digControlresultado= String.valueOf(digEntofi)+ String.valueOf(digNumcuenta);

                        if(!digControlresultado.equals(aux)){
                            msjError="Los dígitos no coinciden";
                            throw new Exception(msjError);

                        }

                        break;

                    case 2: //num de cuenta
                        aux=CCC.substring(10, 20); 
                        msjError="El código de cuenta no es número";
                        Integer.parseInt(aux);  

                        break;

                }

            } catch (NumberFormatException e) {
                throw new Exception(msjError);
            }

        }

    }

    public static int obtenerDigControl(String valorCuenta){

        int [] factores={1,2,4,8,5,10,9,7,3,6};
        int digControl=0;

        int digCuenta;
        
        for(int i=0;i<valorCuenta.length();i++){
            digCuenta= Integer.parseInt(String.valueOf(valorCuenta.charAt(i))); //car a string a int
            digControl+=digCuenta*factores[i];

        }

        digControl= 11-(digControl % 11);

        if(digControl==11){
            digControl=0;

        }else if(digControl==10){
            digControl=1;

        }
        return digControl;

    }

    public static void main(String[] args) {

        String CCC= "38793860610229756913";
        try {
            validarCCC(CCC);
            System.out.println("CCC correcto");
        } catch (Exception e) {
             
            System.out.println(e.getMessage());
        }
        
    }
    
}
