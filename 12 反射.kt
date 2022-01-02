class Worker {
    val type: String = "teacher"

    init {
    }

    fun work(type: String) {
        println("$type is working")
    }
}

fun main() {
    // Kotlin反射::
    val c = Worker::class
    println(c.qualifiedName)
    println(c.simpleName)
    println(c.constructors)

    // 转Java反射
    val cls = Class.forName("Worker")
    // 公开构造函数
    println(cls.constructors.first())
    println(cls.declaredConstructors.first())
    // 公开方法
    println(cls.methods.first().parameters.first().name)
    println(cls.declaredMethods.first())
    // 公开属性
    println(cls.fields.count())
    println(cls.declaredFields.first().name)
    // 实例化
    val worker = cls.newInstance()
}


