package com.ap.quizapp.model;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestHeader;

@Data
@RequiredArgsConstructor
public class Response {

    private Integer id;
    private String response;

}
