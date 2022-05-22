package practice.taskPhone

class Samsung(name:String): Phone(name) {

    val waterResistance = true

    override fun sendMessage(to:String, text:String){

        println("$name cannot send message")

    }
}