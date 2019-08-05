/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Business.AsistenciaBL;
import Business.PersonaBL;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.Asistencia;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Adrian Stuar
 */
public class AsistenciaController {
      ModelAndView mav=new ModelAndView();
   AsistenciaBL asistenciaBL=new AsistenciaBL();
    PersonaBL personaBL=new PersonaBL();
   int id;
   List datos;
   
   @RequestMapping("indexAsistencia.htm")
    public ModelAndView Listar(){
        datos = asistenciaBL.listar();
        mav.addObject("lista", datos);
        mav.setViewName("indexAsistencia");
        return mav;
    }
   @RequestMapping(value="agregarAsistencia.htm",method=RequestMethod.GET)
   public ModelAndView Agregar(){
       mav.addObject(new Asistencia());
       
       datos=personaBL.listar();
       mav.addObject("lista", datos);
       mav.setViewName("agregarAsistencia");
       return mav;
   }
   @RequestMapping(value="agregarAsistencia.htm",method=RequestMethod.POST)
   public ModelAndView Agregar(Asistencia a){
       asistenciaBL.insertar(a);
       return new ModelAndView("redirect:/indexAsistencia.htm");
   }
   @RequestMapping(value="editarAsistencia.htm",method=RequestMethod.GET)
   public ModelAndView Editar(HttpServletRequest request){
     id =Integer.parseInt(request.getParameter("idAsistencia"));
     datos = personaBL.listar();
     mav.addObject("listad", datos);
     datos= asistenciaBL.buscar(id);
     mav.addObject("lista",datos);
     mav.setViewName("editarAsistencia");
     return mav;
   }
   @RequestMapping(value="editarAsistencia.htm",method=RequestMethod.POST)
   public ModelAndView Editar(Asistencia a){
       asistenciaBL.actualizar(a);
       return new ModelAndView("redirect:/indexAsistencia.htm");
   }
   
     @RequestMapping("deleteAsistencia.htm")
    public ModelAndView Delete(HttpServletRequest  request){
        id = Integer.parseInt(request.getParameter("idAsistencia"));
        asistenciaBL.eliminar(id);
        return new ModelAndView("redirect:/indexAsistencia.htm");
    }
}
