package com.esgi.domain;

import com.esgi.domain.operators.Operator;
import java.util.List;

public class Calculator {
    private final Input input;
    private final Parser<Long> parser;
    private final Output output;
    private final Logger logger;
    private final Operator operator;

    public Calculator(Input input, Parser<Long> parser, Output output, Logger logger, Operator operator) {
        this.input = input;
        this.parser = parser;
        this.output = output;
        this.logger = logger;
        this.operator = operator;
    }

    public void calculate() {
        logger.log("started");
        logger.log("applying operation addition");
        List<String> input = this.input.getInput();
        if (input.size() == 0) {
            logger.log("invalid input leaving");
            return;
        }
        long accumulator = 0;
        for (int i = 0; i < input.size(); i++) {
            long number = parser.parse(input.get(i));
            logger.log("parsed value = " + number);
            if (i == 0) {
                accumulator = number;
                output.out(String.valueOf(number));
            } else {
                accumulator = operator.calc(accumulator, number);
                output.out(operator.toString() + number + " (= " + accumulator + ")");
            }
            logger.log("accumulation : " + accumulator + " on line : " + (i + 1));
        }
        output.out("Total = " + accumulator);
        logger.log("end of program");
    }
}
