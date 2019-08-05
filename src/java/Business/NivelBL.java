/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import data.NivelDL;
import java.util.List;
import model.Nivel;

/**
 *
 * @author Adrian Stuar
 */
public class NivelBL {
    NivelDL nivelDL= new NivelDL();
    
    public List  listar(){
        return nivelDL.Listar();
    }
    public void  insertar (Nivel ni){
        nivelDL.insertar(ni);
    }
    public List buscar(int idnivel){
        return nivelDL.buscar(idnivel);
    }
    public void actualizar(Nivel ni){
        nivelDL.actualizar(ni);
    }
     public void eliminar(int idnivel){
        nivelDL.eliminar(idnivel);
    }
}
