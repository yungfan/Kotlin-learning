// with: 第一个参数可以是一个任意类型的对象，第二个参数是一个Lambda表达式。with函数会在Lambda表达式中提供第一个参数对象的上下文，并使用Lambda表达式中的最后一行代码作为返回值返回
val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
val result = with(StringBuilder()) {
    append("Eat\n")
    for (fruit in list) {
        append(fruit).append("\n")
    }
    append("fruits")
    toString()
}

// run: run函数是不能直接调用的，一定要调用某个对象的run函数才行
val result2 = StringBuilder().run {
    append("Eat\n")
    for (fruit in list) {
        append(fruit).append("\n")
    }
    append("fruits")
    toString()
}

// apply: 无法指定返回值，只能自动返回调用对象本身
val result3 = StringBuilder().apply {
    append("Eat\n")
    for (fruit in list) {
        append(fruit).append("\n")
    }
    append("fruits")
}


fun main() {
    println(result)
    println(result2)
    println(result3)
}