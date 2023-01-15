package com.poc.service.business;

import com.poc.exception.ErrorsEnum;
import com.poc.exception.FunctionalException;
import com.poc.model.domain.Tutorial;
import com.poc.repository.TutorialRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class FindByMultipleColumnsRSMImpl implements FindByMultipleColumnsRSM {

    private final TutorialRepository tutorialRepository;

    @Override
    public List<Tutorial> getByLevelAndPublished(int level, boolean isPublished) {
        try {
            log.info("----- getByLevelAndPublished : {} {}", level, isPublished);
            if (level >= 0) {
                return tutorialRepository.findByLevelAndPublished(level, isPublished);
            }
            throw new FunctionalException(ErrorsEnum.ERR_MCS_TUTORIAL_PARAM_NOT_VALID.getErrorMessage());
        } catch (Exception e) {
            log.error("Error getByLevelAndPublished : {} : {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public List<Tutorial> getByTitleOrDescription(String title, String description) {
        try {
            log.info("----- getByTitleOrDescription : {} {}", title, description);
            if (!StringUtils.isBlank(title) && !StringUtils.isBlank(description)) {
                return tutorialRepository.findByTitleOrDescription(title, description);
            }
            throw new FunctionalException(ErrorsEnum.ERR_MCS_TUTORIAL_PARAM_NOT_VALID.getErrorMessage());
        } catch (Exception e) {
            log.error("Error getByTitleOrDescription : {} : {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public List<Tutorial> getByTitleContainingIgnoreCaseAndPublished(String title, boolean isPublished) {
        try {
            log.info("----- getByTitleContainingIgnoreCaseAndPublished : {} {}", title, isPublished);
            if (!StringUtils.isBlank(title)) {
                return tutorialRepository.findByTitleContainingIgnoreCaseAndPublished(title, isPublished);
            }
            throw new FunctionalException(ErrorsEnum.ERR_MCS_TUTORIAL_PARAM_NOT_VALID.getErrorMessage());
        } catch (Exception e) {
            log.error("Error getByTitleContainingIgnoreCaseAndPublished : {} : {}", e.getMessage(), e);
            throw e;
        }
    }

}
