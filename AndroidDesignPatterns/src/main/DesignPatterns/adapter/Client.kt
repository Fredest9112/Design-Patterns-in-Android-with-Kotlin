package adapter

object Client {
    @JvmStatic
    fun main(args: Array<String>) {
        val duck = MallardDuck()
        val turkey = WildTurkey()
        val turkeyAdapter: Duck = TurkeyAdapter(turkey)
        println("The turkey says...")
        turkey.gobble()
        turkey.fly()
        println("The duck says...")
        duck.quack()
        duck.fly()
        println("The turkey adapter says...")
        turkeyAdapter.quack()
        turkeyAdapter.fly()
    }
}
