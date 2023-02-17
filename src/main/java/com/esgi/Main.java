package com.esgi;

import com.esgi.domain.Calculator;
import com.esgi.domain.Input;
import com.esgi.domain.Logger;
import com.esgi.domain.Output;
import com.esgi.domain.Parser;
import com.esgi.domain.operators.Operator;
import com.esgi.domain.operators.OperatorSelector;
import com.esgi.infra.ConsoleLogger;
import com.esgi.infra.ConsoleOutput;
import com.esgi.infra.FileInput;
import com.esgi.infra.NumberParser;
import com.esgi.infra.VoidLogger;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Operator operator = new OperatorSelector().getOperator(args[1]);
        Output output = new ConsoleOutput();
        Logger logger;
        if (Arrays.asList(args).contains("-log")) {
            logger = new ConsoleLogger(new SimpleDateFormat("hhmmss:SSSSSS"));
        } else {
            logger = new VoidLogger();
        }
        Input input = new FileInput(args[0]);
        Parser<Long> parser = new NumberParser();

        Calculator calculator = new Calculator(input, parser, output, logger, operator);
        calculator.calculate();
    }
}
