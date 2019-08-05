/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.List;
import model.Tipoaccesorio;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Adrian Stuar
 */
public class TipoaccesorioDL {
    Conexion con= new Conexion();
     JdbcTemplate jdbctemplate=new JdbcTemplate(con.conectar());
    List datos;
      public List Listar(){
        String sql="select * from tipoaccesorio";
        datos= jdbctemplate.queryForList(sql);
        return datos;
    }
    
    public void insertar(Tipoaccesorio ta){
     try{
    String sql="insert into tipoaccesorio"
            +"(nombre) values(?)";
    jdbctemplate.update(sql,ta.getNombre());
    }catch(Exception e){
        System.out.println(e.getMessage());
}
    }
    
    public List buscar(int idTipoaccesorio){
        String sql="select * from tipoaccesorio where idtipoaccesorio="+idTipoaccesorio;
        datos=this.jdbctemplate.queryForList(sql);
        return datos;
    }
    public void actualizar(Tipoaccesorio ta){
        String sql="update tipoaccesorio  set nombre=? where idtipoaccesorio=?";
        jdbctemplate.update(sql,ta.getNombre(),ta.getIdTipoaccesorio());
    }
    public void eliminar(int idTipoaccesorio){
        String sql="delete from tipoaccesorio where idTipoaccesorio="+idTipoaccesorio;
        this.jdbctemplate.update(sql);
    }
}
