/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Business.PersonaBL;
import Business.TipoPersonaBL;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.Persona;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Adrian Stuar
 */
public class PersonaController {
     ModelAndView mav=new ModelAndView();
   TipoPersonaBL tipopersonaBL=new TipoPersonaBL();
    PersonaBL personaBL=new PersonaBL();
   int id;
   List datos;
   
   @RequestMapping("indexPersona.htm")
    public ModelAndView Listar(){
        datos = personaBL.listar();
        mav.addObject("lista", datos);
        mav.setViewName("indexPersona");
        return mav;
    }
   @RequestMapping(value="agregarPersona.htm",method=RequestMethod.GET)
   public ModelAndView Agregar(){
       mav.addObject(new Persona());
       datos=tipopersonaBL.listar();
       mav.addObject("lista", datos);
       mav.setViewName("agregarPersona");
       return mav;
   }
   @RequestMapping(value="agregarPersona.htm",method=RequestMethod.POST)
   public ModelAndView Agregar(Persona p){
       personaBL.insertar(p);
       return new ModelAndView("redirect:/indexPersona.htm");
   }
   @RequestMapping(value="editarPersona.htm",method=RequestMethod.GET)
   public ModelAndView Editar(HttpServletRequest request){
     id =Integer.parseInt(request.getParameter("idPersona"));
     datos = tipopersonaBL.listar();
     mav.addObject("listad", datos);
     datos= personaBL.buscar(id);
     mav.addObject("lista",datos);
     mav.setViewName("editarPersona");
     return mav;
   }
   @RequestMapping(value="editarPersona.htm",method=RequestMethod.POST)
   public ModelAndView Editar(Persona p){
       personaBL.actualizar(p);
       return new ModelAndView("redirect:/indexPersona.htm");
   }
   
     @RequestMapping("deletePersona.htm")
    public ModelAndView Delete(HttpServletRequest  request){
        id = Integer.parseInt(request.getParameter("idPersona"));
        personaBL.eliminar(id);
        return new ModelAndView("redirect:/indexPersona.htm");
    }
}
