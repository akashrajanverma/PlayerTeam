package com.example.demo.service;

import com.example.demo.model.Player;
import com.example.demo.model.Team;
import com.example.demo.repository.PlayerRepo;
import com.example.demo.repository.TeamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {
//    @Autowired
//    private PlayerRepo playerRepo;
//
//    @Autowired
//    private TeamRepo teamRepo;
//
//    public List<Player> getAllPlayers(){
//        return playerRepo.findAll();
//    }
//
//    public Optional<Player> getPlayerById(long id){
//        return playerRepo.findById(id);
//    }
//
//    public Player save(Player player){
//        Team team = teamRepo.findById(player.getTeam().getId()).orElse(null);
//        if (null == team)
//            team = new Team();
//        team.setName(player.getTeam().getName());
//        player.setTeam(team);
//        return playerRepo.save(player);
//    }
}
