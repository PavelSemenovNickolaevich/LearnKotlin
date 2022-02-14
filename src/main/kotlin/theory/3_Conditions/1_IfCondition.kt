package theory.`3_Conditions`


/*

"Условные операторы" - для создания разветвлений в коде (не линейное выполнение, а в зависимости от условий)

Варианты применения if


 */



// правой кнопкой -> Run
// можете комментировать определенные строки функции и заново запускать проект, чтобы не запутаться при выводе результатов
fun main() {

    // начальные тестовые данные

    var a = 10
    var b = 20
    var text = "hello"


    // Вариант 1-й "без фигурных скобок" - если нужно вызвать только один оператор - ухудшается чтение кода (т.к. визуально НЕ видно границ условия if)

    print("1  ---------------------")

    if (a < b) println("a < b")


    // Вариант 2 "с фигурными скобками" - улучшается чтение кода  (визуально видны границы условия if)

    println("2  ---------------------")

    if (a < b) {
        println("a < b")
    }


    // Вариант 3 "else" - улучшается чтение кода  (визуально видны границы условия if)

    println("3 else")

    if (a <= b) {
        println("a <= b")
    } else {
        println("a > b")
    }

    if (a <= b) println("a <= b") else println("a > b") // короткая запись в одну строку (ухудшается чтение кода)


    // Вариант 4 "Несколько else" - улучшается чтение кода

    println("4 Несколько else  ------------ ")

    // (ухудшается чтение кода, желательно заменить на when)
    if (a < b) { // (компилятор подсказывает - слишком много if лучше заменить на when)
        println("a < b")
    } else if (a == b) {
        println("a = b")
    } else {
        println("a > b")
    }


    // Вариант 5 "Присвоение значения в результате выполнения условия"

    println("5 Проверка условия и одновременно присвоение результата ------------ ")

    var result1: String = if (a < b) { // (компилятор подсказывает - слишком много if лучше заменить на when)
        "a < b"
    } else if (a == b) {
        "a = b"
    } else {
        "a > b"
    }

    println("result = $result1")


    // Вариант 6 "Проверка условия и одновременно присвоение результата с применением переменной"

    println("6 Проверка условия и одновременно присвоение результата с применением переменной ------------ ")

    // тип переменной result2 еще не определен до момента присвоения (может быть String, Int или любое другое, в зависимости от выполненного условия)
    // наведите мышкой на переменную и увидите, что указаны возможные типы исходя из условий if

    var result2 = if (a < b) {
        var t = 12 // до присвоения можно вызывать любые операторы, объявлять переменные и пр.
        t += 10
        t // в result присвоится переменная t
    } else if (a == b) {
        text // присвоится переменную текст, которую объявили на уровне класса - нажмите на переменную Ctrl + лев. кнопку мыши (ЛКМ) для перехода
    } else {
        true // присвоится boolean
    }

    println("result = $result2")


}



