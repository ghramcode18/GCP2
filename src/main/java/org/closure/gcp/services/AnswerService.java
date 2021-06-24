package org.closure.gcp.services;

import org.closure.gcp.entities.AnswerEntity;
import org.closure.gcp.entities.QuestionEntity;
import org.closure.gcp.models.AnswerModel;
import org.closure.gcp.models.QuestionModel;
import org.closure.gcp.repositories.AnswerRepo;
import org.closure.gcp.repositories.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {
    
    @Autowired
    AnswerRepo answerRepo;

    @Autowired
    QuestionRepo questionRepo;

    
    public AnswerModel createAnswer(AnswerModel answer)
    {
        AnswerEntity entity = answerRepo.save(new AnswerEntity().answer(answer.getAnswer()).status(answer.getStatus()));
        return answer.id(entity.getId());
    }

    public AnswerModel createAnswerWithQuestion(AnswerModel answer, String question) throws Exception
    {
        QuestionEntity questionEntity = questionRepo
            .findByQuestion(question)
            .orElseThrow(
                ()-> new Exception("no question with this value")
                );
        AnswerEntity entity = answerRepo.save(
            new AnswerEntity().answer(
                answer.getAnswer()).status(
                    answer.getStatus()
                    )
                );
        return answer.id(entity.getId()).question(new QuestionModel().id(questionEntity.getId()).pionts(questionEntity.getPionts()).question(questionEntity.getQuestion()));
    }
}
