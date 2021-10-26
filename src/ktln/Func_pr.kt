package ktln

fun main()
{
    //val sum = { a:Int,b:Int -> a+b }
    //val sum: (Int,Int) -> Int = {a, b -> a+b}
    //println(sum(2,10))

    //val square = {a:Int -> a*a}
    //val square:(Int) -> Int = {it * it}
    //println(square(5))

    val perimeter:(Int, Int) -> Int ={a,b -> a * b}
    println("perimeter = ${perimeter(10, 20)}")

    val sayName:(String) -> Unit = { println("Hello, $it")}
    sayName("Mike")

    val sort:(Array<Int>) -> Array<Int> = {
        for(i in it.size -2 downTo 0)
        {
            for (j in 0..i)
            {
                if (it[j] < it[j+1])
                {
                    val temp = it[j]
                    it[j] = it[j+1]
                    it[j+1] = temp
                }
            }
        }
        it
    }

    val sorted:Array<Int> = sort(arrayOf(3,67,89,4,23))
    for(i in sorted) {
        println(i)
    }



}