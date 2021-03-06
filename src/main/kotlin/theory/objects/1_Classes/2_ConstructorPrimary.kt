package theory.`1_Classes`

/*

"Создание объектов с помощью конструкторов"


Основные отличия конструкторов Kotlin от Java-подобных языков:
- требуется меньше кода
- более строгий подход - все обязательные переменные должны иметь значения


в Kotlin различают:

1) primary constructor - один - (первичный конструктор) - ПК (сокращение для удобства)
    - указывается сразу при описании класса только 1 раз
    - в нем обычно перечислены те переменные, которые обязательно должны быть заполнены (по логике работы объекта)

2) secondary constructors - может быть несколько (вторичные конструкторы) - ВК (сокращение для удобства)
    - указываются внутри класса в любом количестве
    - часто это необязательные, доп. переменные (в дополнение к основным), без которых объект может корректно работать



Важно! Любой ВК должен вызывать ПК либо напрямую, либо через другой ВК (чтобы цепочка вызовов привела в ПК) - иначе при запуске приложения выйдет ошибка "Primary constructor call expected"

Если явно не создавать ПК, тогда автоматически создается пустой

Переменная внутри класса - это свойство (или характеристика) класса (объект)

Нельзя оставлять переменные (свойства) пустыми (компилятор будет подсказывать, что нужна инициализация)


Ключевое слово "this" (как и в Java) - ссылка на конкретный (текущий или любой внешний) объект, к которому хотим обратиться


Часто те переменные, которые указаны в ПК - называют параметры класса

Для доступа к свойствам объекта - мы просто к ним обращаемся (не обязательно исп. get/set)


 */




class EmptyPerson  { }// автоматически создается ПК без параметров



// если перед именем указан var (переменная) или val (константа), то автоматически в классе создается переменная/константа name, которая доступна в любом месте класса
class John constructor(
    var age: Int, // возраст
    var name: String,
    val address: String
) { // ПК (val - будет иметь только 1 значение, нельзя присвоить новое)


}


// слово "constructor" можно опустить, если перед ним нет аннотаций, модификаторов
class JohnAnalog (var name: String) {
}

// параметры конструктора могут иметь значения по-умолчанию, которые можно переопределить при создании объекта
class Jack(var name: String = "default jack name") {

}

class  Test1 (var one: String) {

}


fun main() {

    var john1 = John(12, "John", "1 street") // порядок следования значений должен быть таким же, как и в конструкторе (если не исп-ся именованные параметры)
    var john2 = John(name = "John", age = 12, address = "1 street")
    var test  = Test1(one = "Test")// если используете именованные параметры (явно указываете), то порядок неважен (аналогично как в функциях)


    var jack1 = Jack()
    var jack2 = Jack("new Jack")


    // Для доступа к свойствам объекта - мы просто к ним обращаемся (не обязательно исп. get/set)
    println(john1.name)
    println(john2.name)
    println(jack1.name)
    println(jack2.name)
    println(test.one)


}
