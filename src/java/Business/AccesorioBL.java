/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import data.AccesorioDL;
import java.util.List;
import model.Accesorio;

/**
 *
 * @author Adrian Stuar
 */
public class AccesorioBL {
        AccesorioDL accesorioDl=new AccesorioDL();
    
    public List listar(){
        return accesorioDl.Listar();
    }
    public void insertar (Accesorio a){
        accesorioDl.insertar(a);
    }
    public List buscar(int idaccesorio){
        return accesorioDl.buscar(idaccesorio);
    }
    public void actualizar(Accesorio a){
        accesorioDl.actualizar(a);
    }
    public void eliminar(int idaccesorio){
        accesorioDl.eliminar(idaccesorio);
    }
}
