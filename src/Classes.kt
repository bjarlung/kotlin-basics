
fun main(args: Array<String>) {
    val bowser = Animal("Bowser", 20.0, 13.5)
    bowser.getInfo()

    val spot = Dog("Spot", 20.0, 14.5, "Paul Smith")
    spot.getInfo()

    val tweety = Bird("Tweety", true)

    tweety.fly(10.0)

    //exception
    val spoty = Dog("Spot67y", 54.0, 54.6, "Hasse")

}

//no static methods
//classes will be marked as final by default unless marked open

open class Animal(val name: String,
                  var height: Double,
                  var weight: Double) {
    //initialize and verify if a value is ok
    //Regular expressions -Regex. no number inside the string
    init {
        val regex = Regex(".*\\d+.*")
        //if requirement not met => IllegalArgumentException
        //matches, any character inside matches for the regex
        require(!name.matches(regex)) {"Animal name can't contain numbers"}
        require(height > 0) {"Height must be greater than zero"}
        require(weight > 0) {"Weight must be greater than zero"}
    }

    // if you want the option to override method, needs open
    open fun getInfo(): Unit {
        println("$name is $height tall and weighs $weight")
    }
}

//Inheritance Extends => : Animal
class Dog(name: String,
          height: Double,
          weight: Double,
          var owner: String) : Animal(name, height, weight) {

    override fun getInfo(): Unit {
        super.getInfo()
        println("and is owned by $owner")
    }
}

// interfaces - contract to implement all fields and methods
interface Flyable {
    var flies: Boolean
    fun fly(distMiles: Double): Unit
}

class Bird constructor(val name: String,
                       override var flies: Boolean = true) : Flyable {
    override fun fly(distMiles: Double): Unit {
        if(flies) {
            println("$name flies $distMiles miles")
        }
    }
}
