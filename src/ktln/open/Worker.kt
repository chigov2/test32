package ktln.open

open class Worker(name:String,val age:Int) {
    open fun work()
    {
        println("I am working")
    }
}