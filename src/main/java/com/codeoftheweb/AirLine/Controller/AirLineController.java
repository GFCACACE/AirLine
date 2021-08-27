package com.codeoftheweb.AirLine.Controller;

import com.codeoftheweb.AirLine.Class.Vuelo;
import com.codeoftheweb.AirLine.Repository.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/api")
// para cualquier tipo de petición
@RestController
public class AirLineController {

    @Autowired
    public VueloRepository vueloRepository;

//tipos de peticiones:
//@GetMapping
//@PostMapping
//@PutMapping

    @GetMapping("/searchFlights")
    //para una petición de tipo get
    @ResponseBody
    public ResponseEntity<List<Vuelo>> getVuelo(@RequestParam(required = false)String destino,
                                                @RequestParam(required = false) String fecha){

        // localhost:8080/api/searcFlights?destino=

//DateTimeFormatter format= DateTimeFormatter.ofPattern("yyyy-MM-dd")
        if(destino != null && fecha != null) {
            return new ResponseEntity<>(vueloRepository.findAll().stream()
                    .filter(vuelo -> vuelo.getFecha().toString().equals(fecha) && vuelo.getDestino().equals(destino))
                    //Otra alternativa al filtrado es el FindBy
                    .collect(Collectors.toList()), HttpStatus.ACCEPTED);
        }
        else if(destino != null){
            return new ResponseEntity<>(vueloRepository.findAll().stream().filter(vuelo -> vuelo.getDestino().equals(destino))
                    .collect(Collectors.toList()), HttpStatus.ACCEPTED);
        }
        else if (fecha != null ){
            return new ResponseEntity<>(vueloRepository.findAll().stream().filter(vuelo -> vuelo.getFecha().toString().equals(fecha))
                    .collect(Collectors.toList()), HttpStatus.ACCEPTED);
        }
            return new ResponseEntity<>(vueloRepository.findAll(), HttpStatus.ACCEPTED);
    }
    //Con los if tengo un mayor control sobre las condiciones
}