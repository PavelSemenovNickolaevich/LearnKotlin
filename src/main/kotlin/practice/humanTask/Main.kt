package practice.humanTask

fun main() {

    val human1 = Human("human1", 23)
    val human2 = Human("human2", 23)
    val human3 = Human("human3", 23)
    val human4 = Human("human4", 23)

    val humans:Array<Human> = arrayOf(human1, human2, human3, human4)

    var sum = HumanManager(humans)

    sum.calcSummaryAge()

    println(sum.sum)
}