package practice.objects

import java.util.*

class Dog(val name: String, weight_param: Int, breed_param: String) {
    init {
        println("Dog $name has been created")
    }

    var activities = arrayOf("Walks")
    val breed = breed_param.uppercase(Locale.getDefault());

    init {
        println("Thee breed is $breed")
    }

    var weight = weight_param
    set(value) {
        if(value > 0) field = value
    }

    val weightInKgs: Double
    get() = weight /  2.2

    fun bark() {
        println(if(weight < 20) "Yip!" else "Woof!")
    }
}

fun main(args: Array<String>) {
    val myDog = Dog("Fido", 70 , "Mixed")
    myDog.bark()
    myDog.weight = 75
    println("Weight in Kgs is ${myDog.weightInKgs}")
    myDog.weight = -2
    println("Weight in Kgs is ${myDog.weight}")
    myDog.activities = arrayOf("Walks", "Balls", "Frisbee")
    for (item in myDog.activities) {
        println("My dog enjoy ${item}")
    }

    val dogs = arrayOf(Dog("Kelpie", 20 , "Westie"), Dog("Tuzikm", 34, "Test"))
    dogs[1].bark()
    dogs[1].weight = 15
    println("weight for ${dogs[1].name} is ${dogs[1].weight}")


}