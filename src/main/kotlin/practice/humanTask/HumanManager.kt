package practice.humanTask

class HumanManager(val humans: Array<Human>) {

    var sum = 0

    fun calcSummaryAge(): Int {

        for ((index, value) in humans.withIndex()) { // можем обратиться как к индексу, так и к самому значению
            println("$index, $value")
            sum += value.age
        }
        return sum
    }
}