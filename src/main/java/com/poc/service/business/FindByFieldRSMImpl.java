package com.poc.service.business;

import com.poc.exception.ErrorsEnum;
import com.poc.exception.FunctionalException;
import com.poc.model.domain.Tutorial;
import com.poc.repository.TutorialRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class FindByFieldRSMImpl implements FindByFieldRSM {

    private final TutorialRepository tutorialRepository;

    @Override
    public List<Tutorial> getTutorialByLevel(int level) {
        try {
            log.info("----- getTutorialByLevel : {}", level);
            if (level >= 0) {
                return tutorialRepository.findByLevel(level);
            }
            throw new FunctionalException(ErrorsEnum.ERR_MCS_TUTORIAL_PARAM_NOT_VALID.getErrorMessage());
        } catch (Exception e) {
            log.error("Error getTutorialByLevel : {}", e.getMessage());
            throw e;
        }
    }

    @Override
    public List<Tutorial> getTutorialByPublished(boolean isPublished) {
        try {
            log.info("----- getTutorialByPublished : {}", isPublished);
            return tutorialRepository.findByPublished(isPublished);
        } catch (Exception e) {
            log.error("Error getTutorialByPublished : {}", e.getMessage());
            throw e;
        }
    }

    @Override
    public List<Tutorial> getTutorialByLevelIs(int level) {
        try {
            log.info("----- getTutorialByLevelIs : {}", level);
            if (level >= 0) {
                return tutorialRepository.findByLevelIs(level);
            }
            throw new FunctionalException(ErrorsEnum.ERR_MCS_TUTORIAL_PARAM_NOT_VALID.getErrorMessage());
        } catch (Exception e) {
            log.error("Error getTutorialByLevelIs : {}", e.getMessage());
            throw e;
        }
    }

    @Override
    public List<Tutorial> getTutorialByLevelEquals(int level) {
        try {
            log.info("----- getTutorialByLevelEquals : {}", level);
            if (level >= 0) {
                return tutorialRepository.findByLevelEquals(level);
            }
            throw new FunctionalException(ErrorsEnum.ERR_MCS_TUTORIAL_PARAM_NOT_VALID.getErrorMessage());
        } catch (Exception e) {
            log.error("Error getTutorialByLevelEquals : {}", e.getMessage());
            throw e;
        }
    }

    @Override
    public List<Tutorial> getTutorialByLevelNot(int level) {
        try {
            log.info("----- getTutorialByLevelNot : {}", level);
            if (level >= 0) {
                return tutorialRepository.findByLevelNot(level);
            }
            throw new FunctionalException(ErrorsEnum.ERR_MCS_TUTORIAL_PARAM_NOT_VALID.getErrorMessage());
        } catch (Exception e) {
            log.error("Error getTutorialByLevelNot : {}", e.getMessage());
            throw e;
        }
    }

    @Override
    public List<Tutorial> getTutorialByLevelIsNot(int level) {
        try {
            log.info("----- getTutorialByLevelIsNot : {}", level);
            if (level >= 0) {
                return tutorialRepository.findByLevelIsNot(level);
            }
            throw new FunctionalException(ErrorsEnum.ERR_MCS_TUTORIAL_PARAM_NOT_VALID.getErrorMessage());
        } catch (Exception e) {
            log.error("Error getTutorialByLevelIsNot : {}", e.getMessage());
            throw e;
        }
    }
}