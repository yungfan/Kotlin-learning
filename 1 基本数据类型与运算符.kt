fun main() {
    // 整型
    var a: Byte = 10
    val b: Short = 10
    var c: Int = 10
    val d: Long = 10
    val cc = 10

    // 浮点
    val e: Float = 3.14f // 需要带f
    var f: Double = 3.14

    // 布尔
    var g: Boolean = true
    val h: Boolean = false

    // 类型转换方法
    a.toDouble()

    // 运算符
    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)
    println(a % b)

    // 不同类型可以运算
    println(a % f)

    // ++、--
    print(a++)
    print(++a)
    println(a--)
    print(--a)

    // 比较运算
    println(a > f)
    println(a >= f)
    println(a < f)
    println(a <= f)
    println(c == cc)
    println(c != cc)
    // 闭区间
    println(a in 1..10)
    println(a !in 1..10)

    // 字符
    var s: Char = 'a' // 单引号单字母

    // 字符串
    var str: String = "Hello"
    println(str + 1)
    println(str + "1")
    // 长字符串
    val poem = """
       静夜思
       唐•李白
       床前明月光，疑是地上霜。
       举头望明月，低头思故乡。 
    """.trimIndent()
    println(poem)
    // 插值
    println("$str World")

    // 可选，才可以赋值null
    var str2: String? = "Optional"
    str2 = null
    // ?:取非空值
    val s1 = "this is a String"
    val s2: String? = null
    val ret1 = s1
    val ret2 = s2 ?: "default value"

    // 数组
    val array1 = intArrayOf(1, 2, 3, 4, 5)
    val array2 = arrayOf("1", "2", "3", "4")

    // 类型判断
    println(str is String)
    println(str !is String)

    // 类型转换
    val res = str as Int // 运行时报错
    val res2 = str as? Int
}