package practice.hw.zadacha_printer.paper

import practice.hw.zadacha_printer.`interface`.IPaper

class PaperA5(override var size: Int, override var name: String = "A5") : IPaper{
}