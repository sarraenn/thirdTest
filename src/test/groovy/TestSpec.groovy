import spock.lang.*

class TestSpec extends spock.lang.Specification {
	def "length of Spock's and his friends' names"() {
		expect:
		name.size() == length

		where:
		name     | length
		"Spock"  | 523
		"Kirk"   | 455
		"Scotty" | 656
	}
}
