package practice.hw.zadacha_music.interfaces

import practice.hw.zadacha_music.objects.Author

interface ISong {

    var name: String
    var author: Author
    fun play()
}