package practice.hw.zadacha_printer.paper

import practice.hw.zadacha_printer.`interface`.IPaper

class PaperA4(override var size: Int, override var name: String = "A4") : IPaper {
}