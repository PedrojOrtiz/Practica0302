/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica0302.modelo;

/**
 *
 * @author pedro
 */
public class Propietario {
    
    private int id;
    private String nombre;
    private int edad;
    private String cedula;

    public Propietario(int id, String nombre, int edad, String cedula) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "\n__Propietario__" + "|id: " + id + "\nNombre: " + nombre + "\nEdad: " + edad + "\nCedula: " + cedula;
    }
    
    
    
}
