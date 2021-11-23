package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListFiltererTest {
    List<Integer> list;
    List<Integer> expected;

    @Test
    public void divisibleBy2() {
        list = Arrays.asList(2,4,6,1,3,5);
        expected = Arrays.asList(2,4,6);
        ListFilterer filterer = new ListFilterer(new DivisibleFilter(2));
        for (int i : list){
            Assertions.assertEquals(expected, filterer.filter(list));
        }
    }
    @Test
    public void divisibleBy5() {
        list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        expected = Arrays.asList(5,10);
        ListFilterer filterer = new ListFilterer(new DivisibleFilter(5));
        for (int i : list){
            Assertions.assertEquals(expected, filterer.filter(list));
        }
    }

    @Test
    public void positive() {
        list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10);
        expected = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        ListFilterer filterer = new ListFilterer(new PositiveFilter());
        for (int i : list){
            Assertions.assertEquals(expected, filterer.filter(list));
        }
    }
}

