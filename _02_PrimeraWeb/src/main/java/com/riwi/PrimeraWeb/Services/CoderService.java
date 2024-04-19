package com.riwi.PrimeraWeb.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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

    /*Servicio para guardar un coder */
    public Coder insert(Coder objCoder){
        return this.objCoderRepository.save(objCoder);
    }

    /*Servicio para actualizar un Coder */
    public Coder Update(Long id ,Coder objCoder){
        /*Buscar al coder con ese ID */
        Coder obCoderDB = this.findById(id);
        /*Verificar que si exista */
        if (obCoderDB == null)return null;

        /*Actualizar el coder antiguo */
        obCoderDB = objCoder;

        //Guardarlo
        return this.objCoderRepository.save(obCoderDB);
    }
    

    /*Encontrar por Id para poder usarlo maas adelante  */
    public Coder findById(Long id){
        return this.objCoderRepository.findById(id).orElse(null);
    }


    /*Servicio para eliminar un Coder */
    public void Delete(Long id, Coder objCoder){
        Coder objCoderDB = this.findById(id);
        if (objCoderDB == null) System.out.println("No se encontro");;
        this.objCoderRepository.delete(objCoderDB);
    }


    /*Metodo para paginacion o listar los coders de forma paginada */
    public Page<Coder> fingPaginated(int page, int size) {
        if (page < 0) {
            page = 1;
        }

        // Crear objeto de paginación
        Pageable objPageable = PageRequest.of(page, size);

        return this.objCoderRepository.findAll(objPageable);
    }





}
