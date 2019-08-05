/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.List;
import model.Persona;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Adrian Stuar
 */
public class PersonaDL {
     Conexion con=new Conexion();
    JdbcTemplate jdbctemplate=new JdbcTemplate(con.conectar());
    List datos;
    
    public List Listar(){
        String sql="SELECT  p.* ,tp.nombre as nombretipo from tipopersona tp, persona p where tp.idTipopersona=p.idtipopersona";
        datos= jdbctemplate.queryForList(sql);
        return datos;
    }
    
    public void insertar(Persona p){
     try{
    String sql="insert into persona (idtipopersona,nombre,apellido,documento,sexo,correoelectronico,discapacidad,antecedentes) values(?,?,?,?,?,?,?,?)";
    jdbctemplate.update(sql,p.getIdtipopersona(),p.getNombre(),p.getApellido(),p.getDocumento(),p.getSexo(),p.getCorreoelectronico(),p.getDiscapacidad(),p.getAntecedentes());
    }catch(Exception e){
        System.out.println(e.getMessage());
}
    }
    public List buscar(int idPersona){
        String sql="select * from persona where idPersona="+idPersona;
        datos=this.jdbctemplate.queryForList(sql);
        return datos;
    }
    public void actualizar(Persona p){
        String sql="update persona set idtipopersona=?,  nombre=?, apellido=? ,documento=? ,sexo=? ,correoelectronico=?, discapacidad=?, antecedentes=? where idPersona=?";
        jdbctemplate.update(sql,p.getIdtipopersona(),p.getNombre(),p.getApellido(),p.getDocumento(),p.getSexo(),p.getCorreoelectronico(),p.getDiscapacidad(),p.getAntecedentes(),p.getIdPersona());
    }
    public void eliminar(int idPersona){
        String sql="delete from persona where idPersona="+idPersona;
        this.jdbctemplate.update(sql);
    }
}
