package com.poc.service.application;

import com.poc.model.dto.TutorialDTO;

import java.util.List;

public interface LikeQueryRSA {
    List<TutorialDTO> getByTitleLike(String title);
    List<TutorialDTO> getByTitleStartingWith(String title);
    List<TutorialDTO> getByTitleEndingWith(String title);
    List<TutorialDTO> getByTitleContaining(String title);
    List<TutorialDTO> getByTitleContainingOrDescriptionContaining(String title, String description);
    List<TutorialDTO> getByTitleContainingAndPublished(String title, boolean isPublished);
    List<TutorialDTO> getByTitleContainingIgnoreCase(String title);
}
