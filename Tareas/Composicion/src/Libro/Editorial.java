/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

/**
 *
 * @author Valeria
 */
public class Editorial {
    private String nombre;
    private int numTrabajadores;

    public Editorial() {
    }

    public Editorial(String nombre, int numTrabajadores) {
        this.nombre = nombre;
        this.numTrabajadores = numTrabajadores;
    }

    public int getNumTrabajadores() {
        return numTrabajadores;
    }

    public void setNumTrabajadores(int numTrabajadores) {
        this.numTrabajadores = numTrabajadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", numTrabajadores=" + numTrabajadores + '}';
    }
    
    public void sucursales(){
        System.out.println("El nombre de las sucursales es: "+ this.getNombre());
    }
}
