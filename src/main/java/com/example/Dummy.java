package com.example;

import java.util.logging.Logger;

public class Dummy {
    private static final Logger logger = Logger.getLogger(Dummy.class.getName());

    public void sayHello() {
        logger.info("Hello, clean world!");
    }
}

