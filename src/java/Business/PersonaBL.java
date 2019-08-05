/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import data.PersonaDL;
import java.util.List;
import model.Persona;


/**
 *
 * @author Adrian Stuar
 */
public class PersonaBL {
    
            PersonaDL personaDL=new PersonaDL();
    
    public List listar(){
        return personaDL.Listar();
    }
    public void insertar (Persona p){
        personaDL.insertar(p);
    }
    public List buscar(int idPersona){
        return personaDL.buscar(idPersona);
    }
    public void actualizar(Persona p){
        personaDL.actualizar(p);
    }
    public void eliminar(int idPersona){
        personaDL.eliminar(idPersona);
    }
}
