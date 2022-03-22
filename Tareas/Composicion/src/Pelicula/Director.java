/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pelicula;

/**
 *
 * @author Valeria
 */
public class Director {
    private String Nombre;
    private int numProyectos;

    public Director() {
    }

    public Director(String Nombre, int numProyectos) {
        this.Nombre = Nombre;
        this.numProyectos = numProyectos;
    }

    public int getNumProyectos() {
        return numProyectos;
    }

    public void setNumProyectos(int numProyectos) {
        this.numProyectos = numProyectos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Director{" + "Nombre=" + Nombre + ", numProyectos=" + numProyectos + '}';
    }
    
    public void dirige(){
        System.out.println("El nombre  director que dirige la pelicula es "+this.getNombre());
    }
}
