/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica0302.vista;

import Diccionario.Diccionario;
import Lista.Lista;
import java.util.ArrayList;
import java.util.List;
import practica0302.modelo.Propietario;
/**
 *
 * @author pedro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Propietario> pL = new ArrayList<Propietario>();
        Lista l = new Lista(pL);
        Propietario p1 = new Propietario(1, "Antonio Torres", 19, "020205050");
        l.agregarElemento(p1);
        System.out.println(l);
        
        
    }
    
}
