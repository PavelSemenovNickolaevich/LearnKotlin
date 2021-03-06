package practice.city.interfaces

import practice.city.objects.Settler

/*
 Все действия и свойства объектов прописываем согласно условию задачи (часто называют "ТЗ" - техническое задание)

 На все главные объекты, которые реализуют функционал - нужно создавать интерфейсы (кроме объектов-утилит, вспомогательных и пр.)

 С первого раза на 100% не нужно описывать интерфейс, только основные моменты (например, названия свойств и методов пока без параметров и возвращаемого типа - чтобы увидеть общую картину), затем по ходу разработки - корректировать (добавлять параметры и пр.)
 Ошибка многих новичков - пытаются сразу сделать правильный, идеальный интерфейс (не всегда получается), но потом не исправляют по ходу создания проекта и работают до конца с этим неверным вариантом
 Практически не бывает ситуаций, когда интерфейс описан идеально с первого раза - поэтому в начале создаем черновой вариант, потом постепенно дорабатываем

*/

// в интерфейсе можем определять как свойства, так и функции (в отличие от Java, где свойства приходилось описать с помощью методов get)


// 2-й вариант хранения константы
const val DEFAULT_CAPACITY = 2 // лимит жителей в квартире по условию задачи = 2. В интерфейсах нельзя объявлять переменные, только константы (для переменных мы создаем методы get - тем самым обязываем классы-реализации иметь это свойство)

// квартира
interface IFlat { // Буква "I" в начале слова означает интерфейс (это один из способов именования, чтобы сразу отличать от обычных классов)

    val number: Int  // номер квартиры

    val settlerList: ArrayList<Settler> // список всех жителей квартиры

    fun addSettler(settler: Settler) // добавить жителя в квартиру

//    // 1-й вариант хранения константы (не рекомендуется)
//    companion object { // companion object используем для создания статичного элемента
//        const val DEFAULT_CAPACITY = 2 // лимит жителей в квартире по условию задачи = 2. В интерфейсах нельзя объявлять переменные, только константы (для переменных мы создаем методы get - тем самым обязываем классы-реализации иметь это свойство)
//    }
}
