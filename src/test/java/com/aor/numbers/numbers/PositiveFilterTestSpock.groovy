package pt.up.fe.ldts.numbers

import spock.lang.Specification

class PositiveFilterTestSpock extends Specification{
    def positives;
    def nonpositives;

    def setup(){
        positives = Arrays.asList(1, 2, 3, 10, 100, 1000, Integer.MAX_VALUE);
        nonpositives = Arrays.asList(0, -1, -2, -3, -10, -100, -1000, Integer.MIN_VALUE);
    }
    def "test positive filter"(){
        when:
        PositiveFilter filter = new PositiveFilter();
        then:
        positives.every {it->filter.accept(it)}
        nonpositives.every {it->!filter.accept(it)}

    }


}
