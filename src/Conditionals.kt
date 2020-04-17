
fun main(args: Array<String>) {
    // conditional operators > < <= >= == !=
    // logical operators && || !

    val age = 8

    if(age < 5) {
        println("Go to preeschool")
    } else if(age == 5) {
        println("Go to kindergarten")
    } else if((age > 5) && (age <= 17)) {
        val grade = age - 5
        println("Go to grade $grade")
    } else {
        println("Go to college")
    }

    // When - conditional operator (like switch in other languages)
    when(age) {
        0,1,2,3,4 -> println("Go to preschool")
        5 -> println("Go to kindergarten")
        in 6..17 -> {
            val grade = age - 5
            println("Go to grade $grade")
        }
        else -> println("Go to college") //default
    }
}