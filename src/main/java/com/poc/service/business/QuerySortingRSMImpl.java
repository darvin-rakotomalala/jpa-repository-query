package com.poc.service.business;

import com.poc.model.domain.Tutorial;
import com.poc.repository.TutorialRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class QuerySortingRSMImpl implements QuerySortingRSM {

    private final TutorialRepository tutorialRepository;

    @Override
    public List<Tutorial> getByOrderByLevel() {
        try {
            log.info("----- getByOrderByLevel");
            return tutorialRepository.findByOrderByLevel();
        } catch (Exception e) {
            log.error("Error getByOrderByLevel : {} : {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public List<Tutorial> getByOrderByLevelAsc() {
        try {
            log.info("----- getByOrderByLevelAsc");
            return tutorialRepository.findByOrderByLevelAsc();
        } catch (Exception e) {
            log.error("Error getByOrderByLevelAsc : {} : {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public List<Tutorial> getByOrderByLevelDesc() {
        try {
            log.info("----- getByOrderByLevelDesc");
            return tutorialRepository.findByOrderByLevelDesc();
        } catch (Exception e) {
            log.error("Error getByOrderByLevelDesc : {} : {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public List<Tutorial> getByTitleContainingOrderByLevelDesc(String title) {
        try {
            log.info("----- getByTitleContainingOrderByLevelDesc : {}", title);
            return tutorialRepository.findByTitleContainingOrderByLevelDesc(title);
        } catch (Exception e) {
            log.error("Error getByTitleContainingOrderByLevelDesc : {} : {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public List<Tutorial> getByPublishedOrderByCreatedAtDesc(boolean isPublished) {
        try {
            log.info("----- getByPublishedOrderByCreatedAtDesc : {}", isPublished);
            return tutorialRepository.findByPublishedOrderByCreatedAtDesc(isPublished);
        } catch (Exception e) {
            log.error("Error getByPublishedOrderByCreatedAtDesc : {} : {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public List<Tutorial> findByTitleContaining(String title, Sort sort) {
        try {
            log.info("----- findByTitleContaining : {}", title);
            return tutorialRepository.findByTitleContaining(title, sort);
        } catch (Exception e) {
            log.error("Error findByTitleContaining : {} : {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public List<Tutorial> findByPublished(boolean isPublished, Sort sort) {
        try {
            log.info("----- findByPublished : {}", isPublished);
            return tutorialRepository.findByPublished(isPublished, sort);
        } catch (Exception e) {
            log.error("Error findByPublished : {} : {}", e.getMessage(), e);
            throw e;
        }
    }
}
