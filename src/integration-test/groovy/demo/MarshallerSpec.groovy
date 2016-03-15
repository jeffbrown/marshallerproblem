package demo

import grails.converters.JSON
import grails.test.mixin.integration.Integration
import spock.lang.Specification

@Integration
class MarshallerSpec extends Specification {

    void "test marshalling subclass"() {
        when:
        def sub = new PojoSubclass()
        
        then: 'secondProperty should be represented, firstProperty should not'
        new JSON(sub).toString() == '{"secondProperty":null}'
    }
}
