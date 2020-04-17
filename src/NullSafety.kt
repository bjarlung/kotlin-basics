
//Null safety is built directly into kotlin

fun main(args: Array<String>) {

    //By default you cannot assign null
    //var nullValue: String = null
    var nullValue: String? = null

    //can return null
    fun returnNull(): String? {
        return null
    }

    var nullVal2 = returnNull()

    if(nullVal2 != null) {
        println("Nullval2.length")
    }

    //Force operator to force a null assignment
    //var nullVal3 = nullVal2!!.length

    //Elvis operator to assign a default value
    // if the value could be null
    //If you try to assign a null value to val4, instead assign "No name"
    var nullVal4: String = returnNull() ?: "No name"
}