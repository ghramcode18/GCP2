package org.closure.gcp.controllers;

import org.closure.gcp.models.AnswerModel;
import org.closure.gcp.services.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(path = "/api/v1/answers")
public class AnswerController {
    
    @Autowired
    AnswerService answerService;

    @RequestMapping(value="/addanswer", method=RequestMethod.POST)
    public Object requestMethodName(@RequestBody AnswerModel answer) {
        return answerService.createAnswer(answer);
    }
    @RequestMapping(value="/addanswerwithquestion/{Question}", method=RequestMethod.POST)
    public Object requestMethodName(@RequestBody AnswerModel answer,@PathVariable(name = "Question") String Question)  {
        try {
            return answerService.createAnswerWithQuestion(answer,Question);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
}
