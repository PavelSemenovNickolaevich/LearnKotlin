package obj


// пример объекта
data class Human(val name: String, val number: Int): Comparable<Human> {
    override fun toString(): String {
        return name
    }

    override fun compareTo(other: Human): Int {
        return this.name.compareTo(other.name) // сортировка объектов по имени по алфавиту
    }
}

fun main() {

    val human1 = Human("Nick", 234234)
    val human2 = Human("John", 123123)
    val human3 = Human("Abba", 6765)


    // пример для List
    val humanList = ArrayList<Human>();
    humanList.add(human1)
    humanList.add(human2)
    humanList.add(human3)

//    humanList.sort() // изначальная коллекция изменяется

    val sortedList = humanList.sorted() // изначальная коллекция не изменяется

    println("humanList = $humanList")
    println("soredList = $sortedList")


}
