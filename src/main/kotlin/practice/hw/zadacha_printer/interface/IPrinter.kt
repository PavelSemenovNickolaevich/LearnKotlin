package practice.hw.zadacha_printer.`interface`

interface IPrinter {

    var paintVolume: Int
    var status: Boolean

    fun on()
    fun off()
    fun print(text: String, paper: IPaper)
    fun charge(volume: Int)
}


