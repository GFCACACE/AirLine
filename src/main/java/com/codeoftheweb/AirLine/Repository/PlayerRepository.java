package com.codeoftheweb.AirLine.Repository;

import com.codeoftheweb.AirLine.Class.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PlayerRepository extends JpaRepository<Player, Long> {

    Player findByUserName(@Param("userName") String userName);
//param es utilizado para realizar Querys
}