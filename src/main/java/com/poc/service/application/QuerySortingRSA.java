package com.poc.service.application;

import com.poc.model.dto.TutorialDTO;

import java.util.List;

public interface QuerySortingRSA {
    List<TutorialDTO> getByOrderByLevel();
    List<TutorialDTO> getByOrderByLevelAsc();
    List<TutorialDTO> getByOrderByLevelDesc();
    List<TutorialDTO> getByTitleContainingOrderByLevelDesc(String title);
    List<TutorialDTO> getByPublishedOrderByCreatedAtDesc(boolean isPublished);

    List<TutorialDTO> getByTitleContainingSortByLevelDesc(String title);
    List<TutorialDTO> getByPublishedSortByLevelDesc(boolean isPublished);
}
