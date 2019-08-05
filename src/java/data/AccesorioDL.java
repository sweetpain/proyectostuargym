/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.List;
import model.Accesorio;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Adrian Stuar
 */
public class AccesorioDL {
    Conexion con=new Conexion();
    JdbcTemplate jdbctemplate=new JdbcTemplate(con.conectar());
    List datos;
    
    public List Listar(){
        String sql="SELECT  a.*, ta.nombre as nombreacc from tipoaccesorio ta, accesorio a where ta.idTipoaccesorio=a.idtipoaccesorio";
        datos= jdbctemplate.queryForList(sql);
        return datos;
    }
    
    public void insertar(Accesorio a){
     try{
    String sql="insert into accesorio (idtipoaccesorio,nombre,cantidad,talla,valor,color) values(?,?,?,?,?,?)";
    jdbctemplate.update(sql,a.getIdtipoaccesorio(),a.getNombre(),a.getCantidad(),a.getTalla(),a.getValor(),a.getColor());
    }catch(Exception e){
        System.out.println(e.getMessage());
}
    }
    public List buscar(int idaccesorio){
        String sql="select * from accesorio where idaccesorio="+idaccesorio;
        datos=this.jdbctemplate.queryForList(sql);
        return datos;
    }
    public void actualizar(Accesorio a){
        String sql="update accesorio set idtipoaccesorio=?,  nombre=?, cantidad=? ,talla=? ,valor=? ,color=? where idaccesorio=?";
        jdbctemplate.update(sql,a.getIdtipoaccesorio(),a.getNombre(),a.getCantidad(),a.getTalla(),a.getValor(),a.getColor(),a.getIdaccesorio());
    }
    public void eliminar(int idaccesorio){
        String sql="delete from accesorio where idaccesorio="+idaccesorio;
        this.jdbctemplate.update(sql);
    }
}
