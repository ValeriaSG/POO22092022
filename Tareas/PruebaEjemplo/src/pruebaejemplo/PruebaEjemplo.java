/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author Valeria
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("CUENTA HABIENTE"+ "\n");
        
        Cuentahabiente[] habiente = new Cuentahabiente[5];
        habiente[0] = new Cuentahabiente (322098643, "Felipe ", 38000d);
        habiente[1] = new Cuentahabiente (322098644, "Luis", 1400000d);
        habiente[2] = new Cuentahabiente (322098645, "Angelica", 6000d);
        habiente[3] = new Cuentahabiente (322098646, "Yahir", 78000d);
        habiente[4] = new Cuentahabiente (322098647, "Regina", 10800d);
        
        System.out.println(habiente[0]);
            habiente[0].retirarDinero(2000);
            
                System.out.println("\n");
         
        System.out.println(habiente[1]);
            habiente[1].retirarDinero(60);
            
               System.out.println("\n");
        
        System.out.println(habiente[2]);
            habiente[2].retirarDinero(3500);
            
                System.out.println("\n");
                
        System.out.println(habiente[3]);
            habiente[3].retirarDinero(5000);
            
               System.out.println("\n");
                    
        System.out.println(habiente[4]);
            habiente[4].retirarDinero(1200);
            
               System.out.println("\n");
            
                
          
        System.out.println("-.-.-.-.-. Con FOR EACH .-.-.-.-.-" +" \n");
            for (Cuentahabiente i : habiente){
                System.out.println(i.evaluarNivelCliente()+"\n");
            }
    }
}
        
        
    

