package com.ap.quizapp.controller;

import com.ap.quizapp.model.Questions;
import com.ap.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Questions>> getAllQuestions(){
        return questionService.getAllQuestion();
    }

    @GetMapping("category/{cat}")
    public ResponseEntity<List<Questions>> getQuestionsByCategory(@PathVariable("cat") String category){
        return questionService.getQuestionsByCategory(category);
    }

    @DeleteMapping("deleteQuestByid/{id}")
    public ResponseEntity<String> deleteQuestionById(@PathVariable int id){
        return questionService.deleteQuestionByID(id);
    }

    @PostMapping("addQuestion")
    public ResponseEntity<String> addQuestion(@RequestBody Questions questions){
        return questionService.addQuestion(questions);
    }

    @GetMapping("getAll")
    public String getAll(){System.out.println("Hey ALL"); return "Hello";}

}

