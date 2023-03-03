package com.example.demo.dto;

import com.example.demo.model.Player;

import java.util.List;

public class TeamDto {
    private long id;
    private String name;
    private List<Player> players;

    public TeamDto(long id, String name){
        this.id = id;
        this.name = name;
    }
}
