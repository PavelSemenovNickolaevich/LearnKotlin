package practice.oop.extends

open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    open val hunger = ""

    open fun makeNoise() {
        println("The Animal is making a noise")
    }

    open fun eat() {
        println("The Animal is eating")
    }

    open fun roam() {
        println("The Animal is roaming")
    }

    open fun sleep() {
        println("The animal is sleeping")
    }
}

class Hippo : Animal() {
    override val image = "hippo.jmg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
       println("Grunt!Grunt!")
    }

    override fun eat() {
        println("The Hippo is eating $food")
    }
}

open class Canine: Animal() {
    override fun roam() {
        println("The Canine is roaming")
    }
}

class Wolf: Canine() {
    override val image = "wolf.jmg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hoooooowl!")
    }

    override fun eat() {
        println("The Wolf is eating $food")
    }
}