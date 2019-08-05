/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.List;
import model.Asistencia;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Adrian Stuar
 */
public class AsistenciaDL {
    Conexion con=new Conexion();
    JdbcTemplate jdbctemplate=new JdbcTemplate(con.conectar());
    List datos;
    
    public List Listar(){
        String sql="SELECT  p.*,a.* from asistencia a, persona p where p.idPersona=a.idpersona";
        datos= jdbctemplate.queryForList(sql);
        return datos;
    }
    
    public void insertar(Asistencia a){
     try{
    String sql="insert into asistencia (idpersona,fecha) values(?,?)";
    jdbctemplate.update(sql,a.getIdpersona(),a.getFecha());
    }catch(Exception e){
        System.out.println(e.getMessage());
}
    }
    public List buscar(int idAsistencia){
        String sql="select * from asistencia where idAsistencia="+idAsistencia;
        datos=this.jdbctemplate.queryForList(sql);
        return datos;
    }
    public void actualizar(Asistencia a){
      try{
          String sql="update asistencia set idpersona=?,fecha=? where idAsistencia=?";
    jdbctemplate.update(sql,a.getIdpersona(),a.getFecha(),a.getIdAsistencia());
      }
    catch(Exception e){
    System.out.println(e.getMessage());
}
        
    }
    public void eliminar(int idAsistencia){
      try{
      String sql="delete from asistencia where idAsistencia="+idAsistencia;
        this.jdbctemplate.update(sql);
      } 
       catch(Exception e){
        System.out.println(e.getMessage());
}
    }
}
