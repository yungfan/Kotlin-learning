// 简单类，主构造，没有类体
class Person(name: String, age: Int)

// 主构造器的参数可以在初始化代码段中使用，也可以在定义的属性初始化代码中使用
class Person2(name: String, age: Int) {
    // 属性要么一定要初始化（一开始就赋值或者init中）
    var name = name
    var age: Int

    init {
        this.age = age
    }
}

// 使用了var或val修饰符，相当于在类中声明了对应名称的属性
class Person3(var name: String, var age: Int) {
    override fun toString(): String {
        return "Person name is $name, age $age"
    }
}

// 次要构造函数，懒加载属性
class Student(name: String, age: Int) {
    var name: String
    var age: Int

    // val by lazy：懒加载属性，只适用于val
    val score by lazy {
        println("lazy")
        intArrayOf(1, 2, 3)
    }

    // var用lateinit，但不能赋初始值，也不能是基本类型
    lateinit var person: Person

    // 不带参数
    // 这里编写要在主构造函数中完成的业务
    init {
        println("init -- $name -- $age")
        this.name = name
        this.age = age
    }

    // 当一个类既有主构造函数又有次构造函数时，所有次构造函数都必须使用this关键字直接或间接的调用主构造函数
    // 直接调用主构造函数
    constructor(name: String, age: Int, sex: String) : this(name, age) {
        println("次构造函数1")
    }

    // 间接调用主构造函数
    constructor(name: String, age: Int, sex: String, phone: String) : this(name, age, phone) {
        println("次构造函数2")
    }

    override fun toString(): String {
        return "Student name is $name, age $age"
    }
}

// 类可以没有主构造函数只有次构造函数
class Student2 {
    val list = mutableListOf<String>()


    constructor(name: String) {
        list.add(name)
    }
}

// 默认不支持继承，open类才可以继承
open class Animal {
    // open属性与方法才可以重写
    open var name: String = ""
    open fun eat(food: String) {
        println("动物 $name 吃 $food")
    }
}

// 继承 :
// 注意Animal后面有个()
class Cat : Animal() {
    override var name: String
        get() = super.name
        set(value) {
            println("赋值$value")
        }

    override fun eat(food: String) {
        super.eat(food)
        println("猫 $name 吃 $food")
    }
}

// 抽象类
abstract class Polygon {
    abstract fun draw()
}

class Rectangle : Polygon() {
    override fun draw() {
        println("画一个矩形")
    }
}

// 数据类，一行代码创建一个包含getters、 setters、 equals()、hashCode()、toString()以及copy()的对象
data class User(val name: String, val age: Int)

// 无参构造函数：为主构造函数的每个参数提供默认值
class Teacher(val name: String = "", val type: String = "")

// 枚举类
enum class Method {
    Add, Sub, Mul, Div
}

enum class Color(val rgb: Int) {
    Red(0xFF0000),
    Green(0x00FF00),
    Blue(0x0000FF)
}

// 单例object
object Singleton {
    val name: String = "zhangsan"
    fun share() {

    }
}

// 伴生对象，位于 class 中的 object
// 可以利用伴生对象实现类的静态成员
class Car {
    companion object {
        var name = "car"
        fun drive() {
            println("car is running")
        }
    }
}

class Elephant {
    // get/set，get获取的时候有变化，set设置的时候有条件可以使用，否则不需要使用
    // 提供了Backing Fields(后端变量)机制，备用字段使用field关键字声明，field只能用于属性的访问器
    var weight: Double = 0.0
        get() = field + 0.1 // field为后端变量
        set(value) {
            field = if (value < 0)
                0.0
            else
                value
        }
}

// 密封类 sealed class，有特定数量子类的类
sealed class Result {
    class Success(val msg: String) : Result()
    class Failure(val error: Exception) : Result()

    fun say() {
        println("Hello sealed class")
    }
}

fun getResultMsg(result: Result) = when (result) {
    is Result.Success -> result.msg
    is Result.Failure -> result.error.message
}

// 基类Any
fun anyToOther(obj: Any) {
    // 如果类型检测正确，编译器会为你做自动类型转换
    if (obj is String)
        print(obj.uppercase())
}

fun main() {
    val p = Person("zhangsan", 20)
    println(p)

    val s = Student("lisi", 20)
    println(s)

    val s2 = Student("wangwu", 20, "man")
    println(s2.score)
    println(s2.score)
    println(s2.score)

    val cat = Cat()
    cat.name = "zhangsan"

    val user = User("zhangsan", 20)
    println(user.name)
    println(user.age)
    println(user)

    // 解构
    val (name, age) = user
    val (_, age2) = user
    println("$name, $age")

    // 无参构造函数
    var t = Teacher()

    // 拷贝
    val u = user.copy("lisi")
    println("${u.name}, ${u.age}")

    // 枚举类
    Method.Add
    Color.Red

    // 单例
    Singleton.name
    Singleton.share()

    // 伴生实现静态
    var car = Car()
    // 调用
    Car.name
    Car.drive()

    // get/set
    val elephant = Elephant()
    elephant.weight = 10.3
    println(elephant.weight)

    // 密封类
    val suc = Result.Success("Success")
    println(getResultMsg(suc))
    val fail = Result.Success("Failure")
    println(getResultMsg(fail))

    // Any
    anyToOther("zhangsan")
}