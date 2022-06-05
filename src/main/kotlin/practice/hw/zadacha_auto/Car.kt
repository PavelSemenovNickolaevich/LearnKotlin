package practice.hw.zadacha_auto

class Car(override var name: String) : ICar {

    override fun drive() {
        println("$name drive")
    }

    override fun stop() {
        println("$name stop")
    }
}