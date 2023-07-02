package com.Player.player.Controller;

import com.Player.player.Models.Player;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CopyOnWriteArrayList;
@RestController
@RequestMapping(value = "/player/api")
public class PlayerController {


    CopyOnWriteArrayList<Player> listOfStudents= new CopyOnWriteArrayList<>();
    @PostMapping
    public Player createPlayer(@RequestBody Player addPlayer){
        listOfStudents.add(addPlayer);
        return addPlayer;
    }
//    @GetMapping
//    public Player getAllPlayers(@RequestBody Player addPlayer){
//        listOfStudents.add(addPlayer);
//        return addPlayer;
//    }

}
