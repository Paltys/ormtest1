package com.ormtask.controllers;

import com.ormtask.entity.Films;
import com.ormtask.entity.User;
import com.ormtask.entity.UserForm;
import com.ormtask.service.FilmService;
import com.ormtask.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLOutput;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private FilmService filmService;

    @Autowired
    private UserService userService;



    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView getIndex(){
        ModelAndView mav = new ModelAndView();
        if (true){
            List<Films> filmList = filmService.getAll();
            mav.addObject("films", filmList);
            mav.addObject("userForm", new UserForm()); //Добавил пустой объект
            mav.addObject("user", new User()); //Добавил пустой объект
            mav.setViewName("index");
        }

        return mav;
    }

    @RequestMapping(value = "/index",method = RequestMethod.POST)
    public ModelAndView getUser(@ModelAttribute("userForm") UserForm userForm ){
        ModelAndView mav = new ModelAndView();

        List<Films> filmList = filmService.getAll();
        mav.addObject("films", filmList);

        String login = userForm.getName();
        String pass =  userForm.getPass();

        System.out.println(userForm.getName()+" "+userForm.getPass());

        User user = userService.getByName(login, pass);
        mav.addObject("user", user);
            if (user.getRole_users()==1){
                mav.setViewName("admin");
                System.out.println("admin tut");
                return mav;
            }
        mav.setViewName("index");
        System.out.println("ne admin");

        return mav;

    }


}
