package builder.chainedbuilder

object Client {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Builder demo:")
        val car = CarBuilder()
            .buildBody("this is a body of a car")
            .insertWheels("4 wheels are added")
            .addHeadLights("2 headlights are added")
            .build()
        car.show()
        val motorcycleProduct = MotorcycleBuilder()
            .buildBody("this is a body of a motorcycle")
            .insertWheels("2 wheels are added")
            .addHeadLights("1 headlight is added")
            .build()
        motorcycleProduct.show()
    }
}