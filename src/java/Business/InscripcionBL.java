/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import data.InscripcionDL;

import java.util.List;
import model.Inscripcion;

/**
 *
 * @author Adrian Stuar
 */
public class InscripcionBL {
 InscripcionDL inscripcionDL=new InscripcionDL();
    
    public List listar(){
        return inscripcionDL.Listar();
    }
    public void insertar (Inscripcion i){
        inscripcionDL.insertar(i);
    }
    public List buscar(int idInscripcion){
        return inscripcionDL.buscar(idInscripcion);
    }
    public void actualizar(Inscripcion i){
        inscripcionDL.actualizar(i);
    }
    public void eliminar(int idInscripcion){
        inscripcionDL.eliminar(idInscripcion);
    }
}
