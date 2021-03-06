

/*

"Object expression" - способ создания объекта с помощью анонимного класса (класс без имени, только с реализацией)

Для создания анонимного класса (далее АК) - используется ключевое слово "object"

Ключевое отличие от обычного класса в том, что НЕ создается отдельный класс (с ключевым словом class), а тело класса описывается сразу в месте объявления
Мы не можем создать класс по его имени, а только можем создать блок (body) класса и использовать его где нужно.


Анонимный класс (далее АК) - это класс без имени, может использоваться:
 - для наследования от другого класса (или реализации интерфейса) - в этом плане он похож на обычный класс
 - для реализации "временного" класса, который нужно использовать в коде и забыть


АК (объект в памяти) можно присвоить в переменную, реализовать в качестве параметра функции, возвращаемого значения и многое другое.

Для чего нужен:
 - сокращает код (не нужно создавать отдельный класс - это ключевая особенность)
 - используется, когда нужно "по-быстрому" реализовать интерфейс или переопределить класс или просто создать класс - и сразу использовать это где-то в коде

Не рекомендуется помещать много кода в АК - лучше тогда создать для этого отдельный полноценный класс.
Применят иногда слово "заплатка" - небольшой функционал.

Особенности АК:
- инициализируется (выделяется место в памяти) сразу, даже если к нему ни разу не обратились в коде
- может обращаться к элементам внешнего контейнера (например, класса или функции, где объявлен АК)
- нельзя добавлять конструктор


Часто используется в Android и различных фреймворках, где создаете UI (там постоянно применяются анонимные классы)


 */

// АК объявлен на уровне файла - класс не наследуется от других классов и не реализовывает интерфейс - такой вариант не так часто используется, т.к. извне не можем обратиться к функциям или переменным АК
var anonym1 = object {  // внутри АК можете реализовать любой функционал
    // тип переменной anonym1: Any

    init {
        println("init anonym 1")
    }

    var defaultText = "def text" // доступ к этой переменной - только внутри АК

    fun printText(text: String){
        println(text)
        println(defaultText)
    }

}



// правой кнопкой -> Run
// можете комментировать определенные строки функции и заново запускать проект, чтобы не запутаться при выводе результатов
fun main() {


//    anonym1.printText("asdasd") // компилятор не видит функцию, т.к. тип Any


}





