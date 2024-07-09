package in.main.service;

import java.util.List;
import java.util.Optional;

import in.main.model.Question;

public interface IQuestionService 
{
	 Question createQuestion(Question question);

	    List<Question> getAllQuestions();

	    Optional<Question> getQuestionById(Long id);

	    List<String> getAllSubjects();

	    Question updateQuestion(Long id, Question question);

	    void  deleteQuestion(Long id);

	    List<Question> getQuestionsForUser(Integer numOfQuestions, String subject);

}
