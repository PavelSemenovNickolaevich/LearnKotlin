package theory.`1_Interfaces`


/*

Абстрактный класс:
- может содержать как абстракцию (абстрактные функции), так и реализацию (обычные функции)
- нечто среднее между интерфейсом и обычным классом
- нельзя создавать экземпляр абстрактного класса
- может наследоваться от других классов (обычных и абстрактных)
- может реализовывать любое количество интерфейсов
- может содержать конструкторы и блоки init

Используется как промежуточное звено между обычным классом и интерфейсом (если это необходимо)

Может содержать какую-то общую реализацию для всех классов-наследников.

Также может добавлять свои уровни абстракции (абстрактные функции, которые также наследники обязаны будут реализовать)

 */




// правой кнопкой -> Run
// можете комментировать определенные строки функции и заново запускать проект, чтобы не запутаться при выводе результатов
fun main(){
    var room1 = Room1("good house")
    room1.build() // вызывается переопределенный метод


    var room2 = Room2("good house")
    room2.build() // вызывается метод из абстрактного класса


}



interface Building {

    var name: String // название (обязываем все классы-реализации иметь это свойство)

    fun build() // строить
}


// абстрактный класс всегда open (можно наследоваться от него), поэтому не нужно дописывать
// реализует интерфейс
abstract class House(override var name: String) : Building { // здесь объявляется переменная name

    // абстрактный класс НЕ обязан реализовывать все абстрактные методы интерфейса (в отличие от обычного класса)

    override fun build() { // реализация по-умолчанию, которая будет доступна всем дочерним классам
        println("house building")
    }

}


// наследник абстрактного класса
class Room1(name: String) : House(name) { // передаем значение name выше в абстрактный класс (т.к. именно там объявлена переменная)

    override fun build() { // своя реализация метода build
        println("room1 building")
    }

}

// наследник абстрактного класса
class Room2(name: String) : House(name) { // передаем значение name выше в абстрактный класс (т.к. именно там объявлена переменная)

//    не переопределяет метод build

}

