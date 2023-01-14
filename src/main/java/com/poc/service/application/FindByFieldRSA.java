package com.poc.service.application;

import com.poc.model.dto.TutorialDTO;

import java.util.List;

public interface FindByFieldRSA {
    List<TutorialDTO> getTutorialByLevel(int level);
    List<TutorialDTO> getTutorialByPublished(boolean isPublished);
    List<TutorialDTO> getTutorialByLevelIs(int level);
    List<TutorialDTO> getTutorialByLevelEquals(int level);
    List<TutorialDTO> getTutorialByLevelNot(int level);
    List<TutorialDTO> getTutorialByLevelIsNot(int level);
}
