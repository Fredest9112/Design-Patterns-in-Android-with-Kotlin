package adapter

class TurkeyAdapter(private var turkey: Turkey) : Duck {
    override fun quack() {
        turkey.gobble()
    }

    override fun fly() {
        for (i in 0..4) {
            turkey.fly()
        }
    }
}
