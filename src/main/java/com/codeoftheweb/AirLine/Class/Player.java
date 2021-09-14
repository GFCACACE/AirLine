package com.codeoftheweb.AirLine.Class;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.*;
import java.util.stream.Collectors;

@Entity
public class Player {
// Una clase publica se puede usar directamente en todas
    //Una clase privada se tienen que utilizar métodos para alcanzartla

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
    private String userName; //Variable que almacena el nombre
    private String password;


// Un jugador solo tiene opción de unirse a varios gameplayers, que son una lista
    public Player() { }

    public Player(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Map<String, Object> makePlayerDTO(){
        Map<String, Object>     dto=    new LinkedHashMap<>();
        dto.put("id",   this.getId());
        dto.put("email",  this.getUserName());
        //Tomamos los campos que necesitamos para la transferencia de datos
        return dto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}