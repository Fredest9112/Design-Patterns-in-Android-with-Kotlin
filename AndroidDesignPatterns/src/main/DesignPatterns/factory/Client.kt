package factory

object Client {
    @JvmStatic
    fun main(args: Array<String>) {
        val shapeFactory = ShapeFactory()
        val shape1 = shapeFactory.getShape("CIRCLE")
        shape1?.draw()
        val shape2 = shapeFactory.getShape("SQUARE")
        shape2?.draw()
        val shape3 = shapeFactory.getShape("RECTANGLE")
        shape3?.draw()
    }
}
