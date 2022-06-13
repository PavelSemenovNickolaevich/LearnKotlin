package map

import java.util.LinkedHashMap

fun main() {

    // key-value
    val map1 = mapOf(
        "name" to "Nick", 
        "address" to "Example street",
        "number" to 100, 
        "phone" to 5234234) // read-only


    val map2 = mutableMapOf<Int, Int>( 1 to 100, 2 to 200) // mutable

    val map3 = linkedMapOf<String, String>("a" to "b", "c" to "d")

    val map4 = LinkedHashMap<Int, Int>()



    println(map3)

    


}
