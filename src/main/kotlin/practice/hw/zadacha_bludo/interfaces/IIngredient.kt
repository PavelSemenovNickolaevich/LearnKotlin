package practice.hw.zadacha_bludo.interfaces

import practice.hw.zadacha_bludo.impls.Taste

interface IIngredient {

    var taste: Taste
    var weight: Int
    var name: String
}