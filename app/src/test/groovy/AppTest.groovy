import spock.lang.Specification

class AppTest extends Specification {

    def "application has a greeting"() {
        setup:
        def app = new App()

        when:
        def result = app.timestamp()

        then: 'the result is a timestamp string' // we can't test the value
        result ==~ /\d{4}-\d{2}-\d{2} \d{2}:\d{2}:\d{2}/
    }
}
