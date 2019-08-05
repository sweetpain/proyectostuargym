/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.List;
import model.Inscripcion;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Adrian Stuar
 */
public class InscripcionDL {
    Conexion con=new Conexion();
    JdbcTemplate jdbctemplate=new JdbcTemplate(con.conectar());
    List datos;
    
    public List Listar(){
        String sql="SELECT ins.*, ni.nombre as nomnivel, per.nombre as nompersona, per.documento as docpersona \n" +
"FROM inscripcion ins, nivel ni,persona per \n" +
"WHERE ni.idnivel=ins.idNivel and per.idPersona=ins.idpersona";
        datos= jdbctemplate.queryForList(sql);
        return datos;
    }
    
    public void insertar(Inscripcion i){
     try{
    String sql="insert into inscripcion (idNivel,idpersona,fecha,costo) values(?,?,?,?)";
    jdbctemplate.update(sql,i.getIdNivel(),i.getIdpersona(),i.getFecha(),i.getCosto());
    }catch(Exception e){
        System.out.println(e.getMessage());
}
    }
    public List buscar(int idInscripcion){
        String sql="select * from inscripcion where idInscripcion="+idInscripcion;
        datos=this.jdbctemplate.queryForList(sql);
        return datos;
    }
    public void actualizar(Inscripcion i){
        try{
         String sql="update inscripcion set idNivel=?,  idpersona=?, fecha=? ,costo=?  where idInscripcion=?";
        jdbctemplate.update(sql,i.getIdNivel(),i.getIdpersona(),i.getFecha(),i.getCosto(),i.getIdInscripcion());
        }
       catch(Exception e){
        System.out.println(e.getMessage());
}
    }
    public void eliminar(int idInscripcion){
        String sql="delete from inscripcion where idInscripcion="+idInscripcion;
        this.jdbctemplate.update(sql);
    }
}
