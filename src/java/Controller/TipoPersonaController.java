/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Business.TipoPersonaBL;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.TipoPersona;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Adrian Stuar
 */
public class TipoPersonaController {
     ModelAndView mav=new ModelAndView();
    TipoPersonaBL tipopersonaBL=new TipoPersonaBL();
    int idTipopersona;
    List datos;
     @RequestMapping("indexTipopersona.htm")
    public ModelAndView Listar(){
        datos = tipopersonaBL.listar();
     
        mav.addObject("lista", datos);
        mav.setViewName("indexTipopersona");
        return mav;
    }
    
    @RequestMapping(value="agregarTipopersona.htm",method=RequestMethod.GET)
   public ModelAndView Agregar(){
       mav.addObject(new TipoPersona());
       mav.setViewName("agregarTipopersona");
       return mav;
   }
   
   @RequestMapping(value="agregarTipopersona.htm",method=RequestMethod.POST)
   public ModelAndView Agregar(TipoPersona ta){
       tipopersonaBL.insertar(ta);
       return new ModelAndView("redirect:/indexTipopersona.htm");
   }
   
   @RequestMapping(value="editarTipopersona.htm",method=RequestMethod.GET)
   public ModelAndView Editar(HttpServletRequest request){
    idTipopersona=Integer.parseInt(request.getParameter("idTipopersona"));
     datos=tipopersonaBL.buscar(idTipopersona);
     mav.addObject("lista",datos);
     mav.setViewName("editarTipopersona");
     return mav;
   }
   
   @RequestMapping(value="editarTipopersona.htm",method=RequestMethod.POST)
   public ModelAndView Editar(TipoPersona tp){
       tipopersonaBL.actualizar(tp);
       return new ModelAndView("redirect:/indexTipopersona.htm");
   }
   
   @RequestMapping("deleteTipopersona.htm")
    public ModelAndView Delete(HttpServletRequest  request){
        idTipopersona = Integer.parseInt(request.getParameter("idTipopersona"));
        tipopersonaBL.eliminar(idTipopersona);
        return new ModelAndView("redirect:/indexTipopersona.htm");
    }
}
