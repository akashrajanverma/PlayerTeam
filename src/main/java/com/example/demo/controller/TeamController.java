package com.example.demo.controller;

import com.example.demo.model.Team;
import com.example.demo.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team")
public class TeamController {
    @Autowired
    private TeamService teamService;

    @GetMapping("/list")
    public List<Team> fetchAll(){
        return teamService.fetchAll();
    }

    @GetMapping("/{id}")
    public Team obtainTeamById(@PathVariable("id") long team_id){
        return teamService.obtainTeamById(team_id);
    }

    @PostMapping("/save")
    public Team save(@RequestBody Team team){
        return teamService.save(team);
    }
}
