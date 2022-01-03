// 接口
interface MyInterface {
    var prop: Int

    fun eat()
    fun say() {
        print("可以有方法体")
    }
}

class MyClass : MyInterface {
    override var prop: Int
        get() = 100
        set(value) {
            println("赋值$value")
        }

    override fun eat() {
        println("吃饭")
    }

    override fun say() {
        println("覆盖默认的方法体")
    }
}

class MyClass2 : MyInterface {
    override var prop: Int
        get() = 100
        set(value) {
            println("赋值$value")
        }

    override fun eat() {
        println("吃饭")
    }
}

fun main() {
    val my = MyClass()
    my.say()

    val my2 = MyClass2()
    my2.say()
}