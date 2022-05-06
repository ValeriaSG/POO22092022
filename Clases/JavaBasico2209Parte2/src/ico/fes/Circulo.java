/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author Valeria
 */
//esto se le llama "java Bean, POJO" ya que son objetos planos, no tienen logica
//es diferente a EJB Enterprise Java Beans
public class Circulo implements Figura{
    
    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public float calcularArea() {
        //Principio de diseño L.P; l e infinito
            //Solo los valores 0,1 e infinitos son validos para usarse en la codificacion de algoritmos.
            //El lenguaje de programacion debe proporcionar un mecanismo para evitar usar literales numericas en el programa
                
        return Figura.PI *(this.radio * this.radio);
    }
    
    
    
}
