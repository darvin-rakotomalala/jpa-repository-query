package com.poc.service.business;

import com.poc.model.domain.Tutorial;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface QuerySortingRSM {
    List<Tutorial> getByOrderByLevel();
    List<Tutorial> getByOrderByLevelAsc();
    List<Tutorial> getByOrderByLevelDesc();
    List<Tutorial> getByTitleContainingOrderByLevelDesc(String title);
    List<Tutorial> getByPublishedOrderByCreatedAtDesc(boolean isPublished);

    List<Tutorial> findByTitleContaining(String title, Sort sort);
    List<Tutorial> findByPublished(boolean isPublished, Sort sort);
}
