package com.taskapp.taskapp.controllers;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TaskItemController {
    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(TaskItemController.class);
    
    @GetMapping("/")
    public ModelAndView index() {
        logger.debug("request to GET index");
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}
