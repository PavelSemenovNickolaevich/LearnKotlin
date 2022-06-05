package practice.hw.zadacha_computer

fun main() {

    val monitor = Monitor("Samsung")
    val comp = Computer("MacBook", monitor)

    comp.on()
    comp.off()
}