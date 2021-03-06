package theory


/*

Как правильно сравнивать значения в Kotlin


Все в Kotlin - объекты, поэтому для сравнения используется:
- либо метод equals (переопределенный или дефолтный)
- либо сравниваются ссылки на объект

Не путать:
= присвоение значения
== сравнение двух значений - "Structural Equality" ("структурное сравнение"). Т.к. в Kotlin все - объекты, то при сравнении переменных вызывается метод equals - аналог equals в Java
=== сравнение ссылок на объект (указывают ли две ссылки на один и тот же объект) - "Referential equality" ("ссылочное сравнение") - аналог == в Java

Отрицания (первое равно заменяется на восклицательный знак):
!=
!==


 */



// правой кнопкой -> Run
// можете комментировать определенные строки функции и заново запускать проект, чтобы не запутаться при выводе результатов
fun main() {

    val str1 = "a"
    val str2 = "a" // Kotlin оптимизирует память и видит, что уже есть объект str1 с этим же значением, поэтому просто присваивает в str2 ссылку на тот же объект
    println(str1 === str2) // поэтому тут true


    // создаются 2 разных объекта в памяти, даже если у них одинаковые значения age
    val mary1 = Mary(20)
    val mary2 = Mary(20)


    println(mary1 == mary2) // true - значение age у них одинаковое (т.к. Mary - это data class, то переменная age автоматически применяется в методе equals при сравнении)
    println(mary1 === mary2) // false - это разные объекты и разные ссылки на них


    val arthur1 = Arthur(20)
    val arthur2 = Arthur(20)

    println(arthur1 == arthur2) // false - значение age у них одинаковое, но оно не участвует при сравнении объектов, т.к. не data class (а используется hashCode, который у всеъ объектов отличается)
    println(arthur1 === arthur2) // false - это разные объекты и разные ссылки на них



    val alex1 = Alex(20)
    val alex2 = Alex(20)


    println(alex1 == alex2) // true - значение age у них одинаковое (и мы вручную переопределили метод equals, который использует age для сравнения)
    println(alex1 === alex2) // false - это разные объекты и разные ссылки на них

    println(alex1.equals(alex2)) // компилятор предлагает заменить equals на == . Смысл один и тот же, но предпочтительней использовать ==

}

// data класс-контейнер
data class Mary(var age: Int) // переменная age автоматически применяется в методах equals, toString, hashCode, copy - поэтому она участвует при сравнении объектов ==


// нет переопределенного метод equals
class Arthur(var age: Int)  // это не data класс, поэтому метод equals, hashCode НЕ будут использовать age для сравнения объекта - поэтому == и === будут возвращать false при сравнении


// реализовали (переопределили) методы equals и hashCode (желательно оба переопределять, т.к. они работают в паре)
class Alex(var age: Int) { // это не data класс, поэтому метод equals, hashCode НЕ будут использовать age для сравнения объекта - поэтому == и === будут возвращать false при сравнении

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Alex

        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        return age
    }

    // правило: если два объекта идентичны (метод equals) - их хеш коды тоже должны быть равны (метод hashCode)
}



