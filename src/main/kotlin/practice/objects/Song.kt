package practice.objects

class Song(val title: String, val artist: String) {
    fun play() {
        println("Playing the song $title by $artist")
    }

    fun stop() {
        println("Stop playing $title")
    }
 }

fun main(args: Array<String>) {
    val songOne  = Song("Test1", "Artist1")
    val songTwo  = Song("Test2", "Artist3")
    val songThree  = Song("Test3", "Artist3")

    songOne.play()
    songOne.stop()
    songTwo.play()
    songTwo.stop()
    songThree.play()
    songTwo.stop()

}