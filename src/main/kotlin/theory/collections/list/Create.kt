package list

fun main() {


    val list1 = listOf(1, 2) // read-only

    val list2 = mutableListOf(3, 5, 2, null) // mutable

    val list3 = arrayListOf(1, 2, 3) // mutable

    val list4 = ArrayList<Int>() // mutable

    val list5 = (0..100).toMutableList() // mutable


    print(list5)

}
