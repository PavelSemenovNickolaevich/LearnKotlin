package practice.hw.zadacha_film

class Film(
    override var name: String,
    override var genre: String) : IFilm {

    override fun show() {

        if (name == null || name.trim() == "") {
            println("Film name is empty! Show forbidden")
            return
        }

        if (genre == null || genre.trim() == "") {
            println("Film genre is empty! Show forbidden")
            return
        }

       println ("Смотрим фильм: $name, жанр $genre ")
    }
}