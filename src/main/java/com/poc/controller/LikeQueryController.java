package com.poc.controller;

import com.poc.model.dto.TutorialDTO;
import com.poc.service.application.LikeQueryRSA;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "tutorials/likeQuery")
public class LikeQueryController {

    private final LikeQueryRSA likeQueryRSA;

    @Operation(summary = "WS used to get tutorials by title like")
    @GetMapping("/byTitleLike")
    public List<TutorialDTO> getByTitleLike(@RequestParam(name = "title", required = true) String title) {
        return likeQueryRSA.getByTitleLike(title);
    }

    @Operation(summary = "WS used to get tutorials by TitleStartingWith")
    @GetMapping("/byTitleStartingWith")
    public List<TutorialDTO> getByTitleStartingWith(@RequestParam(name = "title", required = true) String title) {
        return likeQueryRSA.getByTitleStartingWith(title);
    }

    @Operation(summary = "WS used to get tutorials by TitleEndingWith")
    @GetMapping("/byTitleEndingWith")
    public List<TutorialDTO> getByTitleEndingWith(@RequestParam(name = "title", required = true) String title) {
        return likeQueryRSA.getByTitleEndingWith(title);
    }

    @Operation(summary = "WS used to get tutorials by TitleContaining")
    @GetMapping("/byTitleContaining")
    public List<TutorialDTO> getByTitleContaining(@RequestParam(name = "title", required = true) String title) {
        return likeQueryRSA.getByTitleContaining(title);
    }

    @Operation(summary = "WS used to get tutorials by TitleContainingOrDescriptionContaining")
    @GetMapping("/byTitleContainingOrDescriptionContaining")
    public List<TutorialDTO> getByTitleContainingOrDescriptionContaining(
            @RequestParam(name = "title", required = true) String title,
            @RequestParam(name = "description", required = true) String description) {
        return likeQueryRSA.getByTitleContainingOrDescriptionContaining(title, description);
    }

    @Operation(summary = "WS used to get tutorials by TitleContainingAndPublished")
    @GetMapping("/byTitleContainingAndPublished")
    public List<TutorialDTO> getByTitleContainingAndPublished(
            @RequestParam(name = "title", required = true) String title,
            @RequestParam(name = "published", defaultValue = "true", required = true) boolean isPublished) {
        return likeQueryRSA.getByTitleContainingAndPublished(title, isPublished);
    }

    @Operation(summary = "WS used to get tutorials by title like")
    @GetMapping("/byTitleContainingIgnoreCase")
    public List<TutorialDTO> getByTitleContainingIgnoreCase(@RequestParam(name = "title", required = true) String title) {
        return likeQueryRSA.getByTitleContainingIgnoreCase(title);
    }

}
