package ktln.open

class Seller(name:String, age:Int):Worker(name, age), Cleaner {
    override fun work() {
        println("Selling goods")
    }

    override fun clean() {
        println("Seller is cleaning")
    }
}