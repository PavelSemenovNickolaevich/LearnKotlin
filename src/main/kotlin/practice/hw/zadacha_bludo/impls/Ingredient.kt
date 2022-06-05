package practice.hw.zadacha_bludo.impls

import practice.hw.zadacha_bludo.interfaces.IIngredient

abstract class AIngredient (override var name: String, override var taste: Taste, override var weight: Int): IIngredient {

    override fun toString(): String {
        return name // теперь вместо хешкода класса - при его печати будет выводиться name
    }

    // яблоко
    class Apple(name: String = "apple", taste: Taste, weight: Int) : AIngredient(name, taste, weight) // наследуемся от абстрактного класса

    // банан
    class Banana(name: String = "banana", taste: Taste, weight: Int) : AIngredient(name, taste, weight) // наследуемся от абстрактного класса

    // свекла
    class Beet(name: String = "beet", taste: Taste, weight: Int) : AIngredient(name, taste, weight) // наследуемся от абстрактного класса

    // хлеб
    class Bread(name: String = "bread", taste: Taste, weight: Int) : AIngredient(name, taste, weight) // наследуемся от абстрактного класса

    // сыр
    class Cheese(name: String = "cheese", taste: Taste, weight: Int) : AIngredient(name, taste, weight) // наследуемся от абстрактного класса

    // картофель
    class Potato(name: String = "potato", taste: Taste, weight: Int) : AIngredient(name, taste, weight) // наследуемся от абстрактного класса

    // колбаса
    class Sausage(name: String = "sausage", taste: Taste, weight: Int) : AIngredient(name, taste, weight) // наследуемся от абстрактного класса

}