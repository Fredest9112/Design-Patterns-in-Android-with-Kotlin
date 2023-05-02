package adapter

internal interface Duck {
    fun quack()
    fun fly()
}

internal class MallardDuck : Duck {
    override fun quack() {
        println("Mallard duck quacks")
    }

    override fun fly() {
        println("Mallard duck flies")
    }
}
