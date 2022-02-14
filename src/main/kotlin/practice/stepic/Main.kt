package practice.stepic

/*
Напишите программу, которая считывает число от 1000 до 9999, разворачивает его и выводит без ведущих нулей:
1300 -> 0031 -> 31 // т.е. нули спереди числа - ведущие нули
 */

val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    val i = scan.nextInt()
    val x = (i/1000) + (i%1000/100) * 10 + (i%100 / 10) * 100 + (i % 10) * 1000
    println(x)

}

val scan2 = java.util.Scanner(System.`in`)
fun main22(){
    var a = scan2.next()
    for (i in 1..3) {
        print(" $a ")
    }
}
