package theory.`2_Inheritance`


/*

"Наследование"


Для расширения существующего функционала (создания нового класса на основе другого класса) можно использовать несколько подходов:
- если объект подходит по смыслу "is-a ("является"), то применяем наследование (дочерний класс -> родительский класс)
- если объект подходит по смыслу "has-a" ("содержит"), то применяем композицию (ассоциация)


Как и в Java:
- можно создавать дочерние классы от любого другого класса
- дочерний класс может иметь только одного родителя
- все классы по-умолчанию наследуются от общего класса-родителя Object


По-умолчанию все классы в Kotlin не разрешают наследование (final class в Java) - важное отличие от Java.
Чтобы разрешить наследование - добавляется слово "open"


Поставьте курсор внутрь нужного класса и нажмите комбинации Ctrl + H (или Navigate -> Type hierarchy) - можно увидеть всех родителей и наследников - полезно для изучения дерева наследования


Важное отличие:
- в Kotlin слово override перед методом - это ключевое слово (а не аннотация) и оно обязательно к добавлению (для реализации или переопределения)
- в Java можно было не добавлять @Override, т.к. компилятор сам "понимал", что этот метод является реализацией или переопределением (кроме неоднозначных случаев)
- в Kotlin все объекты по-умолчанию наследуются от типа Any (аналог Object в Java) - это самый верхний родительский объект


 */


// правой кнопкой -> Run
// можете комментировать определенные строки функции и заново запускать проект, чтобы не запутаться при выводе результатов
fun main() {

    val circle = Circle() // создание объекта Circle (ключевое слово "new" не нужно) - circle теперь хранит ссылку на объект


//  в circle нельзя присвоить новый объект, т.к. val (константа)

    // можем вызывать как родительские методы, так и дочерние (у всех функций модификатор доступа public - подробнее в след. уроках)
    circle.draw()
    circle.calcRadius()


}


// родительский класс "фигура" (без собственных конструкторов)
open class Shape { // open - чтобы можно было наследоваться от класса (тут создан компилятором автоматически ПК без параметров)

    open fun draw() { // чтобы дочерние классы могли переопределить метод - нужно добавить слово "open" (без него метод будет по-умолчанию final)
        println("draw shape shape")
    }

}

// дочерний класс "круг" - является фигурой, подходит по смыслу "is"
// для наследование просто пишем символ ":"  , не нужно писать extends как в Java
open class Circle : Shape() { // Пустые скобки означают, что родительский класс - без конструкторов (подробнее - в след. уроках)

    // дополнительные свои методы, который характерны только для Circle
    fun calcRadius() {

        super.draw() // можно вызывать родительские методы

        println("calc radius")

    }

}