package practice.hw.zadacha_printer

import practice.hw.zadacha_printer.paper.PaperA4
import practice.hw.zadacha_printer.paper.PaperA5

fun main() {

    var canon = Printer()
    var paperA4 = PaperA4(10, )
    var paperA5 = PaperA5(10, )

    canon.print("Hello Worls", paperA4)
    canon.on()
    canon.print("Hello Worls", paperA4)
    canon.charge(20)
    canon.print("Hello Worls", paperA5)
    canon.off()

}