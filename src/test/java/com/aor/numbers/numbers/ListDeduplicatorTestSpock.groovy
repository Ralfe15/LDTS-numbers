package pt.up.fe.ldts.numbers

import spock.lang.Specification

class ListDeduplicatorTestSpock extends Specification{
    def testList;
    def expectedList;

    def setup(){
        testList = Arrays.asList(1,2,4,2,5);
        expectedList = Arrays.asList(1,2,4,5);
    }

    def "test deduplicate"(){
        given:
            GenericListSorter sorter = Mock(GenericListSorter.class);
            def deduplicator = new ListDeduplicator(sorter);
            sorter.sort(_) >> Arrays.asList(1,2,2,4,5)
        when:
            def distinct = deduplicator.deduplicate(testList)
        then:
            expectedList == distinct
    }
}
