/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claselibro;

/**
 *
 * @author Valeria
 */
public class Libreria {
    
        private String autor;
        private String titulo;
        private String tamano;
        private int edicion;
        private String editorial;

    public Libreria() {
    }

    public Libreria(String autor, String titulo, String tamano, int edicion, String editorial) {
        this.autor = autor;
        this.titulo = titulo;
        this.tamano = tamano;
        this.edicion = edicion;
        this.editorial = editorial;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }
        
     public void tarea(){
         System.out.println("El libro de tarea es " + this.titulo );
     }  
     public void Biblioteca(){
         System.out.println("De la editorial " +  this.editorial);
     }

    @Override
    public String toString() {
        return "Libreria{" + "autor=" + autor + ", titulo=" + titulo + ", tamano=" + tamano + ", edicion=" + edicion + ", editorial=" + editorial + '}';
    }
    
     
}
