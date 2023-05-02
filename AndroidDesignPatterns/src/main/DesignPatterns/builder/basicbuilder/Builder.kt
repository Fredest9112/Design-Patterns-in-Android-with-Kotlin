package builder.basicbuilder

interface BuilderInterface {
    fun buildBody()
    fun insertWheels()
    fun addHeadLights()
    val vehicle: Product
}

internal class Car : BuilderInterface {
    override val vehicle = Product()
    override fun buildBody() {
        vehicle.add("this is a body of a car")
    }

    override fun insertWheels() {
        vehicle.add("4 wheels are added")
    }

    override fun addHeadLights() {
        vehicle.add("2 headlights are added")
    }
}

internal class Motorcycle : BuilderInterface {
    override val vehicle = Product()
    override fun buildBody() {
        vehicle.add("this is a body of a motorcycle")
    }

    override fun insertWheels() {
        vehicle.add("2 wheels are added")
    }

    override fun addHeadLights() {
        vehicle.add("1 headlight is added")
    }
}
