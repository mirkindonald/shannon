package com.shannon.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.ui.ModelMap;
public abstract class BaseController {
    public static final Logger logger = LogManager.getLogger(BaseController.class);
    
    @Autowired
    protected MessageSource messageSource = null;
   
    
    protected void addMessage(ModelMap model, String messageKey, String resultMessage) throws Exception {
        model.addAttribute(messageKey, resultMessage);
    }
    
    protected void addError(ModelMap model, String messageKey, String message){
        model.addAttribute(messageKey, message);
    }
    
    protected String getTodaysDate(String format){
    	SimpleDateFormat sdf = new SimpleDateFormat(format);
		Calendar cal = Calendar.getInstance();
		return sdf.format(cal.getTime());
    }
}
