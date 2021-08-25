package com.codeoftheweb.AirLine.Class;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

@Entity
public class Vuelo {
    @Id
    //No va lo de Generated ya que las ID's las hacemos nosotros
    private String flight;

    private String destination;

    private Integer vacancies;

    private LocalDate flightDate;

    public Vuelo() {
    }

    public Vuelo(String flight, String destination, Integer vacancies, LocalDate flightDate) {
        this.flight = flight;
        this.destination = destination;
        this.vacancies = vacancies;
        this.flightDate = flightDate;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getVacancies() {
        return vacancies;
    }

    public void setVacancies(Integer vacancies) {
        this.vacancies = vacancies;
    }

    public LocalDate getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(LocalDate flightDate) {
        this.flightDate = flightDate;
    }

    public Map<String, Object> makeVueloDTO() {
        Map<String, Object> dto = new LinkedHashMap<>();
        dto.put("destino", this.destination);
        dto.put("capacidad", this.vacancies);
        dto.put("fecha", this.flightDate);
        dto.put("vuelo", this.flight);
        return dto;
    }

}
