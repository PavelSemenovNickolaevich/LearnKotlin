package theory.`2_ObjectsUsages`

/*

АК может передаваться как параметр в функцию (конструктор)

 */


interface IHuman {
    fun go()
    fun stop()
}

open class Human(var name: String) : IHuman {

    override fun go() {
        println("$name go")
    }

    override fun stop() {
        println("$name stop")

    }

}


var humanMike = object : Human("Mike22") {}   // передаем в АК значение для параметра конструктора


/* может принимать:
- экземпляры анонимных классов, которые реализовывают интерфейс IHuman
- экземпляры обычных классов, которые реализовывают интерфейс IHuman
 */
fun testHuman(human: IHuman) {
    human.go() // элемент полиморфизма
}


// правой кнопкой -> Run
fun main() {

    testHuman(humanMike)

    testHuman(object: IHuman{ // сразу передаем экземпляр АК
        override fun go() {
            println("AK go")
        }

        override fun stop() {
            println("AK stop")
        }
    })

}





