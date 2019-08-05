/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import data.AsistenciaDL;
import java.util.List;
import model.Asistencia;


/**
 *
 * @author Adrian Stuar
 */
public class AsistenciaBL {
       
            AsistenciaDL asistenciaDL=new AsistenciaDL();
    
    public List listar(){
        return asistenciaDL.Listar();
    }
    public void insertar (Asistencia a){
        asistenciaDL.insertar(a);
    }
    public List buscar(int idAsistencia){
        return asistenciaDL.buscar(idAsistencia);
    }
    public void actualizar(Asistencia a){
        asistenciaDL.actualizar(a);
    }
    public void eliminar(int idAsistencia){
        asistenciaDL.eliminar(idAsistencia);
    }
}
