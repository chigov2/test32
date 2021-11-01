package ktln.open

class Programmer(name:String, age:Int, val language:String): Worker(name, age), Cleaner {
    override fun work() {//ctrl-O  class pereopredelit
        println("Pishu na $language")
    }

    override fun clean() {
        println("Coder is cleaning")
    }
}