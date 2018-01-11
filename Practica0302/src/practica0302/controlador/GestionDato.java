
package practica0302.controlador;

import Diccionario.Diccionario;
import java.util.HashMap;
import java.util.List;
import practica0302.modelo.Casa;
import practica0302.modelo.Propietario;

public class GestionDato {
   
    /*private HashMap<Propietario, Casa> propietarioMap;
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
    }*/
    public int[] vector(int[] vector, int id)
    {
        int i=0;
        int j=0;
        int cont=0;
        int cont2=0;
        
        for(i=0;i<vector.length;i++)
        {
            cont++;
            for(j=i+1; j<vector.length;j++)
            {
                cont++;
                if(vector[i] > vector[j])
                {
                    int aux = vector[i];
                    vector[i] = vector[j];
                    cont2++;
                    vector[j] = aux;
                    cont2++;
                }
            }
        }
    return vector;
    }
    
    public void impVect(int vector[])
    {
        for(int i=0;i<vector.length;i++)
        {
            System.out.print("|" +vector[i]);
        }
    }
    
}
