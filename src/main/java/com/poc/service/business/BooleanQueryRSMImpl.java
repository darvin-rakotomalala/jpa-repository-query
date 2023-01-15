package com.poc.service.business;

import com.poc.model.domain.Tutorial;
import com.poc.repository.TutorialRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class BooleanQueryRSMImpl implements BooleanQueryRSM {

    private final TutorialRepository tutorialRepository;

    @Override
    public List<Tutorial> getByPublishedTrue() {
        try {
            log.info("----- getByPublishedTrue");
            return tutorialRepository.findByPublishedTrue();
        } catch (Exception e) {
            log.error("Error getByPublishedTrue : {} {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public List<Tutorial> getByPublishedFalse() {
        try {
            log.info("----- getByPublishedFalse");
            return tutorialRepository.findByPublishedFalse();
        } catch (Exception e) {
            log.error("Error getByPublishedFalse : {} {}", e.getMessage(), e);
            throw e;
        }
    }

}
