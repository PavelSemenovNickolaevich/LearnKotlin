package practice.hw.zadacha_music.objects

import practice.hw.zadacha_music.interfaces.ISong

class Song(override var name: String, override var author: Author) : ISong {


    override fun play() {
        println("Играет песня: $name, автор: ${author.name}")
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Song

        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}