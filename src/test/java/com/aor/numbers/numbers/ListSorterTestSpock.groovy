package pt.up.fe.ldts.numbers

import spock.lang.Specification

class ListSorterTestSpock extends Specification{
    def testList;
    def expectedList;

    def setup(){
        testList = Arrays.asList(3, 2, 6, 1, 4, 5, 7);
        expectedList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    }
    def "test sort"(){
        given:
        ListSorter sorter = new ListSorter();
        when:
        testList = sorter.sort(testList);
        then:
        expectedList==testList

    }
}
