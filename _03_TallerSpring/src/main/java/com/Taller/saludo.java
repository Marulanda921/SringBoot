package com.Taller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller

@RequestMapping("/controller")
public class saludo {
      /*Crea una ruta especifica para el metodo */
      @GetMapping("/holamundo")

      /*ResponseBody nos permite responder en el navegador */
      @ResponseBody
      public String MostrarMensaje (){
          return "hola mundo";
      }
}
