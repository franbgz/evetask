
package main;

import controlador.CgestorBBDD;
/**
 *
 * @author fran
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(CgestorBBDD.comprobarBBDDFile()){
            
        }else{
            try{
                CgestorBBDD gestor = new CgestorBBDD();
                gestor.crearArchivoBBDD();                
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            
        }
    }
    
}
