package obj


fun main() {

    // для системных типов
    val listNumbers = mutableListOf(121, 23423) // mutable
    println("listNumbers.min() = ${listNumbers.minOrNull()}")
    println("listNumbers.max() = ${listNumbers.maxOrNull()}")
    println("listNumbers.max() = ${listNumbers.average()}")
    println("listNumbers.max() = ${listNumbers.count()}")


    // для своих типов

    val person1 = Person("Nick", 1)
    val person2 = Person("John", 2)
    val person3 = Person("Mike", 3)

    val personSet = LinkedHashSet<Person>();
    personSet.add(person1)
    personSet.add(person2)
    personSet.add(person3)

    personSet.maxByOrNull { it.number }
    personSet.sumBy { it.number }

    println() // найти среди всех объектов в коллекции объект, у которого максимальный number
    println() // найти сумму среди всех объектов по полю number

}
