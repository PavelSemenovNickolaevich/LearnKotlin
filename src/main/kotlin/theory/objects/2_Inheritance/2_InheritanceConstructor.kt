package theory.`2_Inheritance`


/*

"Конструкторы и наследование"


При наследовании - Kotlin (как и Java) обязывает связать дочерний и родительский класс (или цепочку классов) через какие-либо конструкторы.

Варианты (дочерний -> родительский):
- ПК -> ПК (дочерний ПК должен вызывать родительский ПК, если они присутствуют в обоих классах) - не нужно писать super
- ПК -> ВК (дочерний ПК может вызвать родительский ВК, если у родителя отсутствует ПК) - не нужно писать super
- ВК -> ВК (дочерний ВК вызывает родительский ВК, если в дочернем и родит. классах нет ПК) - пишем super
- ВК -> ПК (дочерний класс содержит только ВК, а в родительском присутствует ПК) - пишем super

Приоритет всегда отдается связи через ПК (т.к. в нем обычно перечислены критичные свойства объекта, обязательные к заполнению)


Конструкторы на наследуются (как и в Java)
Все нужные конструкторы создаете в каждом классе



 */

// правой кнопкой -> Run
// можете комментировать определенные строки функции и заново запускать проект, чтобы не запутаться при выводе результатов
fun main() {

    // пример создания объекта из дочернего класса
    var house = House("dom",40, "street")
    println("house.name = ${house.name}") // получаем значение name, которое хранится в родительском классе

    var horse = Horse("adasd", 0,0)

}



// родительский класс, где есть ПК (для примера)
open class Building(var name: String, var height: Int) { // open - чтобы можно было наследоваться от класса

}



// ПК -> ПК
open class House(name: String, height: Int, var address: String) : Building(name, height) {


    fun test(){
        println(address)
    }


}







// родительский класс, где нет ПК, но есть ВК (для примера)
open class Animal { // open - чтобы можно было наследоваться от класса

    var name: String;
    var weight: Int;

    constructor(name: String, weight: Int){ // это единственный конструктор, потому что нет конструктора без параметров
        this.name = name;
        this.weight = weight;
    }

}


// варианты связей конструкторов дочерних и родительских классов -----


// ПК -> ВК
open class Cat(name: String, weight: Int) : Animal(name, weight) { // нажимайте Ctrl + ЛКМ на Animal, чтобы узнать вызванный конструктор

}


// ВК -> ПК
open class ChildCat : Cat { // котенок

    var age: Int;

    constructor(name: String, weight: Int, age: Int) : super(name, weight){ // нажимайте Ctrl + ЛКМ на super, чтобы узнать вызванный конструктор
        this.age = age;
    }

}



// ВК -> ВК
open class Horse : Animal {

    var age: Int = 0;

    constructor(name: String, weight: Int, age: Int) : super(name, weight){ // нажимайте Ctrl + ЛКМ на super, чтобы узнать вызванный конструктор
        this.age = age;
    }

}


//// если есть ПК - нельзя вызывать super в ВК (вы не сможете вызвать родит. конструктор в обход ПК)
//open class Shark(var sound: String): Animal { // нажимайте Ctrl + ЛКМ на Animal1
//
//    var age: Int = 0;
//
//    constructor(name: String, weight: Int, age: Int) : super(name, weight){ // нажимайте Ctrl + ЛКМ на super, чтобы узнать вызванный конструктор
//        this.age = age;
//    }
//
//}

// исправленный вариант Shark
open class SharkTrue(var sound: String, name:String, weight: Int): Animal(name, weight) { // нажимайте Ctrl + ЛКМ на Animal1

    var age: Int = 0;

    constructor(name: String, weight: Int, age: Int, sound:String) : this(sound, name, weight){ // нажимайте Ctrl + ЛКМ на super, чтобы узнать вызванный конструктор
        this.age = age;
    }

}





