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
@RestController
public class AirLineController {

    @Autowired
    public VueloRepository vueloRepository;


//    @GetMapping("/searchFlights")
//    public Map<String, Object> getVueloDTO() {
//        Map<String, Object> dto = new LinkedHashMap<>();
//
//        dto.put("vueloes", vueloRepository.findAll()
//                .stream()
//                .map(vuelo -> vuelo.makeVueloDTO())
//                .collect(Collectors.toList())
//        );
//        return dto;
//    }



    @GetMapping("/searchFlights")
    @ResponseBody
    public ResponseEntity<List<Vuelo>> getVuelo(@RequestParam(required = false)String destino,
                                                @RequestParam(required = false) String fecha){

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

//    @GetMapping("/searchFlights")
//    @ResponseBody
//    public ResponseEntity<List<Vuelo>> getVuelo(@RequestParam(required = false)String destino,
//                                                @RequestParam(required = false) LocalDate fecha ){
//
//        return ResponseEntity< >(vueloRepository.findAll()
//                .stream().filter(vuelo -> vuelo.getDestination().equals(destino))
//                .collect(Collectors.toList()), HttpStatus.ACCEPTED);
//
//
//    }
}