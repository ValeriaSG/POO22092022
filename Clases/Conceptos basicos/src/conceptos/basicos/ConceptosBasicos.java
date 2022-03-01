/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceptos.basicos;

import Ico.fes.Auto;
import Ico.fes.Silla;
import java.awt.Color;

/**
 *
 * @author Valeria
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola de Nuevo");
        Silla s1 =new Silla();
        System.out.println(s1); //por defecto
        System.out.println(s1.toString());
        
        Auto miBocho=new Auto();
        System.out.println(miBocho);
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.blue);
        System.out.println(miBocho);
        
        
        Auto miMustang=new Auto ("Ford","Mustang" , 0, Color.yellow);
        System.out.println(miMustang);
        
        Auto miAkura =new Auto("Akura", "NSX", 2013, Color.gray);
        System.out.println(miAkura);
        
    }
    
}
