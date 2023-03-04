package com.poc.service.application;

import com.poc.mapper.TutorialMapper;
import com.poc.model.dto.TutorialDTO;
import com.poc.service.business.QuerySortingRSM;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class QuerySortingRSAImpl implements QuerySortingRSA {

    private final QuerySortingRSM querySortingRSM;

    private final TutorialMapper tutorialMapper;

    @Override
    public List<TutorialDTO> getByOrderByLevel() {
        return tutorialMapper.toDTO(querySortingRSM.getByOrderByLevel());
    }

    @Override
    public List<TutorialDTO> getByOrderByLevelAsc() {
        return tutorialMapper.toDTO(querySortingRSM.getByOrderByLevelAsc());
    }

    @Override
    public List<TutorialDTO> getByOrderByLevelDesc() {
        return tutorialMapper.toDTO(querySortingRSM.getByOrderByLevelDesc());
    }

    @Override
    public List<TutorialDTO> getByTitleContainingOrderByLevelDesc(String title) {
        return tutorialMapper.toDTO(querySortingRSM.getByTitleContainingOrderByLevelDesc(title));
    }

    @Override
    public List<TutorialDTO> getByPublishedOrderByCreatedAtDesc(boolean isPublished) {
        return tutorialMapper.toDTO(querySortingRSM.getByPublishedOrderByCreatedAtDesc(isPublished));
    }

    @Override
    public List<TutorialDTO> getByTitleContainingSortByLevelDesc(String title) {
        return tutorialMapper.toDTO(querySortingRSM.findByTitleContaining(title, Sort.by("level").descending()));
    }

    @Override
    public List<TutorialDTO> getByPublishedSortByLevelDesc(boolean isPublished) {
        return tutorialMapper.toDTO(querySortingRSM.findByPublished(isPublished, Sort.by("level").descending()));
    }
}
