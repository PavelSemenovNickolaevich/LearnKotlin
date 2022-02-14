package theory.`2_Variables` // цифры нежелательно добавлять в название пакета, но для обучения удобней будет использовать нумерацию пакетов (чтобы соблюдать последовательность)


/*

"Объявление переменных и констант"


- lateinit var
    - инициализацию можно отложить до первого использования
    - lateinit val нельзя писать (константа должна получить значение в том же месте, где объявлена)

- val - константа (immutable, read only) - значение можно присвоить только один раз
    - runtime value - присваивается во время работы приложения
    - можно присвоить результат работы функции и пр.

- const val
    - compile value - значение присваивается до начала работы приложения
    - значение фиксированное и НЕ зависит от других переменных
    - НЕЛЬЗЯ присвоить результат работы функции и пр.
    - аналог static final из Java
    - const var нельзя писать


https://kotlinlang.org/docs/properties.html#compile-time-constants



 */


// lateinit var
lateinit var name: String // можно писать
//lateinit var name2 = "test" // нельзя писать (и нет смысла использовать lateinit, т.к. присваиваем сразу значение)
//const var dig = 1 // так писать нельзя


// сonst val
const val constDigit1 = 5 // const добавляется тогда, когда константа имеет фиксированное значение и не зависит от других переменных
const val constDigit2 = constDigit1 // можно присваивать другие const val
//const val constDigit3 = name // нельзя присваивать var
//const val constDigit4 = constant // нельзя присваивать val
//const val constDigit4 = testValue2() // нельзя вызывать функцию (в отличие от обычного val)


fun testValue2() = 10 // тестовая функция



// правой кнопкой -> Run
// можете комментировать определенные строки функции и заново запускать проект, чтобы не запутаться при выводе результатов
fun main() {

//    name="test name"

    print(name); // если lateinit name до момента первого использования не будет иметь значение - выйдет ошибка UninitializedPropertyAccessException: lateinit property name has not been initialized


}




