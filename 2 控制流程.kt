fun main() {
    // if
    val a = 10
    // if后面要加括号
    if (a == 10) {
        println("a = 10")
    }

    val b = 20
    // if else
    if (b == 10) {
        println("b = 10")
    } else {
        println("b != 10")
    }

    // when
    val x = 20
    when (x) {
        10 -> println("x = 10")
        20, 30 -> println("x = 20或者30")
        else -> {
            print("x既不等于10也不等于20、30")
        }
    }
    when (x) {
        in 0..10 -> println("x在0～10之间")
        in 11..20 -> println("x在11～20之间")
        else -> {
            print("x既不等于10也不等于20")
        }
    }

    // for
    for (i in 1..10) {
        println(i)
    }
    for (i in 1..10 step 2) {
        println(i)
    }

    val str = "Hello World"
    for (s in str) {
        println(s)
    }
    var array = arrayOf("zhangsan", "lisi", "wangwu", "zhaoliu")
    // 直接遍历
    for (item in array) {
        println(item)
    }
    // 索引取值
    for (i in array.indices) {
        println(array[i])
    }
    // 同时获取索引和值
    for ((index, value) in array.withIndex()) {
        println("$index -- $value")
    }

    // while
    var c = 10
    while (c >= 10) {
        println(c)
        c -= 1
    }
    do {
        println(c)
        c -= 1
    } while (c >= 10)
}