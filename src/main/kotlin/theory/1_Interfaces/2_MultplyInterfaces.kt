


// простой интерфейс для любой техники
interface ITechnic{

    fun open() // открыть

    fun close() // закрыть
}


// интерфейс и все его функции, переменные, константы - всегда open
interface ICar { // нажимайте слева возле номера строки, где зеленый кружок и стрелка вниз (в IDEA) - чтобы увидеть все классы-реализации интерфейса

    var name: String // переменная - нельзя задавать значение, т.к. это интерфейс (абстракция)

    fun drive() // ехать

}

// интерфейс и все его функции, переменные, константы - всегда open
interface IElectro { // нажимайте слева возле номера строки, где зеленый кружок и стрелка вниз (в IDEA) - чтобы увидеть все классы-реализации интерфейса

    fun charge() // зарядка

}


open class Toyota(override var name: String) : ICar, ITechnic { // интерфейсы можно перечислять через запятую

    // override нужен для того, чтобы указать, что мы реализовываем метод из интерфейса (иначе компилятор будет ругаться, что не все реализовали)
    override fun open() {
        println("$name open")
    }

    override fun close() { // нажимайте слева возле номера строки, где зеленый кружок и стрелка вверх (в IDEA) - чтобы увидеть все классы-реализации интерфейса
        println("$name close")
    }

    override fun drive() {
        println("$name drive")
    }
}


class Tesla(name: String): Toyota(name), IElectro{ // наследуется от класса Toyota и реализовывает интерфейс IElectro
    override fun charge() {
        println("$name charging")
    }

    override fun drive() {
        super.drive()
        println("$name +driving")
    }

}

fun main() {

    var tesla = Tesla("tesla")

    tesla.charge()

    tesla.drive()


}

