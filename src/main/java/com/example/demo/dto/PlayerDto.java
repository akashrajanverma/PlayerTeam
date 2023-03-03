package com.example.demo.dto;

import com.example.demo.model.Player;
import com.example.demo.model.Team;

public class PlayerDto {
    private long id;
    private String name;
    private int age;
    private String team_name;

    public PlayerDto(Player player){
        this.id =player.getId();
        this.name = player.getName();
        this.age = player.getAge();
        this.team_name = player.getTeam().getName();
    }
}
