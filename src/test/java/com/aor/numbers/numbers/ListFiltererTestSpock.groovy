package pt.up.fe.ldts.numbers

import spock.lang.Specification

class ListFiltererTestSpock extends Specification{
    def testList;
    def expectedList;
    def setup(){
        testList = Arrays.asList(1,2,3,4,5);
        expectedList = Arrays.asList(1,3,5);
    }
    def "test filterer"(){
        given:
        GenericListFilter filter = Mock(GenericListFilter.class);
        filter.accept(1) >> true;
        filter.accept(2) >> false;
        filter.accept(3) >> true;
        filter.accept(4) >> false;
        filter.accept(5) >> true
        when:
        def myfilter = new ListFilterer(filter)
        then:
        expectedList == myfilter.filter(testList)
    }
}
