fun java(source: List<Int>) {
    val list = ArrayList<Int>() // Java
    for (item in source) {
        list.add(item)
    }

    for (i in 0..list.size - 1) {
        println(list[i])
    }
}


fun main() {
    val list = listOf(1, 2, 3)
    java(list)
}
