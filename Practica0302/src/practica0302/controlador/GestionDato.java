
package practica0302.controlador;

import Diccionario.Diccionario;
import java.util.HashMap;
import java.util.List;
import practica0302.modelo.Casa;
import practica0302.modelo.Propietario;

public class GestionDato {
    
   
    private HashMap<Propietario, Casa> propietarioMap;
    private List<Casa> casaList;

    public GestionDato(HashMap<Propietario, Casa> propietarioMap, List<Casa> casaList) {
        this.propietarioMap = propietarioMap;
        this.casaList = casaList;
    }

    public HashMap<Propietario, Casa> getPropietarioMap() {
        return propietarioMap;
    }
    public void setPropietarioMap(HashMap<Propietario, Casa> propietarioMap) {
        this.propietarioMap = propietarioMap;
    }
    public List<Casa> getCasaList() {
        return casaList;
    }
    public void setCasaList(List<Casa> casaList) {
        this.casaList = casaList;
    }
    
    
    
    
}
