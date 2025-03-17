package com.example.trainingcenter.controller;

import com.example.trainingcenter.entity.Session;
import com.example.trainingcenter.service.SessionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Session API", description = "Staff End Points to handle Staff Operations")
@RestController
@RequestMapping("/sessions")
public class SessionController {

    @Autowired
    SessionService sessionService;

    @Operation(summary = "Get Session", description = "Get a specific Session by id")
    @GetMapping("/{id}")
    Session getSessionById(@PathVariable int id){
        return sessionService.getSessionById(id);
    }

    @Operation(summary = "Get all Sessions", description = "Fetch all Sessions from database")
    @GetMapping("/all")
    List<Session> getAllSessions(){
        return sessionService.getAllSessions();
    }

    @Operation(summary = "Add Session", description = "Add new Session in database")
    @PostMapping("/add")
    Session addSession(@RequestBody Session session){
        return sessionService.addSession(session);
    }

    @Operation(summary = "Update Session", description = "Update an existing Session")
    @PutMapping("/update")
    Session updateSession(@RequestBody Session session){
        return sessionService.updateSession(session);
    }

    @Operation(summary = "Delete Session", description = "Delete specific Session by id")
    @DeleteMapping("/delete/{id}")
    void deleteSession(@PathVariable int id){
        sessionService.deleteSession(id);
    }

}
