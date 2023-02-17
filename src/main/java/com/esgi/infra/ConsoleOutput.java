package com.esgi.infra;

import com.esgi.domain.Output;

public class ConsoleOutput implements Output {

    @Override
    public void out(String message) {
        System.out.println(message);
    }
}
