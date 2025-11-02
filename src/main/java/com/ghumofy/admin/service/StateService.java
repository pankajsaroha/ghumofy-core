package com.ghumofy.admin.service;

import com.ghumofy.core.entity.State;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StateService {
    State create(State state);
    State fetchById(String id);
    State update(String id, State state);
    void delete(String id);
    List<State> fetchStates();
}
