package theory.`7_Functions`

/*


return - возвращает значение (если указан тип) или просто выходит из метода (если тип Unit)

в функции может быть несколько return, который вызываются в зависимости от условий

Если тип функции указан, то обязательно должен быть return

 */


fun main(){

    println(manyReturns(4,5)) // println будет печатать то, что вернет функция manyReturns

    println(manyReturns(7,5))

    unitReturn(3,5)
    unitReturn(7,5)
}


// несколько return в одной функции
fun manyReturns(a: Int, b: Int): String{
    if (a>b){
        return "a>b" // после каждого return - код дальше не будет выполняться
    }

    return "a<b"
}


// return для типа Unit
fun unitReturn(a: Int, b: Int){
    if (a>b){
        return // просто выйдет из метода и дальнейший код выполняться не будет
    }

    println("дошли до конца метода")
}
