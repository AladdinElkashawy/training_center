package com.example.trainingcenter.service;

import com.example.trainingcenter.entity.Session;
import com.example.trainingcenter.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionServiceImpl implements SessionService {

    @Autowired
    SessionRepository sessionRepository;

    @Override
    public Session getSessionById(int id) {
        return sessionRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Session> getAllSessions() {
        return sessionRepository.findAll();
    }

    @Override
    public Session addSession(Session session) {
        return sessionRepository.save(session);
    }

    @Override
    public Session updateSession(Session session) {
        return sessionRepository.save(session);
    }

    @Override
   public void deleteSession(int id){
        sessionRepository.deleteById(id);
    }
}
