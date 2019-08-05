/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import data.TipoPersonaDL;
import java.util.List;
import model.TipoPersona;


/**
 *
 * @author Adrian Stuar
 */
public class TipoPersonaBL {
    TipoPersonaDL pipopersonaDL= new TipoPersonaDL();
    
    public List  listar(){
        return pipopersonaDL.Listar();
    }
    public void  insertar (TipoPersona tp){
        pipopersonaDL.insertar(tp);
    }
    public List buscar(int idTipopersona){
        return pipopersonaDL.buscar(idTipopersona);
    }
    public void actualizar(TipoPersona tp){
        pipopersonaDL.actualizar(tp);
    }
     public void eliminar(int idTipopersona){
        pipopersonaDL.eliminar(idTipopersona);
    }
}
