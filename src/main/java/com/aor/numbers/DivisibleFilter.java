package com.aor.numbers;

public class DivisibleFilter implements GenericListFilter{
    private int divisor;

    public DivisibleFilter(int divisor) {
        this.divisor = divisor;
    }

    @Override
    public boolean accept(Integer number) {
        return number % divisor == 0 ? true : false;
    }
}