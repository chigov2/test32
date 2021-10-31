package ktln.open

class Programmer(name:String, age:Int, val language:String): Worker(name, age) {
    override fun work() {//ctrl-O  class pereopredelit
        println("Pishu na $language")
    }
}