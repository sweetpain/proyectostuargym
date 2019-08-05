/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.List;
import model.Nivel;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Adrian Stuar
 */
public class NivelDL {
     Conexion con= new Conexion();
     JdbcTemplate jdbctemplate=new JdbcTemplate(con.conectar());
     List datos;
     
      public List Listar(){
        String sql="select * from nivel";
        datos= jdbctemplate.queryForList(sql);
        return datos;
    }
    
    public void insertar(Nivel ni){
     try{
    String sql="insert into nivel"
            +"(nombre) values(?)";
    jdbctemplate.update(sql,ni.getNombre());
    }catch(Exception e){
        System.out.println(e.getMessage());
}
    }
    
    public List buscar(int idnivel){
        String sql="select * from nivel where idnivel="+idnivel;
        datos=this.jdbctemplate.queryForList(sql);
        return datos;
    }
    public void actualizar(Nivel ni){
        String sql="update nivel set nombre=? where idnivel=?";
        jdbctemplate.update(sql,ni.getNombre(),ni.getIdnivel());
    }
    public void eliminar(int idnivel){
        String sql="delete from nivel where idnivel="+idnivel;
        this.jdbctemplate.update(sql);
    }
}
