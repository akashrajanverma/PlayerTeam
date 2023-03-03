package com.example.demo.controller;

import com.example.demo.dto.PlayerDto;
import com.example.demo.model.Player;
import com.example.demo.repository.PlayerRepo;
import com.example.demo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @GetMapping("/all")
    public List<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    @GetMapping("/{id}")
    public Player getPlayer(@PathVariable("id") long id){
        return playerService.getPlayerById(id).get();
    }

    @PostMapping("/save")
    public Player savePlayer(@RequestBody Player player){
        System.out.println("hiiiii" + player.getName());
        return playerService.save(player);
    }
}
