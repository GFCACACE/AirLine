package com.codeoftheweb.AirLine.Repository;


import com.codeoftheweb.AirLine.Class.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VueloRepository extends JpaRepository<Vuelo, Long> {

//Otra alternativa al filtrado es el FindBy
}
