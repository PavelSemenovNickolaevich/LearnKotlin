package obj

// пример объекта
data class Person(val name: String, val number: Int){
    override fun toString(): String {
        return name
    }
}


fun main() {

    val person1 = Person("Nick", 234234)
    val person2 = Person("John", 123123)
    val person3 = Person("Mike", 6765)


    // пример для Set
    val personSet = LinkedHashSet<Person>();
    personSet.add(person1)
    personSet.add(person2)
    personSet.add(person3)


    // пример для List
    val personList = ArrayList<Person>();
    personList.add(person1)
    personList.add(person2)
    personList.add(person3)



    // пример для Map
    val personMap = LinkedHashMap<Int, Person>();
    personMap[1] = person1
    personMap[2] = person2
    personMap[3] = person3



}
