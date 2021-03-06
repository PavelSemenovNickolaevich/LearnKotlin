
package theory.syntax.`7_Functions`

/*

Параметры функции могут иметь значения по-умолчанию.
Если при вызове функции этот параметр не будет передан - будет использоваться значение по-умолчанию, если передан - будет использоваться переданное значение

 */



// правой кнопкой -> Run
// можете комментировать определенные строки функции и заново запускать проект, чтобы не запутаться при выводе результатов
fun main() {


    // дефолтные значения параметров у функции (можно передавать, а можно не передавать)
    // поставьте курсов внутрь скобок метода и нажмите Ctrl + P, чтобы посмотреть доступные параметры метода (функции)
    var text1 = funWithDefaultParams ("sample")
    println(text1)


    // параметр text2 здесь будет иметь не дефолтное значение, а переданное
    var text2 = funWithDefaultParams ("new sample", "new value")
    println(text2)


}


// дефолтные значения параметров (применяется для перегрузки методов)
// не рекомендуется добавлять в функцию больше 5-6 параметров, иначе труднее читать код
fun funWithDefaultParams(text1: String, text2: String = "default text"): String {
    return "$text1 - $text2"
}


