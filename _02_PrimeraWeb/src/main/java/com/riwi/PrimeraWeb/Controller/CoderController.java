package com.riwi.PrimeraWeb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.riwi.PrimeraWeb.Entity.Coder;
import com.riwi.PrimeraWeb.Services.CoderService;

@Controller
@RequestMapping("/")
public class CoderController {
    @Autowired
    private CoderService objCoderService;

    /*Metodo para mostrar la lista y enviarle la lista de coders */
    @GetMapping
    /*es un objeto que conecta HTML CON JAVA se importa de olg.Springboot.ui */
    /*Conecta la vista con el codigo */
    public String showViewGetAll(Model objModel){
        /*llamo al servicio y guardo la lista de coders*/
         List<Coder> list = this.objCoderService.findAll();

        /*medio de transporte que comunica java con html - es el conector LLave y valor*/
         objModel.addAttribute("coderList", list);

         /*Retornamos como se va a llamar la vista*/
        return "viewCoder";

    }
    /*en template se usa para html o las vistas */

    @GetMapping("/form")
    public String showViewFormCoder(){
        return "viewForm";
    }
}
