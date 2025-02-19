package com.example.trainingcenter.controller;

import com.example.trainingcenter.entity.Session;
import com.example.trainingcenter.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sessions")
public class SessionController {

    @Autowired
    SessionService sessionService;

    @GetMapping("/{id}")
    Session getSessionById(@PathVariable int id){
        return sessionService.getSessionById(id);
    }

    @GetMapping("/all")
    List<Session> getAllSessions(){
        return sessionService.getAllSessions();
    }

    @PostMapping("/add")
    Session addSession(@RequestBody Session session){
        return sessionService.addSession(session);
    }

    @PutMapping("/update")
    Session updateSession(@RequestBody Session session){
        return sessionService.updateSession(session);
    }

    @DeleteMapping("/delete/{id}")
    void deleteSession(@PathVariable int id){
        sessionService.deleteSession(id);
    }

}
