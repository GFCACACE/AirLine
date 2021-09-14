package com.codeoftheweb.AirLine.Class;


import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;


@Entity
public class Vuelo {

    @Id
    //No va lo de Generated ya que las ID's las hacemos nosotros
    private String numeroDeVuelo;

    private String destino;

    private Integer capacidad;

    private LocalDate fecha;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="player")
    private Player player; //Un objeto el cual se declara

    public Vuelo() { }

    public Vuelo(String flight, String destination, Integer vacancies, LocalDate flightDate) {
        this.numeroDeVuelo = flight;
        this.destino = destination;
        this.capacidad = vacancies;
        this.fecha = flightDate;
    }

    public String getNumeroDeVuelo() {
        return numeroDeVuelo;
    }

    public void setNumeroDeVuelo(String numeroDeVuelo) {
        this.numeroDeVuelo = numeroDeVuelo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Map<String, Object> makeVueloDTO() {
        Map<String, Object> dto = new LinkedHashMap<>();
        dto.put("destino", this.destino);
        dto.put("capacidad", this.capacidad);
        dto.put("fecha", this.fecha);
        dto.put("vuelo", this.numeroDeVuelo);
        return dto;
    }

}
