package ktln

var name: String? = "ewrewrewrew"

fun test34()
{
    val list = mutableListOf<Int>()
    with(list){
        for (i in 1..10)
        {
            this.add((Math.random() *100).toInt())
        }
        print("\nList $list \n" )
        for (i in list)
        {
            print("$i " )
        }

        println(sum())
        println(minOrNull())
        println(maxOrNull())
        println(average())
        println(first())
        println(last())
    }


//    print("List $list \n" )
//    println(list.sum())
//    println(list.minOrNull())
//    println(list.maxOrNull())
//    println(list.average())
//    println(list.first())
//    println(list.last())

}

fun lett33()
{
    name?.let {
        if (it.length > 5)
        {
            println("$it")
        }
    }
}
val list = mutableListOf<Int>()


fun test234() {
    list?.let {
        with(list) {

            for (i in 1..20) {
                this.add((Math.random() * 100).toInt())
            }
            val result = this.filter { it % 2 == 0 }.take(5)
            for (i in list) {
                print("$i ")
            }
            println()
            for (i in result) {
                print("$i ")
            }
        }
    }
}

fun qwerty()
{
    val coder = Worker("MIkee","Coder", 2017)
    coder.printInfo()
}

fun Worker.printInfo()
{
    println("Name: $name Position:$position Start year: $startYear Time: $experiance")
}

fun main()
{
    val student1 = Student("Ivan","Ivanov","25")
    val student2 = Student("Ivan","Ivanov","25")
    val(name1,lastName,id) = student1//destructor
    println(name1)
   // val student2 = Student("Petr","Petrov","38")
    println(student1)
    println(student2)
    println(student1.hashCode())
    println(student2.hashCode())
    println(student1 == student2)
    println(student1 ===student2)
}