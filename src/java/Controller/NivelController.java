/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Business.NivelBL;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.Nivel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Adrian Stuar
 */
public class NivelController {
    ModelAndView mav=new ModelAndView();
    NivelBL nivelBL=new NivelBL();
    int idnivel;
    List datos;
     @RequestMapping("indexNivel.htm")
    public ModelAndView Listar(){
        datos = nivelBL.listar();
     
        mav.addObject("lista", datos);
        mav.setViewName("indexNivel");
        return mav;
    }
    
    @RequestMapping(value="agregarNivel.htm",method=RequestMethod.GET)
   public ModelAndView Agregar(){
       mav.addObject(new Nivel());
       mav.setViewName("agregarNivel");
       return mav;
   }
   
   @RequestMapping(value="agregarNivel.htm",method=RequestMethod.POST)
   public ModelAndView Agregar(Nivel ni){
       nivelBL.insertar(ni);
       return new ModelAndView("redirect:/indexNivel.htm");
   }
   
   @RequestMapping(value="editarNivel.htm",method=RequestMethod.GET)
   public ModelAndView Editar(HttpServletRequest request){
    idnivel=Integer.parseInt(request.getParameter("idnivel"));
     datos=nivelBL.buscar(idnivel);
     mav.addObject("lista",datos);
     mav.setViewName("editarNivel");
     return mav;
   }
   
   @RequestMapping(value="editarNivel.htm",method=RequestMethod.POST)
   public ModelAndView Editar(Nivel ni){
       nivelBL.actualizar(ni);
       return new ModelAndView("redirect:/indexNivel.htm");
   }
   
   @RequestMapping("deleteNivel.htm")
    public ModelAndView Delete(HttpServletRequest  request){
        idnivel = Integer.parseInt(request.getParameter("idnivel"));
        nivelBL.eliminar(idnivel);
        return new ModelAndView("redirect:/indexNivel.htm");
    }
}
