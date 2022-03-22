/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pelicula;

/**
 *
 * @author Valeria
 */
public class Productora {
    private String nombre;
    private int numTrabajadores;

    public Productora() {
    }

    public Productora(String nombre, int numTrabajadores) {
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
        return "Productora{" + "nombre=" + nombre + ", numTrabajadores=" + numTrabajadores + '}';
    }
    
    public void supervision(){
        System.out.println("Quien realiza cada cambio de escena es " + this.getNombre());
    }
}
