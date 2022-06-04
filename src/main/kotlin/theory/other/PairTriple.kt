package theory

/*

Специальные готовые типы данных, которые являются по сути data классами (контейнеры для хранения значения):

Pair - хранит 2 значения любого типа
Triple - хранит 3 значения любого типа

Если нужно сохранить больше переменных в одном контейнере - создавайте свой data class с нужным кол-вом переменных

Желательно, чтобы значения были подходили по смыслу для Pair или Triple.

В других языках (например, Swift) существует похожий тип, который называется Tuple (кортеж) - может хранить любое кол-во значений

В Java существуют сторонние библиотеки, которые реализовывают похожий тип данных, например https://www.javatuples.org/

 */



// правой кнопкой -> Run
// можете комментировать определенные строки функции и заново запускать проект, чтобы не запутаться при выводе результатов
fun main() {

    var twoDigits = Pair(2, 5)
    println(twoDigits)


    var threeDiffTypes = Triple(45, "test", listOf<Int>(3, 5, 1)) // разные типы значений
    println(threeDiffTypes)

    println(threeDiffTypes.second) // можно обращаться по порядковому номеру

//    раскладывание в отдельные переменные
    var (d1, d2) = twoDigits
    println(d1)


    // из Pair или Triple можно собирать массив/коллекцию
//    val array= arrayListOf<Any>(twoDigits, threeDiffTypes) // указываем тип коллекции Any (любой тип), т.к. все значения, которые добавляем, имеют разные типы
//    println(array)

// вы можете Pair ли Triple превратить в коллекции объектов

    var arrayDigit = twoDigits.toList()
    println(arrayDigit)

    println(returnTriple(1,3,5))


}


// возвращаем Triple как результат функции
fun returnTriple(a1: Int, a2:Int, a3:Int): Triple<Int, Int, Int>{

    return Triple(a1, a2, a3)


}
