/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import data.TipoaccesorioDL;
import java.util.List;
import model.Tipoaccesorio;


/**
 *
 * @author Adrian Stuar
 */
public class TipoAccesorioBL {
      TipoaccesorioDL tipoaccesorioDL= new TipoaccesorioDL();
    
    public List  listar(){
        return tipoaccesorioDL.Listar();
    }
    public void  insertar (Tipoaccesorio ta){
        tipoaccesorioDL.insertar(ta);
    }
    public List buscar(int idtipoaccesorio){
        return tipoaccesorioDL.buscar(idtipoaccesorio);
    }
    public void actualizar(Tipoaccesorio ta){
        tipoaccesorioDL.actualizar(ta);
    }
     public void eliminar(int idTipoaccesorio){
        tipoaccesorioDL.eliminar(idTipoaccesorio);
    }
}
