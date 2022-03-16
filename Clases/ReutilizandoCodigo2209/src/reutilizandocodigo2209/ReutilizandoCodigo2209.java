/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizandocodigo2209;

import asus.com.Computadora;
import ico.fes.componentes.Procesador;
import javax.swing.JFrame;

/**
 *
 * @author Valeria
 */
public class ReutilizandoCodigo2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre= new String ("José José");
        System.out.println(nombre);
        System.out.println(nombre.charAt(5));
        System.out.println(nombre.toUpperCase());
        
        /*
        //sale una pantalla emergente
        JFrame ventana =new JFrame("Mi primera ventana emergente Java");
        ventana.setSize (600, 400);
        ventana.setVisible(true);
        */
        
        //jugar con los atributos
        Computadora miCompu = new Computadora();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new Procesador ("Intel", 2.6f));       
        System.out.println(miCompu);
        
    }
    
}
