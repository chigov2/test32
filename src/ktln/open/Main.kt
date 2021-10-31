package ktln.open

fun main()
{
    val workers = mutableListOf<Worker>()
    workers.add(Worker("Mikee",37))
    workers.add(Worker("Petr",67))
    workers.add(Worker("Sveta",56))
    workers.add(Programmer("Sasha",37,"Kotlin"))
    workers.add(Programmer("Natasha",57,"Java"))
    for (i in workers)
    {
        i.work()
    }
}