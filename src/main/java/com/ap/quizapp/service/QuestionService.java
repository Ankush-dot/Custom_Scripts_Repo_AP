package com.ap.quizapp.service;

import com.ap.quizapp.model.Questions;
import com.ap.quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;


    public ResponseEntity<List<Questions>> getAllQuestion() {
        try {
            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }
    public ResponseEntity<List<Questions>> getQuestionsByCategory(String category) {
        if(!questionDao.findByCategory(category).isEmpty()) {
            return new ResponseEntity<>(questionDao.findByCategory(category), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(new ArrayList<>(),HttpStatus.NOT_FOUND);
        }
    }


    public ResponseEntity<String> addQuestion(Questions questions) {
        try {
            questionDao.save(questions);
            return new ResponseEntity<>("Success!!", HttpStatus.CREATED);
        }catch (Exception e){
           return new ResponseEntity<>("Failed!!", HttpStatus.NOT_ACCEPTABLE);
        }
    }

    public ResponseEntity<String> deleteQuestionByID(int id) {
            if(questionDao.existsById(id)){
                questionDao.deleteById(id);
                return new ResponseEntity<>("Deleted Successfully!!", HttpStatus.OK);
            }else{
                return new ResponseEntity<>(id + " : ID is Not Present!!", HttpStatus.NOT_FOUND);
            }
    }
}
