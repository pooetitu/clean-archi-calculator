package com.esgi.domain.operators;

public class OperatorSelector {
    public Operator getOperator(String operator) {
        return switch (operator) {
            case "+" -> new AdditionOperator();
            case "-" -> new SubtractOperator();
            case "*" -> new MultiplyOperator();
            default -> null;
        };
    }
}
