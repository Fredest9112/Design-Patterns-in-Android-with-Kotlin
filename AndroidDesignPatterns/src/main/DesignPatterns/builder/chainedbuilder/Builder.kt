package builder.chainedbuilder

internal abstract class Builder {
    abstract fun buildBody(body: String): Builder
    abstract fun insertWheels(wheels: String): Builder
    abstract fun addHeadLights(headlights: String): Builder
    abstract fun build(): Product
}

internal class CarBuilder : Builder() {
    private val product = Product()
    override fun buildBody(body: String): Builder {
        product.add(body)
        return this
    }

    override fun insertWheels(wheels: String): Builder {
        product.add(wheels)
        return this
    }

    override fun addHeadLights(headlights: String): Builder {
        product.add(headlights)
        return this
    }

    override fun build(): Product {
        return product
    }
}

internal class MotorcycleBuilder : Builder() {
    private val product = Product()
    override fun buildBody(body: String): Builder {
        product.add(body)
        return this
    }

    override fun insertWheels(wheels: String): Builder {
        product.add(wheels)
        return this
    }

    override fun addHeadLights(headlights: String): Builder {
        product.add(headlights)
        return this
    }

    override fun build(): Product {
        return product
    }
}
