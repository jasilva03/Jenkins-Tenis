package com.ariel.tenis.controller;

import com.ariel.tenis.domain.Player;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("players")
public class PlayerController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Player> getAll() {

        List<Player> listPlayers = new ArrayList<>(Arrays.asList(new Player("Rolo", "Rojas")));
        return  listPlayers;

    }

}
