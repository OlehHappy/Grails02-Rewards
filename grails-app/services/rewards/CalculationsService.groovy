package rewards

import grails.transaction.Transactional

@Transactional
class CalculationsService {

    def welcome(params) {
        // http://localhost:8080/whiteboard/conditions/?name=Oleh&points=4
        def firstName = params.name
        def totalPoints = params.points.toInteger()
        def welcomeMessage = ""
        switch (totalPoints) {
            case 5:
                welcomeMessage = "Welcome back $firstName, this drink is on us."
                break
            case 4:
                welcomeMessage = "Welcome back $firstName, your next drink is free."
                break
            case 2..3:
                welcomeMessage = "Welcome back $firstName, you now have $totalPoints points."
                break
            default:
                welcomeMessage = "Welcome back $firstName. Thanks for registering"
        }
    }
}
