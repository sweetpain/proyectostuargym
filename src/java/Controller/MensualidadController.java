/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Business.InscripcionBL;
import Business.MensualidadBL;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.Mensualidad;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Adrian Stuar
 */
public class MensualidadController {
    ModelAndView mav=new ModelAndView();
    MensualidadBL mensualidadBL=new MensualidadBL();
    InscripcionBL inscripcionBL=new InscripcionBL();
    int idMensualidad;
    List datos;
     @RequestMapping("indexMensualidad.htm")
    public ModelAndView Listar(){
        datos = mensualidadBL.listar();
     
        mav.addObject("lista", datos);
        mav.setViewName("indexMensualidad");
        return mav;
    }
    
    @RequestMapping(value="agregarMensualidad.htm",method=RequestMethod.GET)
   public ModelAndView Agregar(){
       mav.addObject(new Mensualidad());
       datos=inscripcionBL.listar();
       mav.addObject("lista", datos);
       mav.setViewName("agregarMensualidad");
       return mav;
   }
   
   @RequestMapping(value="agregarMensualidad.htm",method=RequestMethod.POST)
   public ModelAndView Agregar(Mensualidad me){
       mensualidadBL.insertar(me);
       return new ModelAndView("redirect:/indexMensualidad.htm");
   }
   
   @RequestMapping(value="editarMensualidad.htm",method=RequestMethod.GET)
   public ModelAndView Editar(HttpServletRequest request){
    idMensualidad=Integer.parseInt(request.getParameter("idMensualidad"));
     datos=mensualidadBL.buscar(idMensualidad);
     mav.addObject("lista",datos);
  
     mav.setViewName("editarMensualidad");
     return mav;
   }
   
   @RequestMapping(value="editarMensualidad.htm",method=RequestMethod.POST)
   public ModelAndView Editar(Mensualidad me){
       mensualidadBL.actualizar(me);
       return new ModelAndView("redirect:/indexMensualidad.htm");
   }
   
   @RequestMapping("deleteMensualidad.htm")
    public ModelAndView Delete(HttpServletRequest  request){
        idMensualidad = Integer.parseInt(request.getParameter("idMensualidad"));
        mensualidadBL.eliminar(idMensualidad);
        return new ModelAndView("redirect:/indexMensualidad.htm");
    }
}
