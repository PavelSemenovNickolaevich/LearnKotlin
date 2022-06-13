package map

fun main() {

    // key-value
    val map1 = linkedMapOf(
        "name" to "Nick",
        "address" to "Example street") // mutable

    // put
    map1["car"] = "Toyota" // добавление пары (Entry) в конец коллекции

    // delete
//    map1.remove("name") // удаление по ключу
//    map1.remove("name", "asdasdas") // удаление по связке ключ-значение


    // update
    map1["car"] = "BWM"

    // get
    println(map1["car"])


    println("map = $map1")
}
