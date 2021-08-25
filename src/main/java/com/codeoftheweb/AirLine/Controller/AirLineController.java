package com.codeoftheweb.AirLine.Controller;

import com.codeoftheweb.AirLine.Class.Vuelo;
import com.codeoftheweb.AirLine.Repository.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RequestMapping("/api")
@RestController
public class AirLineController {

    @Autowired
    public VueloRepository vueloRepository;


    @GetMapping("/searchFlight")
    public Map<String, Object> getVueloDTO() {
        Map<String, Object> dto = new LinkedHashMap<>();

        dto.put("vueloes", vueloRepository.findAll()
                .stream()
                .map(vuelo -> vuelo.makeVueloDTO())
                .collect(Collectors.toList())
        );
        return dto;
    }
}