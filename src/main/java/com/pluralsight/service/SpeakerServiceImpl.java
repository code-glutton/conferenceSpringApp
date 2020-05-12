package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository;

    public SpeakerServiceImpl() {

    }

    public SpeakerServiceImpl(SpeakerRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<Speaker> findAll(){
    return repository.findAll();
    }

    @Autowired
    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
