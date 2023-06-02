/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop11_actividad;

/**
 *
 * @author poo08alu04
 */
public class Alumno {
    private String nombre;
    private String apPat;
    private String apMat;
    private int numCuenta;
    private int edad;
    private int anioIngreso;

    public Alumno() {
    }

    public Alumno(String nombre, String apPat, String apMat, int numCuenta, int edad, int anioIngreso) {
        this.nombre = nombre;
        this.apPat = apPat;
        this.apMat = apMat;
        this.numCuenta = numCuenta;
        this.edad = edad;
        this.anioIngreso = anioIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPat() {
        return apPat;
    }

    public void setApPat(String apPat) {
        this.apPat = apPat;
    }

    public String getApMat() {
        return apMat;
    }

    public void setApMat(String apMat) {
        this.apMat = apMat;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apPat=" + apPat + ", apMat=" + apMat + ", numCuenta=" + numCuenta + ", edad=" + edad + ", anioIngreso=" + anioIngreso + '}';
    }
    
}
