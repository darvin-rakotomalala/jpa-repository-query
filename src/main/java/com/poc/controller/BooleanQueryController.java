package com.poc.controller;

import com.poc.model.dto.TutorialDTO;
import com.poc.service.application.BooleanQueryRSA;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "tutorials/booleanQuery")
public class BooleanQueryController {

    private final BooleanQueryRSA booleanQueryRSA;

    @Operation(summary = "WS used to get tutorials by published true")
    @GetMapping("/byPublishedTrue")
    public List<TutorialDTO> getByPublishedTrue() {
        return booleanQueryRSA.getByPublishedTrue();
    }

    @Operation(summary = "WS used to get tutorials by published false")
    @GetMapping("/byPublishedFalse")
    public List<TutorialDTO> getByPublishedFalse() {
        return booleanQueryRSA.getByPublishedFalse();
    }

}
