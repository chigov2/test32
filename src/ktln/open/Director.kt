package ktln.open

class Director(name:String, age:Int):Worker(name, age) {
    override fun work() {
        println("CEO")
    }
}