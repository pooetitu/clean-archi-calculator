package com.esgi.infra;

import com.esgi.domain.Logger;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsoleLogger implements Logger {
    private final SimpleDateFormat dateFormat;

    public ConsoleLogger(SimpleDateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    @Override
    public void log(String message) {
        System.out.println("[" + dateFormat.format(new Date()) + "][log] " + message);
    }
}
