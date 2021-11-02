package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostControllers {
//    This controller should return strings for the following routes that describe what will ultimately be there.
//method	url	description
//GET	/posts	posts index page
//GET	/posts/{id}	view an individual post
//GET	/posts/create	view the form for creating a post
//POST	/posts/create	create a new post
  @GetMapping("/posts")
    @ResponseBody
    public String index(){
      return "Here are all the posts...";
  }

  @GetMapping("/posts/{id}")
    @ResponseBody
    public String



    

}
