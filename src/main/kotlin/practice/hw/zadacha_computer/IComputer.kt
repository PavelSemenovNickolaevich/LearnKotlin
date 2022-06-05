package practice.hw.zadacha_computer

interface IComputer {

    var name: String
    var monitor: IMonitor

    fun on()
    fun off()
}