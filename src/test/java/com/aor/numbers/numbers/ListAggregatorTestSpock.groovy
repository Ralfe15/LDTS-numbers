package pt.up.fe.ldts.numbers

import spock.lang.Specification

class ListAggregatorTestSpock extends Specification{
    def testList;
    def setup() {
        testList = Arrays.asList(0,1,2,3);
    }
    def "sum test"(){
        given:
            def aggregator = new ListAggregator();
        when:
            def sum = aggregator.sum(testList);
        then:
            6==sum;
    }

    def "max test"(){
        given:
            def aggregator = new ListAggregator();
        when:
            def max = aggregator.max(testList);
        then:
            max == 3;
    }
    def "min test"(){
        given:
        def aggregator = new ListAggregator();
        when:
        def min = aggregator.min(testList);
        then:
        min == 0;
    }
    def "distinct test"(){
        given:
        def aggregator = new ListAggregator();
        def deduplicator = new ListDeduplicator(new ListSorter());
        when:
        def distinct = aggregator.distinct(testList, deduplicator);
        then:
        distinct == 4;
    }

}
