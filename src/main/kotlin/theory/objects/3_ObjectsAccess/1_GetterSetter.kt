package theory.`3_ObjectsAccess`


/*

Документация:
https://kotlinlang.org/docs/reference/properties.html


В отличие от Java - в Kotlin get/set чаще всего используется в качестве дополнения к переменным.
Если в Java get/set чаще всего нужны для получения значения соответствующей переменной, то в Kotlin (и других современных языках) доступ к переменной осуществляется напрямую.
Поэтому get/set в основном используются для доп. вычислений (в других языках часто называют calculated, computed values)

Например, с помощью set можно выполнить предварительную проверку перед записью значения.
С помощью get можно вычислить какое-либо значение на основе переменных класса.

В других языках get/set часто называют "computed property" - вычисляемое свойство - возвращает какое-либо вычисленное значение на основе других переменных.

Можно применять get/set по отдельности или вместе, в зависимости от задачи.

get вызывается каждый раз при обращении к переменной
set вызывается каждый раз при записи нового значения в переменную

 */



// правой кнопкой -> Run
// можете комментировать определенные строки функции и заново запускать проект, чтобы не запутаться при выводе результатов
fun main() {

    var music = Music()
    println(music.genre)


    var human = Human(25, "Mister")
    println(human.humanTotalInfo)
    println(human.checkedAge)
    human.checkedAge = -10

    var temp = Temperature(40)
    println(temp.farengate)

    var disc = Disc()
//    disc.name = "new name" // раскоментируйте строку, чтобы увидеть ошибку (установить значение не позволяет модификатор доступа private)



}

class Music {

    // компилятор предупреждает, что мы создали лишний ненужный код get/set (redundant, не имеет смысла), без которого можно обойтись
    var genre: String = "no genre"
        get() = field                     // возвращает значение переменной (поля)
        set(value) {
            field = value
        }      // setter

////     аналогичная укороченная запись. По-умолчанию для всех переменных/констант компилятор создает get/set со стандартным поведением (просто возвращают и записывают значения)
//    var genre: String = "no genre"


}

class Disc {

    var name: String = "no genre"
        private set // значение в переменную можно будет установить только изнутри класса Disc, т.к. private (из другого класса не получится изменить значение, т.к. не будет доступа)


    val year: String = ""
//        set(value) {field = value + "г. "} // // раскоментируйте строку, чтобы увидеть ошибку - нельзя использовать set, т.к. val (константа)

}


class Human(var age: Int, var name: String) {

    // присутствует только get (set можно не использовать, т.к. не требуется по смыслу)
    var humanTotalInfo: String = ""
        get() {
            return "$name $age"
        }
    // нет сета, т.к. значение вычисляется

    // присутствует только set, которое проверяет значение перед записью в переменную
    var checkedAge: Int = age
        set(value) {
            field =
                    if (value > 0) value
                    else throw IllegalArgumentException("age can not be < 0") // если значение больше 0, то присвоить его, иначе выкинуть исключение (ошибку)
        }

}


class Temperature(var celsius: Int) {

    // вычисляет значение градусов по фаренгейту
    var farengate: Int = 0
        get() {
            return celsius + 32
        } // примерно
        set(value) {
            if (value >= 0) field = value
        } // value - переданное значение, field - текущая переменная farengate

}
