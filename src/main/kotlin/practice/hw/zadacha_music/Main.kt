package practice.hw.zadacha_music

import practice.hw.zadacha_music.objects.Author
import practice.hw.zadacha_music.objects.PlayList

import practice.hw.zadacha_music.objects.Song

fun main() {

    // список авторов
    val author1 = Author("Чайковский")
    val author2 = Author("Вивальди")
    val author3 = Author("Киркоров")
    val author4 = Author("Sting")
    val author5 = Author("Queen")


    // список песен с авторами
    val song1 = Song("Щелкунчик", author1)
    val song2 = Song("Лебединое озеро", author1)
    val song3 = Song("Времена года", author2)
    val song4 = Song("Цвет настроения синий", author3)
    val song5 = Song("Shape of My Heart", author4)
    val song6 = Song("Show must go on", author5)
    val song7 = Song("We will rock you", author5)


    // заполняем плейлист
    val playlist = PlayList()
    playlist.addSong(song1)
    playlist.addSong(song2)
    playlist.addSong(song3)
    playlist.addSong(song4)
    playlist.addSong(song5)
    playlist.addSong(song6)
    playlist.addSong(song7)

    playlist.addSong(song1) // пытаемся добавить уже существующую песню (должно выйти сообщение, что нельзя добавить)


    // проиграть все песни
    playlist.playAllSongs()


    // перемешать и заново проиграть все песни
    playlist.shuffle()
    playlist.playAllSongs()
}

