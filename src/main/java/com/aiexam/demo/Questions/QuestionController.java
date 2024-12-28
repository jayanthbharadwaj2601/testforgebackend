package com.aiexam.demo.Questions;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aiexam.demo.Users.Users;
@CrossOrigin(origins = "*")
@RestController
public class QuestionController {
    @Autowired
    public QuestionRepository crud;
    @PostMapping("postquestion")
    @ResponseBody
    public Question postquestion(@RequestBody Question q1)
    {
        crud.save(q1);
        Question b = new Question();
        Iterable<Question> a =crud.findAll();
        for(Question i:a)
        b = i;
        return b;
    }
    @PostMapping("getquestions")
    public List<Question> getquestions(@RequestBody Users user)
    {
        List<Question> e = new ArrayList<>();
        Iterable<Question> a = crud.findAll();
        for(Question i:a)
        {
            if(user.username.equals(i.username))
            {
                e.add(i);
            }
        }
        return e;
    }
    

}
