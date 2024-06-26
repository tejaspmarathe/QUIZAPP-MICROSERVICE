package com.microservice.question.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.microservice.question.entity.Question;

@Service
public interface QuestionService{

	void addQuestion(Question question);

	void addQuestionList(List<Question> questionList);

	List<Question> getAllQuestions();

	Question getQuestion(Long questionid);

	List<Question> getQuestionByCategoryAndDifficultyLevel(String category, String difficultyLevel);

	List<Long> findRandomQuestions(String category, String difficultyLevel, int noOfQuestions);

	ResponseEntity<Question> updateQuestion(Question question, Long questionid);

	ResponseEntity<Void> deleteQuestion(Long questionid);
	
	List<Question> getAllQuestionsById(List<Long> questionid);

}
