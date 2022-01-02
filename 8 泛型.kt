// 类
class Box<T>(t: T) {
    var value = t
}

// 函数
fun <T> say(param: T) {
    println(param)
}

fun main() {
    val stringBox = Box<String>("A")
    println(stringBox.value)

    val intBox = Box<Int>(1)
    println(intBox.value)

    say("Hello")
    say(1)
    say(true)
}