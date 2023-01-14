package com.poc.service.application;

import com.poc.mapper.TutorialMapper;
import com.poc.model.dto.TutorialDTO;
import com.poc.service.business.FindByFieldRSM;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FindByFieldRSAImpl implements FindByFieldRSA {

    private final FindByFieldRSM findByFieldRSM;
    private final TutorialMapper tutorialMapper;

    @Override
    public List<TutorialDTO> getTutorialByLevel(int level) {
        return tutorialMapper.toDTO(findByFieldRSM.getTutorialByLevel(level));
    }

    @Override
    public List<TutorialDTO> getTutorialByPublished(boolean isPublished) {
        return tutorialMapper.toDTO(findByFieldRSM.getTutorialByPublished(isPublished));
    }

    @Override
    public List<TutorialDTO> getTutorialByLevelIs(int level) {
        return tutorialMapper.toDTO(findByFieldRSM.getTutorialByLevelIs(level));
    }

    @Override
    public List<TutorialDTO> getTutorialByLevelEquals(int level) {
        return tutorialMapper.toDTO(findByFieldRSM.getTutorialByLevelEquals(level));
    }

    @Override
    public List<TutorialDTO> getTutorialByLevelNot(int level) {
        return tutorialMapper.toDTO(findByFieldRSM.getTutorialByLevelNot(level));
    }

    @Override
    public List<TutorialDTO> getTutorialByLevelIsNot(int level) {
        return tutorialMapper.toDTO(findByFieldRSM.getTutorialByLevelIsNot(level));
    }
}
