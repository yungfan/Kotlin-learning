// 创建接口
interface Boss {
    fun buyTicket()
}

// 实现接口
class Assist : Boss {
    override fun buyTicket() {
        println("帮忙买票")
    }
}

// by建立委托,表示将boss保存在Derived的对象实例内部，而且编译器将会生成继承自Boss接口的所有方法, 并将调用转发给boss。
class Derived(boss: Boss) : Boss by boss

fun main() {
    val b = Assist()
    Derived(b).buyTicket()
}