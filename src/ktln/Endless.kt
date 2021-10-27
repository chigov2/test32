package ktln

//fun main2() {
    //val array = generateSequence(0,{it + 2}).take(10)
    //val array = generateSequence('A',{it + 1}).take(10)
    //val array = generateSequence({(Math.random()*100).toInt()}).take(10)
//    for (i in array)
//    {
//        println(i)
//    }
//}
//}
fun main() {
        val array = generateSequence(1, { it+1 }).take(10)
    for (i in array)
    {
        println("Employee #$i")
    }
    }
