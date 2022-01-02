//@Target:定义注解能够应用于哪些目标对象 （CLASS,FUNCTION,PROPERTY...）
//@Rentention:注解的保留期(SOURCE,BINARY,RUNTIME)
//@Repeatable:标记的注解可以多次应用于相同的声明或类型
//@MustBeDocumented:修饰的注解奖被文档工具提取到Api文档中


@Target(AnnotationTarget.CLASS, AnnotationTarget.PROPERTY, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class APIDoc(val value: String)

@APIDoc("修饰类")
class API {
    @APIDoc("修饰属性")
    var success: String = ""

    @APIDoc("修饰方法")
    fun test() {
    }
}