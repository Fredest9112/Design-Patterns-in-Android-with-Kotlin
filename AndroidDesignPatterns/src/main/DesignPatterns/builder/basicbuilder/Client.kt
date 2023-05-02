package builder.basicbuilder

object Client {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Builder demo:")
        val director = Director()
        val carBuilder: BuilderInterface = Car()
        val motorcycleBuilder: BuilderInterface = Motorcycle()
        director.construct(carBuilder)
        val p1 = carBuilder.vehicle
        p1.show()
        director.construct(motorcycleBuilder)
        val p2 = motorcycleBuilder.vehicle
        p2.show()
    }
}