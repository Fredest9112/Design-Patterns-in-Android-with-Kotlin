package singleton.doublecheckedlocked

object TestSingleton {
    @JvmStatic
    fun main(args: Array<String>) {
        var s: Singleton? = Singleton.instance
        //set data value
        s!!.data = 55
        println("First reference: $s")
        println("Singleton data value is: " + s.data)

        //get another reference to the singleton
        s = Singleton.instance
        println("Second reference: $s")
        println("Singleton data value is: " + s!!.data)
    }
}