package com.poc.service.business;

import com.poc.model.domain.Tutorial;

import java.util.List;

public interface LikeQueryRSM {
    List<Tutorial> getByTitleLike(String title);
    List<Tutorial> getByTitleStartingWith(String title);
    List<Tutorial> getByTitleEndingWith(String title);
    List<Tutorial> getByTitleContaining(String title);
    List<Tutorial> getByTitleContainingOrDescriptionContaining(String title, String description);
    List<Tutorial> getByTitleContainingAndPublished(String title, boolean isPublished);
    List<Tutorial> getByTitleContainingIgnoreCase(String title);
}
