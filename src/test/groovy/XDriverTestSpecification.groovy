import spock.lang.Specification

class XDriverTestSpecification extends Specification {

    def "one plus one should equal two"() {
        expect:
        1 + 1 == 2
    }

    def "numbers to the power of two"(int a, int b, int c) {
        expect:
        Math.pow(a, b) == c

        where:
        a | b | c
        1 | 2 | 1
        2 | 2 | 4
        2 | 3 | 8
    }
}
