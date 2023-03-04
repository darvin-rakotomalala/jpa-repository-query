package com.poc.controller;

import com.poc.model.dto.TutorialDTO;
import com.poc.service.application.QuerySortingRSA;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "tutorials/querySorting")
public class QuerySortingController {

    private final QuerySortingRSA querySortingRSA;

    @Operation(summary = "WS used to get tutorials by order by level")
    @GetMapping("/orderByLevel")
    public List<TutorialDTO> getByOrderByLevel() {
        return querySortingRSA.getByOrderByLevel();
    }

    @Operation(summary = "WS used to get tutorials by order by level Asc")
    @GetMapping("/orderByLevelAsc")
    public List<TutorialDTO> getByOrderByLevelAsc() {
        return querySortingRSA.getByOrderByLevelAsc();
    }

    @Operation(summary = "WS used to get tutorials by order by level Desc")
    @GetMapping("/orderByLevelDesc")
    public List<TutorialDTO> getByOrderByLevelDesc() {
        return querySortingRSA.getByOrderByLevelDesc();
    }

    @Operation(summary = "WS used to get tutorials by order by level")
    @GetMapping("/titleOrderByLevelDesc")
    public List<TutorialDTO> getByTitleContainingOrderByLevelDesc(
            @RequestParam(name = "title", required = true) String title) {
        return querySortingRSA.getByTitleContainingOrderByLevelDesc(title);
    }

    @Operation(summary = "WS used to get tutorials by order by level")
    @GetMapping("/publishedOrderByCreatedAtDesc")
    public List<TutorialDTO> getByPublishedOrderByCreatedAtDesc(
            @RequestParam(name = "published", required = true) boolean isPublished) {
        return querySortingRSA.getByPublishedOrderByCreatedAtDesc(isPublished);
    }

    @Operation(summary = "WS used to get tutorials by order by level")
    @GetMapping("/titleSortByLevelDesc")
    public List<TutorialDTO> getByTitleContainingSortByLevelDesc(
            @RequestParam(name = "title", required = true) String title) {
        return querySortingRSA.getByTitleContainingSortByLevelDesc(title);
    }

    @Operation(summary = "WS used to get tutorials by order by level")
    @GetMapping("/publishedSortByLevelDesc")
    public List<TutorialDTO> getByPublishedSortByLevelDesc(
            @RequestParam(name = "published", required = true) boolean isPublished) {
        return querySortingRSA.getByPublishedSortByLevelDesc(isPublished);
    }

}
