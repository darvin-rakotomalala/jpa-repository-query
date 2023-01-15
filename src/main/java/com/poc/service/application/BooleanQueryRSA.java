package com.poc.service.application;

import com.poc.model.dto.TutorialDTO;

import java.util.List;

public interface BooleanQueryRSA {
    List<TutorialDTO> getByPublishedTrue();
    List<TutorialDTO> getByPublishedFalse();
}
