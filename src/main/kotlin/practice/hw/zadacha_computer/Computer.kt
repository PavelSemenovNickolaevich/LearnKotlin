package practice.hw.zadacha_computer

class Computer(override var name: String, override var monitor: IMonitor) : IComputer {

    override fun on() {
        println("Компьютер включился $name, используется монитор ${monitor.name}")
    }

    override fun off() {
        println("Компьютер выключился $name, используется монитор ${monitor.name}")
    }
}