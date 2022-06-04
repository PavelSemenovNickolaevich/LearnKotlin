package theory


/*

"Автоматическое приведение типов с помощью is"

Kotlin автоматически конвертирует типы переменных после их успешной проверки (в отличие от Java, где в любом случае требуется приведение типа - даже после успешной проверки)

https://kotlinlang.org/docs/reference/typecasts.html

 */




// правой кнопкой -> Run
// можете комментировать определенные строки функции и заново запускать проект, чтобы не запутаться при выводе результатов
fun main() {

    // типы переменных - это типы интерфейсов с возможным null
    // в переменные можно записать любые фильмы, которые реализовали интерфейс IFilm
    var avatarFilm: IFilm?
    var terminatorFilm: IFilm?
    var alienFilm: IFilm?


    avatarFilm = Avatar()
    terminatorFilm = Terminator()
    alienFilm = Alien()


    if (avatarFilm is Avatar) {
        avatarFilm.showAvatar() // переменная avatarFilm автоматически становится типом Avatar, а не IFilm (компилятор видит, что если условие верно - то значит avatarFilm хранит ссылку на Avatar)
    }
    // в Java пришлось бы все равно делать вручную приведение переменной от типа IFilm к типу Avatar


    if (terminatorFilm is Terminator) {
        terminatorFilm.showTerminator() // можем сразу вызывать специфичные методы типа Terminator, т.к. после проверки тип terminatorFilm автоматически стал Terminator
    }

    if (alienFilm is Alien) {
        alienFilm.shoeAlien()
    }


}



interface IFilm {
    fun showDefaultFilm() {
        println("show def film")
    }
}


class Avatar : IFilm {

    // специфичная функция, которая доступна только данному классу
    fun showAvatar(){
        println("avatar")
    }

}

class Terminator: IFilm {

    // специфичная функция, которая доступна только данному классу
    fun showTerminator(){
        println("terminator")
    }

}

class Alien: IFilm {

    fun shoeAlien() {
        println("alien")
    }
}



