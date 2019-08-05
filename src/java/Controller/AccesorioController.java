/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.AccesorioBL;
import Business.TipoAccesorioBL;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.Accesorio;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Adrian Stuar
 */
public class AccesorioController {
     ModelAndView mav=new ModelAndView();
   TipoAccesorioBL tipoaccesorioBL=new TipoAccesorioBL();
    AccesorioBL accesorioBL=new AccesorioBL();
   int id;
   List datos;
   
   @RequestMapping("indexAccesorio.htm")
    public ModelAndView Listar(){
        datos = accesorioBL.listar();
        mav.addObject("lista", datos);
        mav.setViewName("indexAccesorio");
        return mav;
    }
   @RequestMapping(value="agregarAccesorio.htm",method=RequestMethod.GET)
   public ModelAndView Agregar(){
       mav.addObject(new Accesorio());
       datos=tipoaccesorioBL.listar();
       mav.addObject("lista", datos);
       mav.setViewName("agregarAccesorio");
       return mav;
   }
   @RequestMapping(value="agregarAccesorio.htm",method=RequestMethod.POST)
   public ModelAndView Agregar(Accesorio a){
       accesorioBL.insertar(a);
       return new ModelAndView("redirect:/indexAccesorio.htm");
   }
   @RequestMapping(value="editarAccesorio.htm",method=RequestMethod.GET)
   public ModelAndView Editar(HttpServletRequest request){
     id =Integer.parseInt(request.getParameter("idaccesorio"));
     datos = tipoaccesorioBL.listar();
     mav.addObject("listad", datos);
     datos= accesorioBL.buscar(id);
     mav.addObject("lista",datos);
     mav.setViewName("editarAccesorio");
     return mav;
   }
   @RequestMapping(value="editarAccesorio.htm",method=RequestMethod.POST)
   public ModelAndView Editar(Accesorio a){
       accesorioBL.actualizar(a);
       return new ModelAndView("redirect:/indexAccesorio.htm");
   }
   
     @RequestMapping("deleteAccesorio.htm")
    public ModelAndView Delete(HttpServletRequest  request){
        id = Integer.parseInt(request.getParameter("idaccesorio"));
        accesorioBL.eliminar(id);
        return new ModelAndView("redirect:/indexAccesorio.htm");
    }
}
