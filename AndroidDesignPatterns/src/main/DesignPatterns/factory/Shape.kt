package factory

interface Shape {
    fun draw()
}

internal class Rectangle : Shape {
    override fun draw() {
        println("Inside Rectangle::draw() method.")
    }
}

internal class Square : Shape {
    override fun draw() {
        println("Inside Square::draw() method.")
    }
}

internal class Circle : Shape {
    override fun draw() {
        println("Inside Circle::draw() method.")
    }
}
