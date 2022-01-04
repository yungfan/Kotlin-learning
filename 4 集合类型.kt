fun main() {
    // List
    var namesList = listOf<String>("zhangsan", "lisi", "wangwu", "lisi", "wangwu")
    println(namesList.size)
    println(namesList.first())
    println(namesList.last())
    println(namesList.get(2))
    println(namesList.contains("zhangsan"))
    println(namesList.indexOf("lisi"))
    // 遍历方式一
    for (name in namesList) {
        println(name)
    }

    // MutableList
    var namesList2 = mutableListOf<String>("zhangsan", "lisi", "wangwu", "lisi", "wangwu")
    // 末尾增加
    namesList2.add("zhaoliu")
    // 索引删除
    namesList2.removeAt(2)
    println("namesList2 $namesList2")
    // 从前往后删除n个元素并返回新List
    val newList = namesList2.drop(2)
    println("newList $newList")
    // 遍历方式二
    val listIterator = namesList2.iterator()
    while (listIterator.hasNext()) {
        println(listIterator.next())
    }

    // Set
    // 定义可以重复，就自动过滤
    var namesSet = setOf<String>("zhangsan", "lisi", "wangwu", "lisi", "wangwu")
    println(namesSet.size)
    println(namesSet.first())
    println(namesSet.last())
    println(namesSet.contains("zhaoliu"))
    // 遍历方式一
    for (name in namesSet) {
        println(name)
    }

    // MutableSet
    var namesSet2 = mutableSetOf<String>("zhangsan", "lisi", "wangwu", "lisi", "wangwu")
    // 末尾增加
    namesSet2.add("zhaoliu")
    println("namesSet2 $namesSet2")
    // 从前往后删除n个元素并返回新List
    val newSet = namesSet2.drop(2)
    println("newSet $newSet")
    // 遍历方式二
    val setIterator = namesSet2.iterator()
    while (setIterator.hasNext()) {
        println(setIterator.next())
    }


    // Map
    var map1 = mapOf<String, String>("key1" to "1", "key2" to "2", "key3" to "3")
    println(map1.keys)
    println(map1.values)
    println(map1.size)
    println(map1.get("key2"))
    println(map1.containsKey("key2"))
    println(map1.containsValue("2"))
    // 遍历方式一
    for ((key, value) in map1) {
        println("$key -- $value")
    }

    // MutableMap
    var map2 = mutableMapOf<String, String>("key1" to "1", "key2" to "2", "key3" to "3")
    map2.put("key4", "4")
    map2["key5"] = "5"
    // 修改
    map2.put("key3", "three")
    map2["key1"] = "one"
    // 遍历方式二
    val mapIterator = map2.iterator()
    while (mapIterator.hasNext()) {
        val next = mapIterator.next()
        println("key:${next.key}, value:${next.value}")
    }
}