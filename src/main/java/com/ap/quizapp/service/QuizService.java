package com.ap.quizapp.service;

import com.ap.quizapp.dao.QuestionDao;
import com.ap.quizapp.dao.QuizDao;
import com.ap.quizapp.model.Questions;
import com.ap.quizapp.model.QuestionsWrapper;
import com.ap.quizapp.model.Quiz;
import com.ap.quizapp.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;

    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {

        List<Questions> questions = questionDao.findRandomQuestionsByCategory(category,numQ);

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);

        quizDao.save(quiz);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionsWrapper>> getQuizQuestions(Integer id) {
        Optional<Quiz> quiz = quizDao.findById(id);
        List<Questions> questionsfromDB = quiz.get().getQuestions();
        List<QuestionsWrapper> questionsForUser = new ArrayList<QuestionsWrapper>();
        for(Questions q: questionsfromDB){
            QuestionsWrapper qw = new QuestionsWrapper(q.getId(),q.getQuestion(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4());
            questionsForUser.add(qw);
        }
        return new ResponseEntity<>(questionsForUser,HttpStatus.OK);
    }

    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
        Quiz quiz = quizDao.findById(id).get();
        List<Questions> questions = quiz.getQuestions();
        int right =0;
        int i =0;
        for(Response response : responses){
            if(response.getResponse().equals(questions.get(i).getAnswer()))
                right++;

            i++;

        }
        return  new ResponseEntity<>(right,HttpStatus.OK);
    }
}
