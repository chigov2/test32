package ktln

fun main(){
    val a: String? = null
    val b: String? = "854095843"
    val c: String? = ""
    val text: String = "ewofihofho"
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
    val array5 = arrayOfNulls<Int?>(101)
    for (i in array5.indices)
    {array5[i] = i}

    for ((index,i) in array5.withIndex())
    {
        array5[index] = i?.times(2)
        //println("array5[$i] = $i")
    }
    for(i in array5){
        println("array5[$i] = $i")
    }

    val array = arrayOfNulls<Int>(301)
    for ((index,i) in (300..600).withIndex()){
        array[index] = i
    }
    for (i in (array.size - 1) downTo 0 step 5)
    {
        println(array[i])
    }
    println(crop(text))

}

fun max(a: Int, b:Int) = if (a >b) a else b
fun crop(text:String) = text.substring(0,Math.min(7,text.length))