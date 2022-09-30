
package com.co;

//Anotaciones 

import com.co.dao.EstudianteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ControInicio {
    @Autowired
    private EstudianteDAO estudianteDao;
    
    @GetMapping("/") //se deb importar
    public String inicio(){
        return "index";
    }
    //----------------------------------------------
    @GetMapping("/login") 
    public String finicio_sesion(){
        return "formsD";
    }
    
    @GetMapping("/admin")
    public String loginadmin(Model model){
        var est = estudianteDao.findAll();
        model.addAttribute("est", est);
        return "admin";
    }
    
   
    @GetMapping("/registrar")
    public String registrar(){
        return "registrar";
    }
    
    //-----------------------------------------------
    
    @GetMapping("/nosotros") 
    public String nosotros(){
        return "nosotros";
    }
    @GetMapping("/sedes")
    public String sedes(){
        return "sedes";
    }
    
    
}
