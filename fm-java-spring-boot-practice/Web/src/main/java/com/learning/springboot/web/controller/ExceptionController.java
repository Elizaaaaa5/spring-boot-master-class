package com.learning.springboot.web.controller;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller("error")
public class ExceptionController {

    private Log logger = LogFactory.getLog(ExceptionController.class);

    @ExceptionHandler(Exception.class)
    public ModelAndView handleException(HttpServletRequest request, Exception ex){
        logger.error("Request: " + request.getRequestURL() + " raised" + ex);
        ModelAndView mav = new ModelAndView();
        mav.addObject("Exception", ex);
        mav.addObject("url", request.getRequestURL());
        mav.setViewName("error");
        return mav;
    }
}
