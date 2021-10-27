package ktln

fun test()
{
    val name = mutableListOf<String>()
    val phones = mutableListOf<Long>()
    for (i in 0..100)
    {
        name.add("Name #$i")
        phones.add(1_000_00000 +(Math.random() * 1_000_00000).toLong())
    }
    val users = name.zip(phones)
    for (i in users)
    {
        println("Name ${i.first} Phone +380${i.second}" )
    }

}
fun main()
{
    val fullNames = mutableListOf<String>()
    for(i in 0..2)
    {
        fullNames.add("Name$i Lastname$i")

    }
    //val names = fullNames.map { it.substringBefore(" ") }
    //val lastNames = fullNames.map { it.substringAfterLast(" ") }

    val users = fullNames.map { Pair (it.substringBefore(" "), it.substringAfter(" ")) }
    //println(fullNames)
    for (i in users)
    {
        println("Name ${i.first} Lastname ${i.second}" )
    }
}