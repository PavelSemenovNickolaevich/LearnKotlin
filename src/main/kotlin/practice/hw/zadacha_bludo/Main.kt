package practice.hw.zadacha_bludo


import practice.hw.zadacha_bludo.impls.AIngredient
import practice.hw.zadacha_bludo.impls.Dish
import practice.hw.zadacha_bludo.impls.Taste


fun main() {

    // ингредиенты (можно добавлять любое количество)
    val bread = AIngredient.Bread("хлеб бородинский", Taste.SALTY, 15)
    val sausage = AIngredient.Sausage("колбаса докторская", Taste.SALTY, 10)
    val cheese = AIngredient.Cheese("сыр голландский", Taste.BITTER, 10)
    val potato = AIngredient.Potato("картофель весенний", Taste.SALTY, 150)
    val beet = AIngredient.Beet("свекла свежая", Taste.SOUR, 50)
    val banana = AIngredient.Banana("банан желтый", Taste.SWEET, 50)
    val apple = AIngredient.Apple("яблоко красное", Taste.SWEET, 50)


    // создаем сэндвич и выполняем все условия для успешной готовки
    val sandwich = Dish("Сэндвич")

    // добавляем ингредиенты в сэндвич
    sandwich.ingredients.add(bread) // хлеб
    sandwich.ingredients.add(sausage) // колбаса
    sandwich.ingredients.add(cheese) // сыр
    sandwich.cook() // успешная готовка


    // создаем суп и пробуем добавить больше 4-х ингредиентов
    val soup = Dish("Суп")

    // добавляем ингредиенты в суп
    soup.ingredients.add(beet)
    soup.ingredients.add(potato)
    soup.ingredients.add(cheese)
    soup.ingredients.add(bread)
    soup.ingredients.add(bread)
    soup.cook() // нельзя приготовить, т.к. больше 4-х ингредиентов


    // создаем борщ и пробуем смешать соленое со сладким
    val borshch = Dish("Борщ")

    // добавляем ингредиенты в суп
    borshch.ingredients.add(beet)
    borshch.ingredients.add(potato)
    borshch.ingredients.add(cheese)
    borshch.ingredients.add(apple)
    borshch.cook()

}
