package practice.taskCar


//Первичный конструктор
//class Car(var name: String) {
//
//    fun drive() {
//        println("$name rides")
//    }
//
//    fun stop() {
//        println("$name was stopped")
//    }
//}

//Вторичный конструктор
class Car() {

    var name: String = ""
    constructor(name: String): this() {
        this.name = name
    }

    fun drive() {
        println("$name rides")
    }

    fun stop() {
        println("$name was stopped")
    }
}