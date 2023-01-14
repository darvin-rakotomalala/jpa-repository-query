package com.poc.service.application;

import com.poc.exception.ErrorsEnum;
import com.poc.exception.FunctionalException;
import com.poc.model.domain.Tutorial;
import com.poc.model.dto.TutorialDTO;
import com.poc.mapper.TutorialMapper;
import com.poc.service.business.TutorialCUDSM;
import com.poc.service.business.TutorialRSM;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TutorialCUDSAImpl implements TutorialCUDSA {

    private final TutorialCUDSM tutorialCUDSM;
    private final TutorialRSM tutorialRSM;
    private final TutorialMapper tutorialMapper;

    @Override
    public List<TutorialDTO> createTutorials(List<TutorialDTO> tutorials) {
        return tutorialMapper.toDTO(tutorialCUDSM.createTutorials(tutorialMapper.toDO(tutorials)));
    }

    @Override
    public TutorialDTO createTutorial(TutorialDTO tutorialDTO) {
        if (tutorialDTO == null) {
            throw new FunctionalException(ErrorsEnum.ERR_MCS_TUTORIAL_OBJECT_EMPTY.getErrorMessage());
        }
        return tutorialMapper.toDTO(tutorialCUDSM.createOrUpdateTutorial(tutorialMapper.toDO(tutorialDTO)));
    }

    @Override
    public TutorialDTO updateTutorial(TutorialDTO tutorialDTO) {
        if (tutorialDTO == null || tutorialDTO.getId() == null) {
            throw new FunctionalException(ErrorsEnum.ERR_MCS_TUTORIAL_OBJECT_EMPTY.getErrorMessage());
        }
        TutorialDTO tutorialFound = tutorialMapper.toDTO(tutorialRSM.getTutorialById(tutorialDTO.getId()));
        tutorialFound.setTitle(tutorialDTO.getTitle());
        tutorialFound.setDescription(tutorialDTO.getDescription());
        tutorialFound.setLevel(tutorialDTO.getLevel());
        tutorialFound.setPublished(tutorialDTO.isPublished());
        return tutorialMapper.toDTO(tutorialCUDSM.createOrUpdateTutorial(tutorialMapper.toDO(tutorialFound)));
    }

    @Override
    public void deleteTutorialById(Long id) {
        tutorialCUDSM.deleteTutorialById(id);
    }

}
