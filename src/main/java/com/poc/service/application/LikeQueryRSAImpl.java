package com.poc.service.application;

import com.poc.mapper.TutorialMapper;
import com.poc.model.dto.TutorialDTO;
import com.poc.service.business.LikeQueryRSM;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class LikeQueryRSAImpl implements LikeQueryRSA {

    private final LikeQueryRSM likeQueryRSM;
    private final TutorialMapper tutorialMapper;

    @Override
    public List<TutorialDTO> getByTitleLike(String title) {
        return tutorialMapper.toDTO(likeQueryRSM.getByTitleLike(title));
    }

    @Override
    public List<TutorialDTO> getByTitleStartingWith(String title) {
        return tutorialMapper.toDTO(likeQueryRSM.getByTitleStartingWith(title));
    }

    @Override
    public List<TutorialDTO> getByTitleEndingWith(String title) {
        return tutorialMapper.toDTO(likeQueryRSM.getByTitleEndingWith(title));
    }

    @Override
    public List<TutorialDTO> getByTitleContaining(String title) {
        return tutorialMapper.toDTO(likeQueryRSM.getByTitleContaining(title));
    }

    @Override
    public List<TutorialDTO> getByTitleContainingOrDescriptionContaining(String title, String description) {
        return tutorialMapper.toDTO(likeQueryRSM.getByTitleContainingOrDescriptionContaining(title, description));
    }

    @Override
    public List<TutorialDTO> getByTitleContainingAndPublished(String title, boolean isPublished) {
        return tutorialMapper.toDTO(likeQueryRSM.getByTitleContainingAndPublished(title, isPublished));
    }

    @Override
    public List<TutorialDTO> getByTitleContainingIgnoreCase(String title) {
        return tutorialMapper.toDTO(likeQueryRSM.getByTitleContainingIgnoreCase(title));
    }

}
