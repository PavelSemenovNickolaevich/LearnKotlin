package obj

fun main() {


//    val set1 = setOf(1, 2, 3, 4) // read-only
//    val iter = set1.iterator()
//    while (iter.hasNext()){
//        println(iter.next())
//    }


    val list = mutableListOf(3, 5, 2, null) // mutable

    val iterList = list.listIterator()

    while (iterList.hasNext()){
        val tmp = iterList.next()
        println(tmp)
//        iterList.remove()
    }

    while (iterList.hasPrevious()){
        val tmp = iterList.previous()
        println(tmp)
//        iterList.remove()
    }

//    println(list)

}
