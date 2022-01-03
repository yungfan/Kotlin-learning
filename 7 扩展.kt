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
    println("自行车型号是$type")
}

fun main() {
    // 调用
    // 方式一
    val list = mutableListOf(1, 2, 3)
    list.swap(0, 2)
    println(list)
    // 方式二
    (MutableList<Int>::swap)(list, 0, 2)
    println(list)
    // 方式三
    MutableList<Int>::swap.invoke(list, 2, 1)
    println(list)

    println(list.lastIndex)
    println((MutableList<Int>::lastIndex)(list))
    println(MutableList<Int>::lastIndex.invoke(list))

    var bike = Bike("永久")
    bike.printType()
    (Bike::printType)(Bike("杂牌"))
    Bike::printType.invoke(Bike("凤凰"))
    // 传递
    val method: (Bike) -> Unit = Bike::printType
    method(Bike("加中"))
}
