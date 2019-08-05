/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.List;
import model.Mensualidad;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Adrian Stuar
 */
public class MensualidadDL {
     Conexion con= new Conexion();
     JdbcTemplate jdbctemplate=new JdbcTemplate(con.conectar());
     List datos;
     
      public List Listar(){
        String sql="select me.*,i.costo as costo from mensualidad me, inscripcion i where i.idInscripcion=me.idinscripcion";
        datos= jdbctemplate.queryForList(sql);
        return datos;
    }
    
    public void insertar(Mensualidad me){
     try{
    String sql="insert into mensualidad (idinscripcion,valor,mes,anio,fecha) values(?,?,?,?,?)";
    jdbctemplate.update(sql,me.getIdinscripcion(),me.getValor(),me.getMes(),me.getAnio(),me.getFecha());
    }catch(Exception e){
        System.out.println(e.getMessage());
}
    }
    
    public List buscar(int idMensualidad){
        String sql="select * from mensualidad where idMensualidad="+idMensualidad;
        datos=this.jdbctemplate.queryForList(sql);
        return datos;
    }
    public void actualizar(Mensualidad me){
        String sql="update mensualidad set  valor=?,mes=?,anio=?,fecha=? where idMensualidad=?";
        jdbctemplate.update(sql,me.getValor(),me.getMes(),me.getAnio(),me.getFecha(),me.getIdMensualidad());
    }
    public void eliminar(int idMensualidad){
        String sql="delete from mensualidad where idMensualidad="+idMensualidad;
        this.jdbctemplate.update(sql);
    }
}
