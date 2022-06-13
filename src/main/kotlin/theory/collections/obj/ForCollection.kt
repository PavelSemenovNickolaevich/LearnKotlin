package obj

fun main() {

    val list = mutableListOf(3, 5, 2, null) // mutable

    for (obj in list) {
//        println(obj)
        // list.remove(obj) // во время прохода по циклу - нельзя удалять значения
    }

    val list2 = listOf<Person>(Person("asdasd", 1))

    list2.forEach { println(it) }

}
