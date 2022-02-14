package practice.zadacha2

/*


Создать 26 переменных (var) с разными типами (имена и значения - любые)

Можно использовать только "примитивные" типы (не объектные, не коллекции, не массивы, не Pair и пр.)

Можно использовать шапаргалку: https://kotlinlang.org/docs/basic-types.html


*/


var var1: Int = 1
var var2: String = "test"
var var3: Float = 1f
var var4: Double = 1.1
var var5: Char = 'A'
var var6: Boolean = true
var var7: Long = 1
var var8: Short = 1
var var9: Byte = 1

var var10: Int? = null
var var11: String? = null
var var12: Float? = null
var var13: Double? = null
var var14: Char? = null
var var15: Boolean? = null
var var16: Long? = null
var var17: Short? = null
var var18: Byte? = null

var var19: ULong = 1u
var var20: UShort = 1u
var var21: UByte = 1u
var var22: UInt = 1u

var var23: ULong? = null
var var24: UShort? = null
var var25: UByte? = null
var var26: UInt? = null

val scan = java.util.Scanner(System.`in`)

fun main(args: Array<String>){
    var a = scan.nextInt();
    var b = scan.nextInt();

    var c1 = a / 100;
    var d1 = a % 10;
    var c2 = b / 100
    var d2 = b % 10;
    println(c1 + d1 + c2 + d2);
}



