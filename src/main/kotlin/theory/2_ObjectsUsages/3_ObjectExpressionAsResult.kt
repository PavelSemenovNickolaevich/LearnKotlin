package theory.`2_ObjectsUsages`

/*

АК можно использовать для возврата из функции (не самый частый вариант)

Часто функции АК вызываются системным компонентом (т.е. не нами вручную)

 */


interface ICar {
    fun drive()
    fun stop()
}


fun createCar(): ICar {

    return object : ICar {
        override fun drive() {
            println("car drive")
        }

        override fun stop() {
            println("car stop")
        }

    }


}


// правой кнопкой -> Run
fun main() {

    var c = createCar()
//    c.drive()
//    c.stop()

}





