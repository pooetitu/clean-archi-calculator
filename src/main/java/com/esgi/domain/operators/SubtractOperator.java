package com.esgi.domain.operators;

public class SubtractOperator implements Operator {

    @Override
    public long calc(long a, long b) {
        return a - b;
    }

    @Override
    public String toString() {
        return "-";
    }
}
