package practice.hw.zadacha_film


fun main() {

    var terminator = Film("Терминатор","")
    var avatar = Film("Аватар","Фантастика")
    var batmen = Film("Бэтмен","Боевик")

    batmen.show()
    avatar.show()
    terminator.show()

    val filmList = ArrayList<IFilm>()

    for (i in 1..10) {
        filmList.add(Film(i.toString(), "Comedy"))
    }

    for (film in filmList) {
        film.show()
    }
}