package com.poc.service.business;

import com.poc.model.domain.Tutorial;

import java.util.Date;
import java.util.List;

public interface TutorialCUDSM {
    public List<Tutorial> createTutorials(List<Tutorial> tutorials);
    public Tutorial createOrUpdateTutorial(Tutorial tutorial);
    public void deleteTutorialById(Long id);
    List<Tutorial> deleteAllByCreatedAtBefore(Date outdate);
}
