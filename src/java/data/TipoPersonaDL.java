/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.List;
import model.TipoPersona;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Adrian Stuar
 */
public class TipoPersonaDL {
        Conexion con= new Conexion();
     JdbcTemplate jdbctemplate=new JdbcTemplate(con.conectar());
    List datos;
      public List Listar(){
        String sql="select * from tipopersona";
        datos= jdbctemplate.queryForList(sql);
        return datos;
    }
    
    public void insertar(TipoPersona tp){
     try{
    String sql="insert into tipopersona"
            +"(nombre) values(?)";
    jdbctemplate.update(sql,tp.getNombre());
    }catch(Exception e){
        System.out.println(e.getMessage());
}
    }
    
    public List buscar(int idTipopersona){
        String sql="select * from tipopersona where idTipopersona="+idTipopersona;
        datos=this.jdbctemplate.queryForList(sql);
        return datos;
    }
    public void actualizar(TipoPersona tp){
        String sql="update tipopersona  set nombre=? where idTipopersona=?";
        jdbctemplate.update(sql,tp.getNombre(),tp.getIdTipopersona());
    }
    public void eliminar(int idTipopersona){
        String sql="delete from tipopersona where idTipopersona="+idTipopersona;
        this.jdbctemplate.update(sql);
    }
}
