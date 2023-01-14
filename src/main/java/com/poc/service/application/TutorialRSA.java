package com.poc.service.application;

import com.poc.model.dto.TutorialDTO;
import com.poc.utils.HelpPage;
import org.springframework.data.domain.Pageable;

public interface TutorialRSA {
    public TutorialDTO getTutorialById(Long id);
    public HelpPage<TutorialDTO> getAllTutorialsByTitle(String title, Pageable pageable);
}
