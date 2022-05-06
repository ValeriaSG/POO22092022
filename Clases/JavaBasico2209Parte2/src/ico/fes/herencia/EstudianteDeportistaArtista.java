/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

/**
 *
 * @author Valeria
 */
public class EstudianteDeportistaArtista extends Persona implements Deportista, Artista{
    private String carrrera;
    private String numCuenta;
    private String disciplinaDeportiva;
    private String generoArtistico;

    public EstudianteDeportistaArtista() {
    }

    public EstudianteDeportistaArtista(String carrrera, String numCuenta, String disciplinaDeportiva, String generoArtistico) {
        this.carrrera = carrrera;
        this.numCuenta = numCuenta;
        this.disciplinaDeportiva = disciplinaDeportiva;
        this.generoArtistico = generoArtistico;
    }

    public String getGeneroArtistico() {
        return generoArtistico;
    }

    public void setGeneroArtistico(String generoArtistico) {
        this.generoArtistico = generoArtistico;
    }

    public String getCarrrera() {
        return carrrera;
    }

    public void setCarrrera(String carrrera) {
        this.carrrera = carrrera;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getDisciplinaDeportiva() {
        return disciplinaDeportiva;
    }

    public void setDisciplinaDeportiva(String disciplinaDeportiva) {
        this.disciplinaDeportiva = disciplinaDeportiva;
    }

    @Override
    public String toString() {
        return "EstudianteDeportistaArtista{" + "carrrera=" + carrrera + ", numCuenta= " + numCuenta + ", disciplinaDeportiva= " + disciplinaDeportiva + ", generoArtistico= " + generoArtistico + '}';
    }

    @Override
    public void entrenar() {
        System.out.println(this.nombre +  " esta entrenando "+ this.disciplinaDeportiva);
    }

    @Override
    public void jugar() {
        System.out.println(this.nombre+" esta jugando "+ this.disciplinaDeportiva);
    }

    @Override
    public void ensayar() {
        System.out.println(this.nombre+" esta ensayando/practicando "+ this.generoArtistico);
    }

    @Override
    public void presentar() {
        System.out.println(this.nombre+" esta presentando su obra de "+ this.generoArtistico);
    }
    
    
    
    
}
