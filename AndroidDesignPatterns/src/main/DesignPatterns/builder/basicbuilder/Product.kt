package builder.basicbuilder

import java.util.*

class Product {
    private val parts: LinkedList<String> = LinkedList()

    fun add(part: String) {
        parts.addLast(part)
    }

    fun show() {
        println("product completed as below:")
        for (part in parts) {
            println(part)
        }
    }
}
