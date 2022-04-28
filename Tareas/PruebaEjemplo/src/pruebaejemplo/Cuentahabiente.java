/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author Valeria
 */
public class Cuentahabiente {
    private int idCuenta;
    private String nombre;
    private double balance;

    public Cuentahabiente() {
    }

    public Cuentahabiente(int idCuenta, String nombre, double balance) {
        this.idCuenta = idCuenta;
        this.nombre = nombre;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cuentahabiente{" + "idCuenta= " + idCuenta + ", nombre= " + nombre + ", balance= " + balance + '}';
    }
    
    public void retirarDinero (float monto){
        System.out.println("El monto total que tiene actualmente es la cantidad de : $ " + (this.balance-monto));
    }
    
    public String evaluarNivelCliente(){
        return this.balance <= 50000.00f? " Es Cliente Regular " : "Es Cliente Premium";
    }
    
    
    
   
}
