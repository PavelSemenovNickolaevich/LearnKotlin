package practice.taskCar

fun main() {

    var car = Car("BMW")

    println("Car = ${car.name}")
    car.drive()
    car.stop()
}