/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package claselibro;

/**
 *
 * @author Valeria
 */
public class ClaseLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Libreria lib=new Libreria ();
          
      lib.setTitulo("Libro de Algebra");
      System.out.println("El titulo es de " + lib.getTitulo());
        
      
      lib.setAutor("Alfredo Baldor");
        System.out.println("El autor  es " +  lib.getAutor());
        
      lib.setEditorial("Porrua");
        System.out.println("La editorial es "+ lib.getEditorial());
        
      lib.setEdicion(4);
              System.out.println("El numero de la edición es: "+ lib.getEdicion());
              
    lib.Biblioteca();
    lib.tarea();
}
    
  
    
}
