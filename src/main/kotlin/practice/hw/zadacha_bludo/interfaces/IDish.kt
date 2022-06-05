package practice.hw.zadacha_bludo.interfaces

interface IDish {

    var ingredients: ArrayList<IIngredient>
    var name: String

    fun cook()
    fun canCook(): Boolean
    fun calcTotalWeight(): Int
}