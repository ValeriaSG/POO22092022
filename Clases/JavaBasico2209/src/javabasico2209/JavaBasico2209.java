/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Valeria
 */
public class JavaBasico2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int edad =20;
        System.out.println("Edad = "+ edad);
        Integer edad2 = new Integer (22);
        System.out.println(edad2);
        double x = edad2.doubleValue();
        System.out.println(x);
        //deja la mitad de espacio
        System.out.println(edad2.shortValue());
                
        System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.");
        
        //convertir string a entero
        String cadena="99";
        int altura = Integer.parseInt(cadena);//Metodo miembro o metodo de clase
        altura +=1;
        System.out.println("Altura = "+altura);
        
        float y=Float.parseFloat(cadena);
        y=y+0.5f;//f es por precision
        System.out.println("Altura = " + y);
        
         System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.");
        
         
         System.out.println("Troncos de un arbol = "+Arbol.tronco);
         //Arbol.generarOxigeno();
         
         
         //JOptionPane.showMessageDialog(null, "Hola mundo", "Aqui va el titulo", JOptionPane.ERROR_MESSAGE);
        //String dato = JOptionPane.showInputDialog(null, "Dame tu edad", "Introducir Datos", JOptionPane.QUESTION_MESSAGE);
        //System.out.println(dato);
        
        //operador terniario
        //sin operador terniario
        int edad3=20;
        //validar si es mayor de edad
        String resultado ="";
        if (edad3 < 18)
        {
            resultado ="Menor de edsd";
        }
        else
        {
            resultado ="Mayor de edad, ten un tequila para la gargante";
        }
        System.out.println(resultado);
        
        
        
                
        //con el operador terniario
        //<cond>? <True>:<False>;
        
        int edad4=24;
        String res="";
        
        res = edad4 <18? "Menor de edad" : "Mayor de edad, tequila";
        System.out.println(res);
        
        //conversion minima
        int edad5=15;
        System.out.println(edad5 < 18? "Menor de edad 5":"Ya! el tequila");
        
        
        int val1 =1;
        int val2 =5; 
        
        //comparacion or a nivel de bits de dcer
        
        //val1 = 0000 ... 0001;
        //val2 = 0000 ... 0010;
        
        //Representacion a nivel bits
        
        System.out.println(val1 & val2);
        
        
        int val3=1;
         //int val4 <<= val3;
        int val4 = 0;
        val4 = val3 <<2;
        System.out.println(val4);
        
        System.out.println("---------Arreglos---------");
        int[] edades;
        edades = new int [5];
        System.out.println(edades);
        
        edades[0]=10;
        System.out.println("La primera edad es: "+ edades[0]);
        
        int[] estaturas = new int[5];
        
        int [] pesos = {86,99,56,76,77};
        System.out.println(pesos [0]);
        System.out.println(pesos [1]);
        System.out.println(pesos [2]);
        System.out.println(pesos [3]);
        System.out.println(pesos [4]);
        
        System.out.println("-----Con FOR-----");
        
        for (int i=0; i< pesos.length;i++){
            System.out.println(pesos[i]);
        }
        
        System.out.println("Orden Inverso");
        for (int i = 0; i > pesos.length; i++) {
            int peso = pesos[i];
            
        }
                
        
        
        
        System.out.println("Arreglo de alumnos");
                Alumno[] lista = new Alumno[5];
                lista[0] = new Alumno ("99999", 2, 9.0f);
                lista[1] = new Alumno ("77777", 2, 7.0f);
                lista[2] = new Alumno ("77777", 2, 7.0f);
                lista[3] = new Alumno ("88888", 2, 8.0f);
                lista[4] = new Alumno ("66666", 2, 6.0f);
                
        for (int i = 0; i < lista.length; i++) {
            Alumno alumno = lista[i];
            System.out.println(alumno.evaluarDesempenio());
            
            
            //For Each es un FOR especial, introduciendo en la version 2 de java
            System.out.println("Con FOR EACH");
            for (Alumno alumno1 : lista) {
                System.out.println(alumno1.evaluarDesempenio());
            }
           
            ArrayList<Alumno>grupo2209= new ArrayList<Alumno>();
            grupo2209.add(new Alumno("5555555",2, 9.0f));
            grupo2209.add(new Alumno("6666666",2, 8.0f));
            grupo2209.add(new Alumno("7777777",2, 6.0f));
            grupo2209.add(new Alumno("8888888",2, 10.0f));
            grupo2209.add(new Alumno("9999999",2, 8.0f));
            
            for (Alumno alumno1 : grupo2209) {
                System.out.println(alumno1);
                
            }
                    System.out.println("Add con indice");
            grupo2209.add(2,new Alumno("8111111",3,9.9f));
            for (Alumno alumno1 : grupo2209) {

                System.out.println(alumno1);                
            }
            
            Alumno tmp= grupo2209.get(2);
            System.out.println("Alumno de index = 1 :"+tmp);
            
            System.out.println("Eliminar el index 3");
            Alumno tmp2=grupo2209.remove(3);
            System.out.println("Elementos sacado=" + tmp2);
            
            for (Alumno alumno1 : grupo2209){
                System.out.println(alumno1);
                
            }
            
            System.out.println("Remplazar elemento");
            Alumno tmp3=grupo2209.set(0, new Alumno ("444444", 4, 4.4f));
            System.out.println("El sacado es= "+tmp3);
            
            for (Alumno alumno1 : grupo2209) {
                System.out.println(alumno1);
                
            }
            
            
            
            try {
                System.out.println("Excepciones");
                System.out.println(grupo2209.get(2));
            } catch (Exception e) {
                System.out.println("Error... revisar los indices");
            }
            System.out.println("Fin del programa");
         }
                
    }
            
 }
        
        
        
        
        
        
        
        
        
        
        
    
    

