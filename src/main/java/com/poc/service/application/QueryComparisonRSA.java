package com.poc.service.application;

import com.poc.model.dto.TutorialDTO;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public interface QueryComparisonRSA {
    List<TutorialDTO> getByLevelGreaterThan(int level);
    List<TutorialDTO> getByCreatedAtGreaterThanEqual(String date) throws ParseException;
    List<TutorialDTO> getByCreatedAtAfter(String date) throws ParseException;
    List<TutorialDTO> getByCreatedAtBefore(String date) throws ParseException;
    List<TutorialDTO> getByLevelBetween(int start, int end);
    List<TutorialDTO> getByLevelBetweenAndPublished(int start, int end, boolean isPublished);
    List<TutorialDTO> getByCreatedAtBetween(String start, String end) throws ParseException;
}
