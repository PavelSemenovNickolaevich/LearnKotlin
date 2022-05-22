package theory.`15_Extension`

/*

Если вы попытаетесь переопределить существующий метод с помощью расширения - будет все равно вызван метод класса (а не расширения)


 */


fun main() {

    var dish = Dish("Борщ")
    println(dish) // не вызовет метод toString из расширения

    dish.printText() // новый метод из расширения вызовется успешно, т.к. в самом классе нет метода с такой же сигнатурой (название метода и параметры в том же порядке)

}


// класс с данными
class Dish(var name: String){
    override fun toString(): String  = name // переопределили метод toString, который теперь вместо hashCode вернет name
}

// расширение пытается определить метод toString, который уже существует в классе
fun toString(): String {
    return "new final value"
}

// новый метод из расширения - в самом классе нет метода с такой же сигнатурой
fun Dish.printText() {
    println("new method working!!!")
}
