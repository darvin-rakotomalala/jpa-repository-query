package com.poc.service.business;

import com.poc.model.domain.Tutorial;

import java.util.Date;
import java.util.List;

public interface QueryComparisonRSM {
    List<Tutorial> getByLevelGreaterThan(int level);
    List<Tutorial> getByCreatedAtGreaterThanEqual(Date date);
    List<Tutorial> getByCreatedAtAfter(Date date);
    List<Tutorial> getByCreatedAtBefore(Date date);
    List<Tutorial> getByLevelBetween(int start, int end);
    List<Tutorial> getByLevelBetweenAndPublished(int start, int end, boolean isPublished);
    List<Tutorial> getByCreatedAtBetween(Date start, Date end);
}
