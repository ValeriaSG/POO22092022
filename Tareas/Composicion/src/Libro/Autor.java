/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

/**
 *
 * @author Valeria
 */
public class Autor {
    private String nombre;
    private int numTitulos;

    public Autor() {
    }

    public Autor(String nombre, int numTitulos) {
        this.nombre = nombre;
        this.numTitulos = numTitulos;
    }

    public int getNumTitulos() {
        return numTitulos;
    }

    public void setNumTitulos(int numTitulos) {
        this.numTitulos = numTitulos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", numTitulos=" + numTitulos + '}';
    }
    
    public void escritos(){
        System.out.println("Los escritos son de " + this.getNombre());
    }
}
