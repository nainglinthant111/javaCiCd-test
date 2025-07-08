package com.gic.GicDemo.common;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String handleAllExceptions(Exception ex, Model model) {
        log.error("error message : ", ex);
        // Optionally pass error details to the view
        model.addAttribute("errorMessage", ex.getMessage());
        return "/error"; // This will render src/main/resources/templates/error.html
    }
}
