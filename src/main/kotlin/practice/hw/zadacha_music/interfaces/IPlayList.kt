package practice.hw.zadacha_music.interfaces

import practice.hw.zadacha_music.objects.Song

interface IPlayList {

    var songList: ArrayList<ISong> // список песен

    fun addSong(song: ISong) // добавить песню

    fun playAllSongs() // проиграть все песни

    fun shuffle() // перемешать песни в случайном порядке

}