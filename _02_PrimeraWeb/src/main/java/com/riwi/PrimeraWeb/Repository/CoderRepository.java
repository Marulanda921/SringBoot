package com.riwi.PrimeraWeb.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.riwi.PrimeraWeb.Entity.Coder;

@Repository
/*Rcibe un genrico despues de extender de jpa */
/*JpaRepositorio al ser extendido recibe 2 parametros que son la entidad y el tipo de dato Long que seria el id de la entidad*/
public interface CoderRepository extends JpaRepository<Coder, Long> {

} 
