package com.ghumofy.admin.controller;

import com.ghumofy.admin.service.StateService;
import com.ghumofy.core.entity.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/v1/admin/state")
public class StateController {

    @Autowired
    private StateService stateService;

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<State> create(@RequestPart("data") State state,
                                        @RequestPart(value = "file", required = false) MultipartFile file) {
        return ResponseEntity.ok(stateService.create(state));
    }
}
