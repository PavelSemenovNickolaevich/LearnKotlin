package practice.hw.zadacha_music.objects

import practice.hw.zadacha_music.interfaces.IPlayList
import practice.hw.zadacha_music.interfaces.ISong

class PlayList() : IPlayList {

    override var songList = ArrayList<ISong>()


    override fun addSong(song: ISong) {

        if (songList.contains(song)) { // если коллекция уже содержит эту песню (этот объект)
            println("Песня ${song.name}  уже была добавлена ранее")
            return  // выходим из метода и не добавляем песню
        }

        songList.add(song) // т.к. это ArrayList, поэтому все новые объекты попадают в конец списка
    }

    override fun playAllSongs() {
        // проигрываем все песни (перебор объектов в цикле)
        for (song in songList) {
            song.play() // проиграть песню
        }
    }

    override fun shuffle() { // перемешать все песни
        println("Перемешиваем...")
        songList.shuffle() // готовый метод для перемешивания коллекции в случайном порядке
    }
}