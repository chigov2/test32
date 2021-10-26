package ktln

fun main(){
val a: String? = null
val b: String? = "854095843"
val c: String? = ""
    val result = (a?.length?:0) + (b?.length?:0) +(c?.length?:0)
    println(result)

    val test = arrayOf(1,2,3,3,3,5,6)
    test[4] = 9
    println("test4 = ${test[4]}")

    val array2 = arrayOfNulls<Int?>(10)
    println(array2[3])

    val listOfNumbers: MutableList<Int> = mutableListOf()
    listOfNumbers.add(5)
    println(listOfNumbers.get(0))

    println(max(5,52))
    println(crop("122344543589-6fkgjd;lf45"))
}

fun max(a: Int, b:Int) = if (a >b) a else b
fun crop(str:String) = str.substring(0, Math.min(12,str.length))