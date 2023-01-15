package com.poc.service.business;

import com.poc.model.domain.Tutorial;
import com.poc.repository.TutorialRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class LikeQueryRSMImpl implements LikeQueryRSM {

    private final TutorialRepository tutorialRepository;

    @Override
    public List<Tutorial> getByTitleLike(String title) {
        try {
            log.info("----- getByTitleLike : {}", title);
            if (!StringUtils.isBlank(title)) {
                return tutorialRepository.findByTitleLike(title);
            }
            return Collections.emptyList();
        } catch (Exception e) {
            log.error("Error getByTitleLike : {} {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public List<Tutorial> getByTitleStartingWith(String title) {
        try {
            log.info("----- getByTitleStartingWith : {}", title);
            if (!StringUtils.isBlank(title)) {
                return tutorialRepository.findByTitleStartingWith(title);
            }
            return Collections.emptyList();
        } catch (Exception e) {
            log.error("Error getByTitleStartingWith : {} {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public List<Tutorial> getByTitleEndingWith(String title) {
        try {
            log.info("----- getByTitleEndingWith : {}", title);
            if (!StringUtils.isBlank(title)) {
                return tutorialRepository.findByTitleEndingWith(title);
            }
            return Collections.emptyList();
        } catch (Exception e) {
            log.error("Error getByTitleEndingWith : {} {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public List<Tutorial> getByTitleContaining(String title) {
        try {
            log.info("----- getByTitleContaining : {}", title);
            if (!StringUtils.isBlank(title)) {
                return tutorialRepository.findByTitleContaining(title);
            }
            return Collections.emptyList();
        } catch (Exception e) {
            log.error("Error getByTitleContaining : {} {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public List<Tutorial> getByTitleContainingOrDescriptionContaining(String title, String description) {
        try {
            log.info("----- getByTitleContainingOrDescriptionContaining : {} {}", title, description);
            if (!StringUtils.isBlank(title) || !StringUtils.isBlank(description)) {
                return tutorialRepository.findByTitleContainingOrDescriptionContaining(title, description);
            }
            return Collections.emptyList();
        } catch (Exception e) {
            log.error("Error getByTitleContainingOrDescriptionContaining : {} {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public List<Tutorial> getByTitleContainingAndPublished(String title, boolean isPublished) {
        try {
            log.info("----- getByTitleContainingAndPublished : {} {}", title, isPublished);
            if (!StringUtils.isBlank(title)) {
                return tutorialRepository.findByTitleContainingAndPublished(title, isPublished);
            }
            return Collections.emptyList();
        } catch (Exception e) {
            log.error("Error getByTitleContainingAndPublished : {} {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public List<Tutorial> getByTitleContainingIgnoreCase(String title) {
        try {
            log.info("----- getByTitleContainingIgnoreCase : {}", title);
            if (!StringUtils.isBlank(title)) {
                return tutorialRepository.findByTitleContainingIgnoreCase(title);
            }
            return Collections.emptyList();
        } catch (Exception e) {
            log.error("Error getByTitleContainingIgnoreCase : {} {}", e.getMessage(), e);
            throw e;
        }
    }

}
