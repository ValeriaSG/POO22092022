/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209parte2;

import ico.fes.Aritmetica;
import ico.fes.Circulo;
import ico.fes.Cuadrado;
import ico.fes.herencia.EstudianteDeportistaArtista;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class JavaBasico2209Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> nombres=new ArrayList<String>();
        nombres.add("Alma");
        nombres.add("Bartolo");
        nombres.add("Carlos");
        nombres.add("Diana");
        nombres.add("Ernesto");
        
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
        System.out.println("------------");
            //scanner se utiliza para datos en el teclado, es decir se liga con el archivo de entrada estandar
            Scanner teclado=new Scanner(System.in);
            //nextIn es para representar un numero en la entrada del teclado
           int seleccion =0;
            
            String elNombre="";
            
                try {
                    seleccion = teclado.nextInt();
                    elNombre = nombres.get(seleccion);
                }catch(InputMismatchException ie){
                    System.out.println("Debe teclear valores numericos");
                }catch(IndexOutOfBoundsException ioe){
                     System.out.println("Error, debe ser entre 0 y 4");
                      elNombre = nombres.get(0);
                }catch (Exception e) {
                    System.out.println("Generica");
                    elNombre=nombres.get(1);
                 
                } finally {
                    System.out.println(elNombre);
                    elNombre = null;
                //Limpieza
                }

        //System.out.println(nombres.get(seleccion));
        
            //nunca terminar un programa de manera abrupta
        System.out.println("Continua el programa ...");
        
            Aritmetica cal=new Aritmetica(2,0); //codigo duro cuando se establecen datos en el programa
            System.out.println(cal.getA()+ " + " +cal.getB()+ " = " + cal.sumar());
            try {
              System.out.println(cal.getA()+ " / " +cal.getB()+ " = " + cal.dividir());
            } catch (Exception e) {
                System.out.println("Error de Aritmetica");
             }
            
        
        System.out.println("Fin del programa");
        
        System.out.println("...........Interfaz.........");
        //obliga que se tenga una estructura especifica, tenga un protocolo entre clases
         Cuadrado cuad=new Cuadrado(5.0f);
         Circulo circ=new Circulo(4.5f);
         
        System.out.println("Area del Cuadrado es: "+ cuad.calcularArea());
        System.out.println("Area del Circulo es: "+ circ.calcularArea());
        
        System.out.println(".-.-.-.-.-.-.-.-.-Clases abstractas-.-.-.-.-.-.-.-.-.-.-.");
        
        EstudianteDeportistaArtista eda= new EstudianteDeportistaArtista();
        eda.setNombre("Diana");
        eda.setCarrrera("ICO");
        eda.setDisciplinaDeportiva("Futbol");
        eda.setGeneroArtistico("Fotografia, Estampa, Dibujo");
        eda.comer();
        eda.ensayar();
        eda.entrenar();
        System.out.println(eda);
               
        
    
    
    
    } 
    
}
