package theory.`2_ObjectsUsages`

/*

Более частый вариант АК - это тот, который реализовывает интерфейс или наследуется от другого класса.

В этом случае мы можем обращаться в переменным АК и вызывать его функции.

Часто используется в различных фреймворках, особенно с UI (Android, обработка событий и пр.)

 */

var carAnon = object: Car() {  // АК наследуется от класса

    override fun drive() {
        println("anonym car drive")
    }


    // АК может как и обычный класс - добавлять любые свои функции
    fun newDrive(){
        println("anonym car new drive")

    }

}

open class Car {
    open var name: String = "def car name"

    open fun drive(){
        println("car drive")
    }

    open fun stop(){
        println("car stop")

    }

}

interface IComp{

    fun on()
}


var compAnon = object: IComp {  // АК реализовывает интерфейс

    override fun on() {
        println("anonym comp on")
    }


}

// правой кнопкой -> Run
fun main() {

    carAnon.drive() // можно вызывать функцию, т.к. тип параменной anonym2 уже не Any, а Car

    compAnon.on()

}



