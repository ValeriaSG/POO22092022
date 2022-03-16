/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ico.fes;

import java.awt.Color;

/**
 *
 * @author Valeria
 */
public class Auto {
    
    private String marca; //Los atributos van en notacion lower canel case
    private String subMarca; //lowe canel case, todas en minusculas a partir de la segunda palabra,la primera en mayusculas
    
    private int modelo;
    private Color color;
    
    

    public Auto() {

    }

    public Auto(String marca, String subMarca, int modelo, Color color) {
        this.marca = marca;
        this.subMarca = subMarca;
        this.modelo = modelo;
        this.color = color;
    }

   
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override //Herencia concepto
    public String toString() { //
        return "Automovil{" + "marca=" + marca + ", subMarca=" + subMarca + ", modelo=" + modelo + ", color=" + color + '}';
    }
   
}
