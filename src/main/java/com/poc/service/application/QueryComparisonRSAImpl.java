package com.poc.service.application;

import com.poc.mapper.TutorialMapper;
import com.poc.model.dto.TutorialDTO;
import com.poc.service.business.QueryComparisonRSM;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
@Service
public class QueryComparisonRSAImpl implements QueryComparisonRSA {

    private final QueryComparisonRSM queryWithComparisonRSM;
    private final TutorialMapper tutorialMapper;

    public static Date strDateToSimpleDate(String strDate) throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(strDate);
    }

    @Override
    public List<TutorialDTO> getByLevelGreaterThan(int level) {
        return tutorialMapper.toDTO(queryWithComparisonRSM.getByLevelGreaterThan(level));
    }

    @Override
    public List<TutorialDTO> getByCreatedAtGreaterThanEqual(String date) throws ParseException {
        return tutorialMapper.toDTO(queryWithComparisonRSM.getByCreatedAtGreaterThanEqual(strDateToSimpleDate(date)));
    }

    @Override
    public List<TutorialDTO> getByCreatedAtAfter(String date) throws ParseException {
        return tutorialMapper.toDTO(queryWithComparisonRSM.getByCreatedAtAfter(strDateToSimpleDate(date)));
    }

    @Override
    public List<TutorialDTO> getByCreatedAtBefore(String date) throws ParseException {
        return tutorialMapper.toDTO(queryWithComparisonRSM.getByCreatedAtBefore(strDateToSimpleDate(date)));
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
    public List<TutorialDTO> getByCreatedAtBetween(String start, String end) throws ParseException {
        return tutorialMapper.toDTO(queryWithComparisonRSM.getByCreatedAtBetween(strDateToSimpleDate(start), strDateToSimpleDate(end)));
    }

}
