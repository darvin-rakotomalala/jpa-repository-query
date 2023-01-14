package com.poc.controller;

import com.poc.model.dto.TutorialDTO;
import com.poc.service.application.FindByFieldRSA;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "tutorials/byField")
public class FindByFieldController {

    private final FindByFieldRSA findByFieldRSA;

    @Operation(summary = "WS used to get tutorials by level")
    @GetMapping
    public List<TutorialDTO> getTutorialByLevel(@RequestParam(name = "level", defaultValue = "0", required = true) int level) {
        return findByFieldRSA.getTutorialByLevel(level);
    }

    @Operation(summary = "WS used to get tutorials isPublished")
    @GetMapping("/isPublished")
    public List<TutorialDTO> getTutorialByPublished(@RequestParam(name = "published", defaultValue = "true", required = true) boolean isPublished) {
        return findByFieldRSA.getTutorialByPublished(isPublished);
    }

    @Operation(summary = "WS used to get tutorials by LevelIs")
    @GetMapping("/levelIs")
    public List<TutorialDTO> getTutorialByLevelIs(@RequestParam(name = "level", defaultValue = "0", required = true) int level) {
        return findByFieldRSA.getTutorialByLevelIs(level);
    }

    @Operation(summary = "WS used to get tutorials by LevelEquals")
    @GetMapping("/levelEquals")
    public List<TutorialDTO> getTutorialByLevelEquals(@RequestParam(name = "level", defaultValue = "0", required = true) int level) {
        return findByFieldRSA.getTutorialByLevelEquals(level);
    }

    @Operation(summary = "WS used to get tutorials by LevelNot")
    @GetMapping("/levelNot")
    public List<TutorialDTO> getTutorialByLevelNot(@RequestParam(name = "level", defaultValue = "0", required = true) int level) {
        return findByFieldRSA.getTutorialByLevelNot(level);
    }

    @Operation(summary = "WS used to get tutorials by LevelIsNot")
    @GetMapping("/levelIsNot")
    public List<TutorialDTO> getTutorialByLevelIsNot(@RequestParam(name = "level", defaultValue = "0", required = true) int level) {
        return findByFieldRSA.getTutorialByLevelIsNot(level);
    }

}
