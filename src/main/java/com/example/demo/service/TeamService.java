package com.example.demo.service;

import com.example.demo.model.Player;
import com.example.demo.model.Team;
import com.example.demo.repository.PlayerRepo;
import com.example.demo.repository.TeamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService {
    @Autowired
    private TeamRepo teamRepo;

    @Autowired
    private PlayerRepo playerRepo;

    public List<Team> fetchAll(){
        return teamRepo.findAll();
    }

    public Team obtainTeamById(long team_id){
        Team res = teamRepo.findById(team_id).get();
        return res;
    }

    public Team save(Team team) {
        return teamRepo.save(team);
    }
}
