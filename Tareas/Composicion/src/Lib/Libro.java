/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lib;

import Libro.Autor;
import Libro.Editorial;
        

/**
 *
 * @author Valeria
 */
public class Libro {
    private String titulo;
    private int edicion;
    private Autor autor;
    private Editorial editoral;

    public Libro() {
    }

    public Libro(String titulo, int edicion, Autor autor, Editorial editoral) {
        this.titulo = titulo;
        this.edicion = edicion;
        this.autor = autor;
        this.editoral = editoral;
    }

    public Editorial getEditoral() {
        return editoral;
    }

    public void setEditoral(Editorial editoral) {
        this.editoral = editoral;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", edicion=" + edicion + ", autor=" + autor + ", editoral=" + editoral + '}';
    }

    
    public void clasificacion(){
        System.out.println("La clasificacion depende del: " + this.getTitulo());
    }
    
    public void getTitulo(String elementos_Java) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void getEdicion(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
    
}
    
    
            
