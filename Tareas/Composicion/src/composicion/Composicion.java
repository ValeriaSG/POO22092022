/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composicion;

import Lib.Libro;
import Libro.Autor;
import Libro.Editorial;
import Peli.Pelicula;
import Pelicula.Actor;
import Pelicula.Director;
import Pelicula.Productora;




/**
 *
 * @author Valeria
 */
public class Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Libro lib1=new Libro();
        lib1.setTitulo("Elementos Java");
        lib1.setEdicion(4);
        lib1.setAutor(new Autor ("Arturo Diaz", 2) );
        lib1.setEditoral(new Editorial ("Santillan", 24));
        System.out.println(lib1);
        
        
        Pelicula pel1=new Pelicula();
        pel1.setTitulo("Guerra Mundial Z");
        pel1.setClasificacion(3);
        pel1.setActor(new Actor("Bratt Pitt", 65));
        pel1.setDirector(new Director("William Crowd", 320));
        pel1.setProductora(new Productora("Sonic", 560));
        System.out.println(pel1);
        
        
        
        
    }
    
}
