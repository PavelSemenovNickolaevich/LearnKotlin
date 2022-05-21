package theory.`2_Inheritance`

/*

override - переопределение родительских функций (методов), переменных (констант)


*/



// правой кнопкой -> Run
// можете комментировать определенные строки функции и заново запускать проект, чтобы не запутаться при выводе результатов
fun main() {


    var human = Human()
    human.walk()


    var mike = Mike(50)
    mike.walk()


}


// родительский класс "фигура" (без собственных конструкторов)
open class Human(open var height: Int = 10) { // open - чтобы можно было наследоваться от класса (тут создан компилятором автоматически ПК без параметров)

    open fun walk() { // чтобы в доч. классах можно было использовать override
        println(this.height)
        println("walk")
    }

}


open class Mike(override var height: Int) : Human(height) {

    override fun walk() { // override - это ключевое слово, а не аннотация как в Java

        super.walk();

        println(super.height) // значение из родит. объекта
        println(this.height) // значение из текущего объекта

        println("new walk")

    }

}
