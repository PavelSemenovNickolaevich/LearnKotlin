package theory.syntax.`6_ArraysCollections`


/*

"Массивы" - набор данных любого типа

Если данные динамические (размер изменяется) - используйте вместо массива одну из коллекций (List, Set, Map)
https://kotlinlang.org/docs/reference/collections-overview.html

Если размер фиксированный - используйте массив.

Индексация массива - с нуля (как и в Java-подобных языках)


 */


// правой кнопкой -> Run
// можете комментировать определенные строки функции и заново запускать проект, чтобы не запутаться при выводе результатов
fun main() {

    println("array of digits ------------ ")
    var arrayDigits = arrayOf(1, 5, 3, 7, 9) // массив фиксированной длины

    arrayDigits += 15 // можем добавлять в массив новые элементы, но в этом случае создается новый массив на основе старого
    arrayDigits += 15 // можно добавлять одинаковые значения

    arrayDigits[1] = 120 // заменяем второй элемент



    for ((index, value) in arrayDigits.withIndex()) {
        println("index: $index, value: $value")
    }


}



