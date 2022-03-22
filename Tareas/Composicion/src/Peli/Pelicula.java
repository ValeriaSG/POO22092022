/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Peli;

import Pelicula.Actor;
import Pelicula.Director;
import Pelicula.Productora;

/**
 *
 * @author Valeria
 */
public class Pelicula {
    private String titulo;
    private int clasificacion;
    private Actor actor;
    private Director director;
    private Productora productora;

    public Pelicula() {
    }

    public Pelicula(String titulo, int clasificacion, Actor actor, Director director, Productora productora) {
        this.titulo = titulo;
        this.clasificacion = clasificacion;
        this.actor = actor;
        this.director = director;
        this.productora = productora;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", clasificacion=" + clasificacion + ", actor=" + actor + ", director=" + director + ", productora=" + productora + '}';
    }

    public void setActor(String bratt_Pitt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setActor(String bratt_Pitt, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setProductora(String sonic, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setDirector(String william_Crowd, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
