package com.riwi.PrimeraWeb.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.riwi.PrimeraWeb.Entity.Coder;
import com.riwi.PrimeraWeb.Services.CoderService;

@Controller
@RequestMapping("/")
public class CoderController {
    @Autowired
    private CoderService objCoderService;

    /*Metodo para mostrar la lista y enviarle la lista de coders */




    @GetMapping
    public String showViewGetAll(Model objModel, @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "3") int size) {
        // LLamo el servicio y guardo la lista de coders
        Page<Coder> list = this.objCoderService.fingPaginated(page - 1, size);
        objModel.addAttribute("coderList", list); // Llave- valor
        objModel.addAttribute("currentPage", page); // Llave- valor
        objModel.addAttribute("totalPages", list.getTotalPages());// Llave- valor

        // Se debe retornar el nombre exacto de la vista html
        return "viewCoder";
    }




    /*en template se usa para html o las vistas */

    @GetMapping("/form")
    public String showViewFormCoder(Model objModel){
        objModel.addAttribute("coder", new Coder());
        objModel.addAttribute("action", "/coder/create");
        return "viewForm";
    }



    /*CUando el usuario le da enviar*/
    @PostMapping("/coder/create")

    /* Metodo para insertar un coder medianto el verbo post  */
    /* Model attribute se encarga de objtener la informacion enviada desde la vista */
    /* @modelattribute + tipo de dato que va a recibir de la vida (CODER)  + darle un nombre */
    public String createCoder(@ModelAttribute Coder objCoder){
        /*llamamos al servicio para que insete enviandole el coder a insertar */
        this.objCoderService.insert(objCoder);
        return "redirect:/";
    }

    /*HTML PASA AL MODELO EL OBJETO, EL MODELO AL CONTROLADOR, EL CONTROLADOR AL SERVICIO, EL SERVICIO AL REPOSITORY Y EL REPOSITORY LO GUARDA EN LA BD*/




    /*Actualizar Datos metodo para mostrar el formulario de actualizar un Coder */
    @GetMapping("/update/{id}")
    public String showFormUpdate(@PathVariable Long id, Model objModel){
        Coder objCoderFind = this.objCoderService.findById(id);
        objModel.addAttribute("coder", objCoderFind);
        objModel.addAttribute("action", "/edit/" + id);
        return "viewForm";
    }



/*Metodo para actulizar */
@PostMapping("/edit/{id}")
public String UpadateCoder(@PathVariable Long id, @ModelAttribute Coder obCoder){
    this.objCoderService.Update(id, obCoder);
    /*Es palabra clave para dirigir */
    return "redirect:/";
}


/*Metodo para eliminar */
@GetMapping("/delete/{id}")
public String deleteCoder(@PathVariable Long id, @ModelAttribute Coder obCoder){
    this.objCoderService.Delete(id, obCoder);
    /*Es palabra clave para dirigir */
    return "redirect:/";
}

}









// QUE ES LA PAGINACION, HACER QUE LOS DATOS NO SE MUESTREN DE UNA VEZ, DISEÑO O RAPIDES O FUNCIONALIDAD DE LA BASE DE DATOS
