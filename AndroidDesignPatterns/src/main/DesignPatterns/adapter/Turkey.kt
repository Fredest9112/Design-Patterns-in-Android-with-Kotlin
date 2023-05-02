package adapter

interface Turkey {
    fun gobble()
    fun fly()
}

class WildTurkey : Turkey {
    override fun gobble() {
        println("Wild Turkey gobbles")
    }

    override fun fly() {
        println("Wild Turkey flies a short distance")
    }
}
