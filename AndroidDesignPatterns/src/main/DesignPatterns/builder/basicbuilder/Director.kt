package builder.basicbuilder

class Director {
    private var myBuilder: BuilderInterface? = null
    fun construct(builder: BuilderInterface?) {
        myBuilder = builder
        myBuilder!!.buildBody()
        myBuilder!!.insertWheels()
        myBuilder!!.addHeadLights()
    }
}
