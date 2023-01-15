package com.poc.service.business;

import com.poc.model.domain.Tutorial;
import com.poc.repository.TutorialRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class TutorialCUDSMImpl implements TutorialCUDSM {

    private final TutorialRepository tutorialRepository;
    private final TutorialRSM tutorialRSM;

    @Override
    public List<Tutorial> createTutorials(List<Tutorial> tutorials) {
        try {
            log.info("----- createTutorials");
            return tutorialRepository.saveAll(tutorials);
        } catch (Exception e) {
            log.error("Error createTutorials : {} {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public Tutorial createOrUpdateTutorial(Tutorial tutorial) {
        try {
            log.info("----- createOrUpdateTutorial");
            return tutorialRepository.save(tutorial);
        } catch (Exception e) {
            log.error("Error createOrUpdateTutorial : {} {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public void deleteTutorialById(Long id) {
        try {
            log.info("----- deleteTutorialById : {}", id);
            Tutorial noteFound = tutorialRSM.getTutorialById(id);
            tutorialRepository.deleteById(noteFound.getId());
        } catch (Exception e) {
            log.error("Error deleteNoteById : {} {}", e.getMessage(), e);
            throw e;
        }
    }
}
