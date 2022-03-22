/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizandocodigo2209;

import asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;
import ico.fes.herencia.Alumno;
import ico.fes.herencia.Servidor;
import ico.fes.herencia.poliforismo.Animal;
import ico.fes.herencia.poliforismo.Perro;
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

        String nombre = new String("José José");
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
        miCompu.setCpu(new Procesador("Intel", 2.6f));
        System.out.println(miCompu);

        
        
        
        
        miCompu.getCpu().setMarca("AMD");
        System.out.println(miCompu);

        //establecer un mouse: logitech, tipo optico
        miCompu.setRaton(new Mouse("Logitech", "Optico "));
        System.out.println(miCompu);
        
        //Constructor Sobrecargado
        //Composicion
        Computadora compu2 = new Computadora("Apple", "MackBook Pro", new Monitor("foshiba", 143f), new Mouse("Actekc", "Optico"), new Teclado("Apple", 101), new Procesador("M1", 3.4f));
        System.out.println(compu2);
        
        //ejemplos de composicion
        //Una forma para poner mouse, marca y el tipo
        compu2.getRaton().setMarca("Apple");
        compu2.getRaton().setTipo("Touch");
        System.out.println(compu2);

        //segundaforma
        /* compu2.setRaton(new Mouse("Apple", "Touch"));
            System.out.println(compu2);
         */
        
        //ejemplo de herencia
        System.out.println("---------------");
        Alumno alu1 = new Alumno();
        alu1.setNombre("José");
        System.out.println(alu1);
        
        //constructor sobrecargado
        Alumno alu2 = new Alumno("319299", "ICO", "José Perez", 18);
        System.out.println(alu2);
        
        alu1.setNumeroCuenta("32031");
        alu1.setEdad(19);
        System.out.println(alu1);
        
        
        
        
        
        
        System.out.println("----------- Compisicion y Herencia en la misma Clase ----------");
        Servidor server=new Servidor();
        server.setMarca("HP");
        server.setNumeroTarjetaRed(2);
        
        //RATON
        server.setRaton(new Mouse("LG", "Optico"));
        System.out.println(server);

        server.getRaton().setMarca("Logitech");
        System.out.println(server);

        
        System.out.println("----- Ejemplo Poliformismo-----");
        Perro dog=new Perro ("Bull dog","5 estrellas",4);
        Animal animal1=new Animal(4);
        dog.emitirSonido();
        animal1.emitirSonido();
        
        
    }

}
