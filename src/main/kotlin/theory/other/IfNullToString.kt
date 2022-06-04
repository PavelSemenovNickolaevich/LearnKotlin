package theory.`8_Nulls`


/*

Примеры условий if для переменных, которые допускают null

https://kotlinlang.org/docs/reference/null-safety.html

Не путайте значение null и текст "null"


 */

// правой кнопкой -> Run
// можете комментировать определенные строки функции и заново запускать проект, чтобы не запутаться при выводе результатов

fun main() {


    // Пример 1 - тип Int - не принимает null

    var count = 5
    if (count == 5) { // "обычное" условие
        println("count = $count")
    }


    // Пример 2 - тип Int?

    var digit: Int? = null

    // такая запись не имеет смысла, т.к. лучше просто написать if (digit == null), но тут приведено для примера
    // toString автоматически конвертирует значение null в текст "null"
    if (digit.toString() == "null") { // не вызовет ошибку компиляции и не требует знака ? для проверки на null, т.к. если digit == null, то выражение digit.toString() вернет текст "null"
        println("digit = $digit")
    }



    // Пример 3 - тип String?

    var text: String? = null

    // явно
//    if (text!!.length > 5) {  // если text == null, то выйдет ошибка KotlinNullPointerException
//        println("text = $text")
//    }


    // https://stackoverflow.com/questions/55402704/kotlin-equal-comparison-seems-ok-on-nullable-but-greater-than-comparison-is-no/55404768

    if (   (text?.length ?: 0)    > 5) {
        println("text = $text")
    }

}
