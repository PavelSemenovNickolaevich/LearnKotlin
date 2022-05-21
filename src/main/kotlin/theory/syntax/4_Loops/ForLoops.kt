package theory.syntax.`4_Loops`


/*

"Цикл for"

Используется, когда известно количество шагов или нужно просто пройтись по коллекции

Цикл завершается, когда пройдены все шаги (или были пройдены все элементы коллекции)


 */


// правой кнопкой -> Run
// можете комментировать определенные строки функции и заново запускать проект, чтобы не запутаться при выводе результатов
fun main() {


    // проход по значениям

   // println("обычный цикл:")
//    for (i in 1..5) {
//        println(i)
//    }
//
//    println("обратный цикл:")
//    for (i in 5 downTo 1) {
//        println(i)
//    }

 //   println("цикл с шагом:")
    // цикл c шагом
    var i = 0;
    for (i in 1..10 step 3) {
        if(i == 4) {
            println(i)
            break
        }
    }
    var b = i + 5
    println(b)

    println("обратный цикл с шагом:")
    for (i in 15 downTo 1 step 3) {
        println(i)
    }


    // коллекции

    println("цикл по объектам коллекции:")
    val arrayNames = arrayOf("James", "Jack", "John", "Steve", "Mike") // подробнее о массивах - далее в уроках
    for (digit in arrayNames) { // перебор всех объектов коллекции
        // переменная digit будет хранить ссылку на выбранный объект при каждом шаге цикла
        println(digit)
    }


    println("цикл по индексам коллекции:")
    for (i in arrayNames.indices) { // проходим по индексам
        println(arrayNames[i]) // получаем объект по индексу
    }

    println("цикл по индексам и значениям коллекции:")
    for ((index, value) in arrayNames.withIndex()) { // можем обратиться как к индексу, так и к самому значению
        println("$index, $value")
    }

    println("цикл с прерыванием break")
    for ((index, value) in arrayNames.withIndex()) { // можем обратиться как к индексу, так и к самому значению
        println("$index, $value")
        if (index == 1){ //
            break // полностью выход из цикла
        }
    }

    println("цикл только по нечетным индексам с помощью continue")
    for ((index, value) in arrayNames.withIndex()) { // можем обратиться как к индексу, так и к самому значению
        if (index % 2 == 0){ //
            continue // переход к следующему шагу цикла
        }
        println("$index, $value")
    }



}
