

fun main(args: Array<String>) {
    var myArray = arrayOf(1, 1.23, "Doug")
    println(myArray[2])
    myArray[1] = 3.14
    println("Array lenght : ${myArray.size}")
    println("Doug in array : ${myArray.contains("Doug")}")
    var partArray = myArray.copyOfRange(0, 1) //two first elements
    println("First : ${myArray.first()}")
    println("Doug index : ${myArray.indexOf("Doug")}")

    //collections
    var squareArray = Array(5, { x -> x * x })
    //ovan blir automagiskt en array med 0,1,2,3,4 och sedan kvadreras den

    for(x in squareArray) println(x)
    println("Square array : ${squareArray.size}")

    var arr2: Array<Int> = arrayOf(1,2,3)
}