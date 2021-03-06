package practice.task1

/*
Вывести 4 строки в консоль с текстом:

Привет 1
Привет 2
Привет 3
Привет 4

Использовать для этого:
1 функцию (помимо main)
1 цикл
1 оператор println (не больше)

 */


fun main() {
  cycle()
    for (i in 1..4) {
        printText("Привет $i")
    }
}

fun cycle() {
    val name = "Привет"
    for (i in 1..4) {
        println("$name $i")
    }
}

fun printText(text: String) {
    println(text)
}