val sum = { x: Int, y: Int ->
    x + y
}

fun add(num1: Int, num2: Int, op: (Int, Int) -> Int) {
    println(op(num1, num2))
}


fun main() {
    println(sum(10, 20))

    add(10, 20) { num1, num2 ->
        num1 + num2
    }


    var vehicle = "Car"
    var animal = "Cat"

    val closure = {
        println(vehicle)
        println(animal)
    }

    closure()

    vehicle = "Bus"
    animal = "Dog"

    closure()
}