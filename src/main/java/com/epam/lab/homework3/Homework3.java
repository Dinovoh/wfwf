package com.epam.lab.homework3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Homework3 {

    //Please give you feedback! Do we need to use final or not?
    private static final Logger LOG = LogManager.getLogger(Homework3.class);

    public static void main(String[] args) {

        LOG.info("Appending string: {}.", "New Run");

        LOG.debug("This Will Be Printed On Debug");
        LOG.info("This Will Be Printed On Info");
        LOG.warn("This Will Be Printed On Warn");
        LOG.error("This Will Be Printed On Error");
        LOG.fatal("This Will Be Printed On Fatal");


    }

}
