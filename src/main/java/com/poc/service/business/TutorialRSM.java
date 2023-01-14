package com.poc.service.business;

import com.poc.model.domain.Tutorial;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TutorialRSM {
    public Tutorial getTutorialById(Long id);
    public Page<Tutorial> getAllTutorialsByTitle(String title, Pageable pageable);
}
