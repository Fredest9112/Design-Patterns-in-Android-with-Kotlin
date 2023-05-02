package singleton.billpugh

object TestSingleton {
    @JvmStatic
    fun main(args: Array<String>) {
        // Get the singleton instance and set its data value
        val s = Singleton.getInstance()
        s.data = 55

        // Print the singleton instance and its data value
        println("First reference: $s")
        println("Singleton data value is: ${s.data}")

        // Get another reference to the singleton and print it and its data value
        val s2 = Singleton.getInstance()
        println("Second reference: $s2")
        println("Singleton data value is: ${s2.data}")
    }
}