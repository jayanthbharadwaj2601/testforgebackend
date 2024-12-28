package com.aiexam.demo.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class UserController {
    @Autowired
    public UserRepository crud;
    @PostMapping("signup")
    public Users setuser(@RequestBody Users user)
    {
        Iterable<Users> a = crud.findAll();
        int c=0;
        for(Users i:a)
        {
            if(i.username.equals(user.username))
            {
                c+=1;
            }
        }
        Users e = new Users();
        if(c==0)
        {
            crud.save(user);
            return user;
        }
        else
        {
            return e;
        }

    }
    @PostMapping("getuser")
    @ResponseBody
    public Users getusername(@RequestBody Users user)
    {
        Iterable<Users> a = crud.findAll();
        Users e = new Users();
        for(Users i:a)
        {
            if(i.username.equals(user.username))
            return i;
        }
        return e;
    }
    @PostMapping("login")
    public Users getuser(@RequestBody Users user)
    {
        Iterable<Users> a = crud.findAll();
        int c=0;
        for(Users i:a)
        {
            if(i.username.equals(user.username) && i.password.equals(user.password))
            {
                c+=1;
            }
        }
        Users e = new Users();
        if(c>0)
        {
            return user;
        }
        else
        {
            return e;
        }

    }
}
