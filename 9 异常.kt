fun cal() {
    // 抛出异常
    throw  Exception("there is an exception")
}

fun main() {
    // try catch finally处理异常
    try {
        cal()
    } catch (e: Exception) {
        println(e.localizedMessage)
    } finally {
        println("finally")
    }
}