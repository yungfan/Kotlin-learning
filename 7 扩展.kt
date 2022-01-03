// 扩展方法
fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

// 扩展属性
val MutableList<Int>.lastIndex: Int
    get() = size - 1


class Bike(var type: String)

fun Bike.printType() {
    print("自行车型号 $type")
}


fun main() {
    val list = mutableListOf(1, 2, 3)
    println(list)
    list.swap(0, 2)
    println(list)

    println(list.lastIndex)

    var bike = Bike("永久")
    bike.printType()
}

