/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica0302.vista;

import Diccionario.Diccionario;
import Lista.Lista;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import practica0302.controlador.GestionDato;
import practica0302.modelo.Casa;
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
        
        Propietario p1 = new Propietario(1, "Antonio Torres", 19, "0105534614");
        Propietario p2 = new Propietario(2, "Jose Solis", 45, "0105254614");
        Propietario p3 = new Propietario(3, "Pedro solis", 34, "01059834614");
        Propietario p4 = new Propietario(4, "Daniel Torres", 19, "0124534614");
        
        l.agregarElemento(p1);
        l.agregarElemento(p2);
        l.agregarElemento(p3);
        l.agregarElemento(p4);
        
        System.out.println(pL.toString());
        
        HashMap<Casa, Propietario> cL = new HashMap<Casa, Propietario>();
        Diccionario d = new Diccionario(cL, pL);
        
        Casa c1 = new Casa(1,p1,"Gran Colombia");
        Casa c2 = new Casa(2,p1,"Gran Tomas");
        Casa c3 = new Casa(3,p1,"Sangurachi");
        Casa c4 = new Casa(4,p2,"Hereos de loma verde");
        Casa c5 = new Casa(5,p3,"Moviemiento naranja");
        Casa c6 = new Casa(6,p3,"Av. 11 de enero");
        Casa c7 = new Casa(7,p4,"Calle Nueva");
        
        d.agregarElemento(c1, p1);
        d.agregarElemento(c2, p1);
        d.agregarElemento(c3, p1);
        d.agregarElemento(c4, p2);
        d.agregarElemento(c5, p3);
        d.agregarElemento(c6, p3);
        d.agregarElemento(c7, p4);
        
        /*int vector = new int[];
        GestionDato GD = new GestionDato();
        GD.vector(vector, 0)
        */
        
        
        System.out.println(cL.toString());
        
        
        
    }
    
}
