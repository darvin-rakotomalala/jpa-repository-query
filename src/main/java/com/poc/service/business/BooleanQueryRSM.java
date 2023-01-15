package com.poc.service.business;

import com.poc.model.domain.Tutorial;

import java.util.List;

public interface BooleanQueryRSM {
    List<Tutorial> getByPublishedTrue();
    List<Tutorial> getByPublishedFalse();
}
