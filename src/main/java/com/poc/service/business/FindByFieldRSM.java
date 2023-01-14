package com.poc.service.business;

import com.poc.model.domain.Tutorial;

import java.util.List;

public interface FindByFieldRSM {
    List<Tutorial> getTutorialByLevel(int level);
    List<Tutorial> getTutorialByPublished(boolean isPublished);
    List<Tutorial> getTutorialByLevelIs(int level);
    List<Tutorial> getTutorialByLevelEquals(int level);
    List<Tutorial> getTutorialByLevelNot(int level);
    List<Tutorial> getTutorialByLevelIsNot(int level);
}
