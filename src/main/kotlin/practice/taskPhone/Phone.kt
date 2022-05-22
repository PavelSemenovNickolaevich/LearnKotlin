package practice.taskPhone

open class Phone(var name: String) {

    open fun on() {
        println("$name is on")
    }

    open fun off() {
        println("$name is off")
    }

    open fun call(to: String) {
        println("$to was called")
    }

    open fun sendMessage(to: String, text: String) {
        println("$name sends $text: $to")
    }

}