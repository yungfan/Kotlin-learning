fun main() {
    // list
    var namesList = listOf<String>("zhangsan", "lisi", "wangwu", "lisi", "wangwu")
    println(namesList.size)
    println(namesList.first())
    println(namesList.last())
    println(namesList.get(2))
    println(namesList.contains("zhangsan"))
    println(namesList.indexOf("lisi"))

    var namesList2 = mutableListOf<String>("zhangsan", "lisi", "wangwu", "lisi", "wangwu")
    // 末尾增加
    namesList2.add("zhaoliu")
    // 索引删除
    namesList2.removeAt(2)
    println(namesList2)
    // 删除并返回新list
    val newList = namesList2.drop(2)
    println(newList)
    // 遍历
    for (name in namesList2) {
        println(name)
    }
    val listIterator = namesList.iterator()
    while (listIterator.hasNext()) {
        println(listIterator.next())
    }

    // set
    // 定义可以重复，就自动过滤
    var namesSet = setOf<String>("zhangsan", "lisi", "wangwu", "lisi", "wangwu")
    println(namesSet.size)
    println(namesSet.first())
    println(namesSet.last())
    println(namesSet.contains("zhaoliu"))

    var namesSet2 = mutableSetOf<String>("zhangsan", "lisi", "wangwu", "lisi", "wangwu")
    // 末尾增加
    namesSet2.add("zhaoliu")
    println(namesList2)
    // 删除并返回新list
    val newList2 = namesList2.drop(2)
    println(newList2)
    // 遍历
    for (name in namesSet2) {
        println(name)
    }
    val setIterator = namesSet.iterator()
    while (setIterator.hasNext()) {
        println(setIterator.next())
    }


    // map
    var map1 = mapOf<String, String>("key1" to "1", "key2" to "2", "key3" to "3")
    println(map1.keys)
    println(map1.values)
    println(map1.size)
    println(map1.get("key2"))
    println(map1.containsKey("key2"))
    println(map1.containsValue("2"))

    for ((key, value) in map1) {
        println("$key -- $value")
    }

    var map2 = mutableMapOf<String, String>("key1" to "1", "key2" to "2", "key3" to "3")
    map2.put("key4", "4")
    map2["key5"] = "5"
    // 修改
    map2["key1"] = "one"
    println(map2)
}