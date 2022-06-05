package practice.hw.zadacha_bludo.impls

import practice.hw.zadacha_bludo.interfaces.IDish
import practice.hw.zadacha_bludo.interfaces.IIngredient

class Dish(override var name: String) : IDish {

    override var ingredients = ArrayList<IIngredient>()
    // максимум ингредиентов в блюде (согласно условию задачи)
    private val maxIngredientsCount = 4 // все заранее известные числа и строки желательно выносить в константы (чтобы избежать антипаттерна "magic number", когда по коду непонятно смысл значения)

    // все ли условия выполнены для готовки блюда
    override fun canCook(): Boolean {

        // проверяем корректность вкусов
        if (saltyAndSweetMixed()) { // если смешано сладкое и соленое, то выводим сообщение и выходим из метода (не готовим блюдо)
            println("Блюдо \"$name\" не может быть приготовлено! Смешано соленое со сладким.")
            return false // false - блюдо НЕ может быть приготовлено - выходим из метода
        }

        // проверяем кол-во ингредиентов (согласно условию задачи)
        if (ingredients.size > maxIngredientsCount) { // добавлено слишком много ингредиентов
            println("Блюдо \"$name\" не может быть приготовлено! Ингредиентов не должно быть больше 4-х (у вас ${ingredients.size})")
            return false // false - блюдо НЕ может быть приготовлено
        }
        return true // если код дошел до этого места - значит все проверки прошли успешно - возвращаем true (блюдо может быть приготовлено)
    }

    // свой внутренний метод класса (не из интерфейса), который проверяет вкусы (чтобы разгрузить метод canCook)
    private fun saltyAndSweetMixed(): Boolean {
        var saltyTaste = false // присутствует ли соленый вкус в блюде
        var sweetTaste = false // присутствует ли сладкий вкус в блюде

        // проходим в цикле по всем ингредиентам блюда и проверяем, присутствует ли там нужный вкус
        for (product in ingredients) {
            if (product.taste == Taste.SALTY) {
                saltyTaste = true // соленый вкус присутствует
            }
            if (product.taste == Taste.SWEET) {
                sweetTaste = true // сладкий вкус присутствует
            }
        }

        return saltyTaste && sweetTaste // true, если оба значения true

    }



    // готовка блюда
    override fun cook() {
        if (canCook()) { // проверяем, можно ли приготовить блюдо
            println("Блюдо '$name' готово, ингредиенты: $ingredients, общий вес: ${calcTotalWeight()}")
        }
    }

    // считает общий вес блюда
    override fun calcTotalWeight(): Int {
        var commonWeight = 0 // локальная переменная, которая видно только внутри функции

        // проходим по циклу и считаем общий вес
        for (product in ingredients) {
            commonWeight += product.weight // commonWeight = commonWeight + product.getWeight();
        }
        return commonWeight
    }

}


enum class Taste {
    SALTY, // солёный
    SWEET, // сладкий
    SOUR, // кислый
    BITTER // горький
}