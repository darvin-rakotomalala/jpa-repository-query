package com.poc.service.business;

import com.poc.model.domain.Tutorial;
import com.poc.repository.TutorialRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class QueryComparisonRSMImpl implements QueryComparisonRSM {

    private final TutorialRepository tutorialRepository;

    @Override
    public List<Tutorial> getByLevelGreaterThan(int level) {
        try {
            log.info("----- getByLevelGreaterThan : {}", level);
            return tutorialRepository.findByLevelGreaterThan(level);
        } catch (Exception e) {
            log.error("Error getByLevelGreaterThan : {} : {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public List<Tutorial> getByCreatedAtGreaterThanEqual(Date date) {
        try {
            log.info("----- getByCreatedAtGreaterThanEqual : {}", date);
            return tutorialRepository.findByCreatedAtGreaterThanEqual(date);
        } catch (Exception e) {
            log.error("Error getByCreatedAtGreaterThanEqual : {} : {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public List<Tutorial> getByCreatedAtAfter(Date date) {
        try {
            log.info("----- getByCreatedAtAfter : {}", date);
            return tutorialRepository.findByCreatedAtAfter(date);
        } catch (Exception e) {
            log.error("Error getByCreatedAtAfter : {} : {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public List<Tutorial> getByCreatedAtBefore(Date date) {
        try {
            log.info("----- getByCreatedAtBefore : {}", date);
            return tutorialRepository.findByCreatedAtBefore(date);
        } catch (Exception e) {
            log.error("Error getByCreatedAtBefore : {} : {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public List<Tutorial> getByLevelBetween(int start, int end) {
        try {
            log.info("----- getByLevelBetween : {} : {}", start, end);
            return tutorialRepository.findByLevelBetween(start, end);
        } catch (Exception e) {
            log.error("Error getByLevelBetween : {} : {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public List<Tutorial> getByLevelBetweenAndPublished(int start, int end, boolean isPublished) {
        try {
            log.info("----- getByLevelBetweenAndPublished : {} : {} : {}", start, end, isPublished);
            return tutorialRepository.findByLevelBetweenAndPublished(start, end, isPublished);
        } catch (Exception e) {
            log.error("Error getByLevelBetweenAndPublished : {} : {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public List<Tutorial> getByCreatedAtBetween(Date start, Date end) {
        try {
            log.info("----- getByCreatedAtBetween : {} : {}", start, end);
            return tutorialRepository.findByCreatedAtBetween(start, end);
        } catch (Exception e) {
            log.error("Error getByCreatedAtBetween : {} : {}", e.getMessage(), e);
            throw e;
        }
    }

}
