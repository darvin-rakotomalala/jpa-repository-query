package com.poc.service.application;

import com.poc.model.dto.TutorialDTO;

import java.util.Date;
import java.util.List;

public interface QueryComparisonRSA {
    List<TutorialDTO> getByLevelGreaterThan(int level);
    List<TutorialDTO> getByCreatedAtGreaterThanEqual(Date date);
    List<TutorialDTO> getByCreatedAtAfter(Date date);
    List<TutorialDTO> getByCreatedAtBefore(Date date);
    List<TutorialDTO> getByLevelBetween(int start, int end);
    List<TutorialDTO> getByLevelBetweenAndPublished(int start, int end, boolean isPublished);
    List<TutorialDTO> getByCreatedAtBetween(Date start, Date end);
}
