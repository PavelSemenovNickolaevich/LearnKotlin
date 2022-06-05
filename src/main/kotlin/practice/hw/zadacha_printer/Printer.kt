package practice.hw.zadacha_printer

import practice.hw.zadacha_printer.`interface`.IPaper
import practice.hw.zadacha_printer.`interface`.IPrinter

class Printer(override var paintVolume: Int = 0) : IPrinter {

    override var status = false

    override fun on() {
        status = true
        println("Принтер включился! Осталось краски: $paintVolume")
    }

    override fun off() {
        status = false
        println("Принтер выключился!")
    }

    override fun print(text: String, paper: IPaper) {
        println("На печать отправлен текст: $text, длина: ${text.length}")
        if (!status) {
            println("Принтер выключен и недоступен. Печать невозможна")
            return
        }
        if (paintVolume < text.length) {
            println("Не хватает краски: ${text.length } - $paintVolume")
            return
        }

        println("Текст распечатан: $text")

        paintVolume  -= text.length

        println("Использовалась бумага: ${paper.name}, размер: ${paper.size}")
        println("У принтера осталось краски: $paintVolume")
    }

    override fun charge(paintVolume: Int) {
        println("Принтер заправлен на $paintVolume символов (всего осталось $this.paintVolume)")
        this.paintVolume += paintVolume
    }
}