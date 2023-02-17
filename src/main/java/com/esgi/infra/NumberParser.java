package com.esgi.infra;

import com.esgi.domain.Parser;

public class NumberParser implements Parser<Long> {
    @Override
    public Long parse(String element) {
        return Long.parseLong(element);
    }
}
