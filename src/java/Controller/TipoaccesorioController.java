/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.TipoAccesorioBL;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.Tipoaccesorio;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Adrian Stuar
 */
    @Controller
public class TipoaccesorioController {
   ModelAndView mav=new ModelAndView();
    TipoAccesorioBL tipoaccesorioBL=new TipoAccesorioBL();
    int idTipoaccesorio;
    List datos;
     @RequestMapping("indexTipoaccesorio.htm")
    public ModelAndView Listar(){
        datos = tipoaccesorioBL.listar();
     
        mav.addObject("lista", datos);
        mav.setViewName("indexTipoaccesorio");
        return mav;
    }
    
    @RequestMapping(value="agregarTipoaccesorio.htm",method=RequestMethod.GET)
   public ModelAndView Agregar(){
       mav.addObject(new Tipoaccesorio());
       mav.setViewName("agregarTipoaccesorio");
       return mav;
   }
   
   @RequestMapping(value="agregarTipoaccesorio.htm",method=RequestMethod.POST)
   public ModelAndView Agregar(Tipoaccesorio ta){
       tipoaccesorioBL.insertar(ta);
       return new ModelAndView("redirect:/indexTipoaccesorio.htm");
   }
   
   @RequestMapping(value="editarTipoaccesorio.htm",method=RequestMethod.GET)
   public ModelAndView Editar(HttpServletRequest request){
    idTipoaccesorio=Integer.parseInt(request.getParameter("idTipoaccesorio"));
     datos=tipoaccesorioBL.buscar(idTipoaccesorio);
     mav.addObject("lista",datos);
     mav.setViewName("editarTipoaccesorio");
     return mav;
   }
   
   @RequestMapping(value="editarTipoaccesorio.htm",method=RequestMethod.POST)
   public ModelAndView Editar(Tipoaccesorio ta){
       tipoaccesorioBL.actualizar(ta);
       return new ModelAndView("redirect:/indexTipoaccesorio.htm");
   }
   
   @RequestMapping("deleteTipoaccesorio.htm")
    public ModelAndView Delete(HttpServletRequest  request){
        idTipoaccesorio = Integer.parseInt(request.getParameter("idTipoaccesorio"));
        tipoaccesorioBL.eliminar(idTipoaccesorio);
        return new ModelAndView("redirect:/indexTipoaccesorio.htm");
    }
}
