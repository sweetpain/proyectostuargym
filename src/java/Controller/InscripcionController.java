/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Business.InscripcionBL;
import Business.NivelBL;
import Business.PersonaBL;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.Inscripcion;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Adrian Stuar
 */
public class InscripcionController {
    
      ModelAndView mav=new ModelAndView();
   NivelBL nivelBL=new NivelBL();
   InscripcionBL inscripcionBL=new InscripcionBL();
    PersonaBL personaBL=new PersonaBL();
   int id;
   List datos;
   
   @RequestMapping("indexInscripcion.htm")
    public ModelAndView Listar(){
        datos = inscripcionBL.listar();
        mav.addObject("lista", datos);
        mav.setViewName("indexInscripcion");
        return mav;
    }
   @RequestMapping(value="agregarInscripcion.htm",method=RequestMethod.GET)
   public ModelAndView Agregar(){
       mav.addObject(new Inscripcion());
       datos=nivelBL.listar();
       mav.addObject("listaNi", datos);
       datos=personaBL.listar();
       mav.addObject("listaPe", datos);
       mav.setViewName("agregarInscripcion");
       return mav;
   }
   @RequestMapping(value="agregarInscripcion.htm",method=RequestMethod.POST)
   public ModelAndView Agregar(Inscripcion i){
       inscripcionBL.insertar(i);
       return new ModelAndView("redirect:/indexInscripcion.htm");
   }
   @RequestMapping(value="editarInscripcion.htm",method=RequestMethod.GET)
   public ModelAndView Editar(HttpServletRequest request){
     id =Integer.parseInt(request.getParameter("idInscripcion"));
     datos=nivelBL.listar();
       mav.addObject("listaNi", datos);
     datos= inscripcionBL.buscar(id);
     mav.addObject("lista",datos);
     datos=personaBL.listar();
       mav.addObject("listaPe", datos);
     mav.setViewName("editarInscripcion");
     return mav;
   }
   @RequestMapping(value="editarInscripcion.htm",method=RequestMethod.POST)
   public ModelAndView Editar(Inscripcion i){
       inscripcionBL.actualizar(i);
       return new ModelAndView("redirect:/indexInscripcion.htm");
   }
   
     @RequestMapping("deleteInscripcion.htm")
    public ModelAndView Delete(HttpServletRequest  request){
        id = Integer.parseInt(request.getParameter("idInscripcion"));
        inscripcionBL.eliminar(id);
        return new ModelAndView("redirect:/indexInscripcion.htm");
    }
}
