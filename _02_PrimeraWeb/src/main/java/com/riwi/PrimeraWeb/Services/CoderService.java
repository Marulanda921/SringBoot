package com.riwi.PrimeraWeb.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riwi.PrimeraWeb.Entity.Coder;
import com.riwi.PrimeraWeb.Repository.CoderRepository;

@Service
public class CoderService {
    /*Se establece la inyeccion de dependencias */
    /*Con auto wired le estamos diciendo a springboot que es una inyeccion de dependencias */
    @Autowired
    private CoderRepository objCoderRepository;



    /*Servicio para listar todos los coders */
    public List<Coder> findAll(){
        /*Aqui se pueden hacer validaciones aunque finAll no necesita validaciones */
        return this.objCoderRepository.findAll();
    }

}
