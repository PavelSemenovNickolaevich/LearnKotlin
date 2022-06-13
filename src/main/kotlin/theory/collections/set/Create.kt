package set


fun main() {

    val set1 = setOf(1, 2, 3, 4) // read-only

    val castedList1 = set1 as LinkedHashSet<Int>
    castedList1.add(123)

    val castedList2 = LinkedHashSet<Int>(set1)
    castedList2.add(100)

    val set2 = mutableSetOf(3, 5, 2, null) // mutable

    val set3 = linkedSetOf(1, 2, 3) // mutable

    val set4 = LinkedHashSet<Int>() // mutable

    val set5 = (0..10).toMutableSet() // mutable

    print(castedList2)


}
