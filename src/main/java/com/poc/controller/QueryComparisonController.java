package com.poc.controller;

import com.poc.model.dto.TutorialDTO;
import com.poc.service.application.QueryComparisonRSA;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "tutorials/queryComparison")
public class QueryComparisonController {

    private final QueryComparisonRSA queryWithComparisonRSA;

    @Operation(summary = "WS used to get tutorials by LevelGreaterThan")
    @GetMapping("/byLevelGreaterThan")
    public List<TutorialDTO> getByLevelGreaterThan(@RequestParam(name = "level", defaultValue = "0", required = true) int level) {
        return queryWithComparisonRSA.getByLevelGreaterThan(level);
    }

    @Operation(summary = "WS used to get tutorials by CreatedAtGreaterThanEqual")
    @GetMapping("/byCreatedAtGreaterThanEqual")
    public List<TutorialDTO> getByCreatedAtGreaterThanEqual(@RequestParam(name = "date", required = true) String date) throws ParseException {
        Date myDate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS").parse(date);
        return queryWithComparisonRSA.getByCreatedAtGreaterThanEqual(myDate);
    }

    @Operation(summary = "WS used to get tutorials by CreatedAtAfter")
    @GetMapping("/byCreatedAtAfter")
    public List<TutorialDTO> getByCreatedAtAfter(@RequestParam(name = "date", required = true) Date date) {
        return queryWithComparisonRSA.getByCreatedAtAfter(date);
    }

    @Operation(summary = "WS used to get tutorials by CreatedAtBefore")
    @GetMapping("/byCreatedAtBefore")
    public List<TutorialDTO> getByCreatedAtBefore(@RequestParam(name = "date", required = true) Date date) {
        return queryWithComparisonRSA.getByCreatedAtBefore(date);
    }

    @Operation(summary = "WS used to get tutorials by LevelBetween")
    @GetMapping("/byLevelBetween")
    public List<TutorialDTO> getByLevelBetween(
            @RequestParam(name = "start", required = true) int start,
            @RequestParam(name = "end", required = true) int end) {
        return queryWithComparisonRSA.getByLevelBetween(start, end);
    }

    @Operation(summary = "WS used to get tutorials by LevelBetweenAndPublished")
    @GetMapping("/byLevelBetweenAndPublished")
    public List<TutorialDTO> getByLevelBetweenAndPublished(
            @RequestParam(name = "start", required = true) int start,
            @RequestParam(name = "end", required = true) int end,
            @RequestParam(name = "isPublished", required = true) boolean isPublished) {
        return queryWithComparisonRSA.getByLevelBetweenAndPublished(start, end, isPublished);
    }

    @Operation(summary = "WS used to get tutorials by CreatedAtBetween")
    @GetMapping("/byCreatedAtBetween")
    public List<TutorialDTO> getByCreatedAtBetween(
            @RequestParam(name = "start", required = true) Date start,
            @RequestParam(name = "end", required = true) Date end) {
        return queryWithComparisonRSA.getByCreatedAtBetween(start, end);
    }

}
