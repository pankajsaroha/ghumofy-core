package com.ghumofy.admin.service.impl;

import com.ghumofy.admin.repository.StateRepository;
import com.ghumofy.admin.service.StateService;
import com.ghumofy.core.entity.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateServiceImpl implements StateService {

    @Autowired
    private StateRepository stateRepository;

    @Override
    public State create(State state) {
        return stateRepository.save(state);
    }

    @Override
    public State fetchById(String id) {
        return stateRepository.findById(id).get();
    }

    @Override
    public State update(String id, State state) {
        return null;
    }

    @Override
    public void delete(String id) {
        stateRepository.deleteById(id);
    }

    @Override
    public List<State> fetchStates() {
        return stateRepository.findAll();
    }
}
