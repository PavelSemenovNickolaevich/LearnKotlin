package practice.taskPhone

fun main() {

    var samsung = Samsung("Samsung")
    samsung.on()
    samsung.off()
    println(samsung.waterResistance)
    samsung.call("user Samsung")
    samsung.sendMessage("user Samsung", "Hello")

    var asus = Asus("Asus")
    asus.on()
    asus.off()
    asus.call("user Asus")
    asus.sendMessage("user Asus", "Hello")


}