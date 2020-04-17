import java.util.Random

// Tutorial: https://www.youtube.com/watch?v=H_oGi8uuDpA

fun main(args : Array<String>) {
    //note: Local function (funktioner i funktioner) can access local variables of outer functions

    fun add(num1: Int, num2: Int): Int = num1 + num2
    println("5 + 4 = ${add(5,4)}")

    //Single line functions do not need a return type
    fun subtract(num1: Int = 1, num2: Int =1) = num1 - num2 //with defaults
    println("5 - 4 = ${subtract(5,4)}")

    //Named paramerters
    println("4 - 5 = ${subtract(num2 = 5, num1 = 4)}")

    //Unit like void
    fun sayHello(name: String): Unit = println("Hello $name")
    sayHello("Paul")

    //return two values
    fun nextTwo(num: Int): Pair<Int, Int> {
        return Pair(num+1, num+2)
    }
    // declare two variables
    val (two, three) = nextTwo(1)
    println("1 => $two $three")

    //vararg skicka olika antal parapetrar, blir en array
    fun getSum(vararg nums: Int): Int {
        var sum = 0
        nums.forEach {n -> sum += n}
        return sum
    }
    println("Sum = ${getSum(1, 2, 3, 4, 5)}")

    //command and define function literals. Lambda syntax
    val multiply = {num1: Int, num2: Int -> num1 * num2}
    println("5 * 3 = ${multiply(5, 3)}")

    //https://kotlinlang.org/docs/reference/functions.html
    // Kotlin supports a style of functional programming known as tail recursion.
    // This allows some algorithms that would normally be written using loops
    // to instead be written using a recursive function,
    // but without the risk of stack overflow.
    // When a function is marked with the tailrec modifier and meets the required form,
    // the compiler optimises out the recursion,
    // leaving behind a fast and efficient loop based version instead


    //Calculate factorial with tail recursion
    fun factorial(x: Int): Int {
        tailrec fun factTail(y: Int, z: Int): Int {
            if (y == 0) return z
            else return factTail(y -1, y * z)
        }
        return factTail(x, 1)
    }
    println("Factorial of 5 =>  5! = ${factorial(5)}")
}





