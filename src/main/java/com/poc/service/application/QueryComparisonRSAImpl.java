package com.poc.service.application;

import com.poc.mapper.TutorialMapper;
import com.poc.model.dto.TutorialDTO;
import com.poc.service.business.QueryComparisonRSM;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
@Service
public class QueryComparisonRSAImpl implements QueryComparisonRSA {

    private final QueryComparisonRSM queryWithComparisonRSM;
    private final TutorialMapper tutorialMapper;

    @Override
    public List<TutorialDTO> getByLevelGreaterThan(int level) {
        return tutorialMapper.toDTO(queryWithComparisonRSM.getByLevelGreaterThan(level));
    }

    @Override
    public List<TutorialDTO> getByCreatedAtGreaterThanEqual(Date date) {
        return tutorialMapper.toDTO(queryWithComparisonRSM.getByCreatedAtGreaterThanEqual(date));
    }

    @Override
    public List<TutorialDTO> getByCreatedAtAfter(Date date) {
        return tutorialMapper.toDTO(queryWithComparisonRSM.getByCreatedAtAfter(date));
    }

    @Override
    public List<TutorialDTO> getByCreatedAtBefore(Date date) {
        return tutorialMapper.toDTO(queryWithComparisonRSM.getByCreatedAtBefore(date));
    }

    @Override
    public List<TutorialDTO> getByLevelBetween(int start, int end) {
        return tutorialMapper.toDTO(queryWithComparisonRSM.getByLevelBetween(start, end));
    }

    @Override
    public List<TutorialDTO> getByLevelBetweenAndPublished(int start, int end, boolean isPublished) {
        return tutorialMapper.toDTO(queryWithComparisonRSM.getByLevelBetweenAndPublished(start, end, isPublished));
    }

    @Override
    public List<TutorialDTO> getByCreatedAtBetween(Date start, Date end) {
        return tutorialMapper.toDTO(queryWithComparisonRSM.getByCreatedAtBetween(start, end));
    }

}
