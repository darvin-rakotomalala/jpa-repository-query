package com.poc.service.application;

import com.poc.mapper.TutorialMapper;
import com.poc.model.dto.TutorialDTO;
import com.poc.service.business.BooleanQueryRSM;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BooleanQueryRSAImpl implements BooleanQueryRSA {

    private final BooleanQueryRSM booleanQueryRSM;
    private final TutorialMapper tutorialMapper;

    @Override
    public List<TutorialDTO> getByPublishedTrue() {
        return tutorialMapper.toDTO(booleanQueryRSM.getByPublishedTrue());
    }

    @Override
    public List<TutorialDTO> getByPublishedFalse() {
        return tutorialMapper.toDTO(booleanQueryRSM.getByPublishedFalse());
    }

}
