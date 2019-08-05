/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import data.MensualidadDL;
import java.util.List;
import model.Mensualidad;


/**
 *
 * @author Adrian Stuar
 */
public class MensualidadBL {
  
     MensualidadDL mensualidadDL= new MensualidadDL();
    
    public List  listar(){
        return mensualidadDL.Listar();
    }
    public void  insertar (Mensualidad me){
        mensualidadDL.insertar(me);
    }
    public List buscar(int idMensualidad){
        return mensualidadDL.buscar(idMensualidad);
    }
    public void actualizar(Mensualidad me){
        mensualidadDL.actualizar(me);
    }
     public void eliminar(int idMensualidad){
        mensualidadDL.eliminar(idMensualidad);
    }
}
