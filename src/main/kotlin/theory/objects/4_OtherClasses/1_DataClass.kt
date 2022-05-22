package theory.`4_OtherClasses`


/*

Специальный класс-контейнер для хранения данных (аналог POJO - "Plain Old Java Object", основное предназначение - хранить свойства объекта - у него нет методов, функций)

Не выполняет никакой функционал, а служит только контейнером!

Создает автоматически все служебные методы (toString, equals, hashCode, copy) на основе переменных ПК

toString - текстовое представление объекта
equals - сравнение объекта с другим (имеет такие же свойства или нет)
copy - клонирование объекта со всеми полями
hashCode - хеш значение объекта - числовое представление (используется при добавлении коллекцию на основе hash, при сравнении объектов и пр.)


Data class:
- не может быть abstract, open, sealed, inner
- может наследоваться от другого обычного (не data) класса
- может реализовывать интерфейс
- не может наследоваться от другого data класса (поэтому нельзя добавлять слово open при создании data class)
- нельзя создавать пустой data class - должен быть хотя бы 1 параметр в ПК (компилятор будет ругаться)


https://kotlinlang.org/docs/data-classes.html

 */



// правой кнопкой -> Run
// можете комментировать определенные строки функции и заново запускать проект, чтобы не запутаться при выводе результатов
fun main() {

    var iphone = Phone("iphone")
    iphone.name = "iphone 5s" // изменили имя
    println(iphone.name) //

    var samsung = iphone.copy() //готовый метод copy (автоматически создается в data классе) для клонирования объекта - все поля из ПК копируются
    samsung.name = "samsung" // изменили имя
    println(samsung.name) // скопированное имя


    var c1 = Company("c1", "a1")
    c1.year = 100
    println(c1)

    var c2 = c1.copy()
    println(c2.year)

    c2.test()

}


// в data классе все переменные/константы из ПК автоматически будут использовать для методов toString, equals, hashCode, copy
data class Company(val name: String, val address: String) {

    var year: Int = 0 // можно также добавлять другие доп. свойства объекта (они уже не будут участвовать в toString, equals, hashCode, copy)

    constructor(name: String, address: String, year: Int) : this(name, address) {
        this.year = year
    }

    // методы можно переопределять вручную
    override fun toString(): String {
        return name;
    }

    fun test(){
        println("test func")
    }
}


data class Phone(var name: String) // если в классе больше нет другого кода - фигурные скобки можно не добавлять - еще больше сокращается код


//data class HTC(var str: String) : Phone("HTC") // раскоментируйте, чтобы увидеть ошибку (нельзя наследоваться от другого data класса, но можно от обычного класса или реализовывать интерфейс)

