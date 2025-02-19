package com.example.trainingcenter.service;

import com.example.trainingcenter.entity.Session;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SessionService {

    Session getSessionById(int id);
    List<Session> getAllSessions();
    Session addSession(Session session);
    Session updateSession(Session session);
    void deleteSession(int id);
}
