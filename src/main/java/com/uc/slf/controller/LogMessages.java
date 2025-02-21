package com.uc.slf.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LogMessages {

    private static final Logger logger = LoggerFactory.getLogger(LogMessages.class);

    @GetMapping("/log")
    public String logExample() {
        logger.info("INFO: This is an info message");
        logger.debug("DEBUG: This is a debug message");
        logger.warn("WARN: This is a warning message");
        logger.error("ERROR: This is an error message");

        return "Check the logs for messages!";
    }
}

