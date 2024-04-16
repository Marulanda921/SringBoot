package com.riwi.holamundo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/*Indica que esta clase sera un controlador*/
@Controller

/*Request Mapping Crea la ruta base del controlador */
@RequestMapping("/controller")
public class holaMundo {

    /*Crea una ruta especifica para el metodo */
    @GetMapping("/holamundo")

    /*ResponseBody nos permite responder en el navegador */
    @ResponseBody
    public String MostrarMensaje (){
        return "hola mundo";
    }


    @GetMapping("/sumatoria")
    @ResponseBody
    public Integer sumatoria (){
        return  2 + 1;
    }
}
