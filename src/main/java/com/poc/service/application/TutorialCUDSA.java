package com.poc.service.application;

import com.poc.model.dto.TutorialDTO;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public interface TutorialCUDSA {
    public List<TutorialDTO> createTutorials(List<TutorialDTO> tutorials);
    public TutorialDTO createTutorial(TutorialDTO tutorialDTO);
    public TutorialDTO updateTutorial(TutorialDTO tutorialDTO);
    public void deleteTutorialById(Long id);
    List<TutorialDTO> deleteAllByCreatedAtBefore(String outDate) throws ParseException;
}
