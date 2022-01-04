import kotlinx.coroutines.*

// 基本语法
fun test1() = runBlocking {
    launch {
        // 耗时操作
    }

    println("Hello")
}

// launch
fun test2() = runBlocking {
    launch {
        // 耗时操作
        World()
    }
    println("Hello")
}

suspend fun World() {
    delay(1000)
    println("World")
}

// async/await
fun test3() = runBlocking {
    val world = async { // 创建带返回值的协程
        World()
    }
    println(world.await())
    println("Hello")
}

// withContext: 阻塞上下文线程，必须在协程或者suspend函数中调用，通过Dispatchers来指定代码块所运行的线程
fun test4() = runBlocking {
    withContext(Dispatchers.Default) {
        delay(1000)
        println("Default")
    }
    withContext(Dispatchers.IO) {
        println("IO")
    }
    withContext(Dispatchers.Unconfined) {
        println("IO")
    }
}

// cancel
fun test5() {
    val job = GlobalScope.launch {
        println("执行耗时操作")
    }
    // 取消
    job.cancel()
}

fun main() {
    test1()
    test2()
    test3()
    test4()
    test5()
}
