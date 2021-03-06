import spock.lang.*

class TestSpec extends spock.lang.Specification {
	def "length of Spock's and his friends' names"() {
		expect:
		name.size() == length

		where:
		name     | length
		"Spock"  | 9
		"Kirk"   | 4
		"Scotty" | 6
	}
}
