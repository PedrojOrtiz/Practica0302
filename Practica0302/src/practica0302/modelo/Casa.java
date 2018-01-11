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
public class Casa {
    
    private int id;
    private Propietario propietario;
    private String ubicacion;

    public Casa(int id, Propietario propietario, String ubicacion) {
        this.id = id;
        this.propietario = propietario;
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "__Casa__" + "|id: " + id + propietario + "\nUbicacion: " + ubicacion +"\n";
    }
    
    
    
}
