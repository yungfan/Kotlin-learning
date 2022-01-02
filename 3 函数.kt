// 定义
// 参数列表与返回值之间用 :
fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

// 单行可以简化
fun div(num1: Int, num2: Int): Int = num1 / num2

// 默认参数
fun sub(num1: Int = 2, num2: Int = 1): Int {
    return num1 - num2
}

// 函数不返回有用的值，返回值类型为Unit
fun eat(food: String): Unit {
    println(food)
}

// 可变参数
fun eat(vararg params: String) {
    for (arg in params) {
        println(arg)
    }
}

fun main() {
    // 调用，形参可以省略
    val result = add(10, 20)
    println(result)

    println(sub())
    println(sub(10))
    println(sub(20, 10))

    eat("Apple")

    eat("Apple", "Banana", "Orange")
}