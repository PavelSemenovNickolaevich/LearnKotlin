package practice.city

import practice.city.objects.City
import practice.city.objects.Flat
import practice.city.objects.House
import practice.city.objects.Settler



/*

### Задача "Город"

Цели (помимо пунктов из предыдущих задач):
- применять более сложные вложенности объектов
- применять вложенные циклы по коллекциям
- применять несколько коллекция одновременно

#### Текст задачи:

Создать город с домами и расселить всех жителей по этим домам.

Сущности (entity):

1) Город (City):
    - свойство "name" - название города - String
    - свойство "houseList" - список домов для города - ArrayList<House>
	- метод "addHouse" - добавить новый дом в город (добавляет новый объект в коллекцию houseList)
	- метод "showSettledList" - показать всех заселенных жителей

2) Дом (House) - в нее будут добавляться квартиры
    - свойство "address": адрес - String
    - свойство "flatList": список квартир дома - ArrayList<Flat>
    - метод "addFlat" - добавить новую квартиру в дом (добавляет новый объект в коллекцию flatList)

3) Квартира (Flat) - в нее будем заселять жителей
	- свойство "number": номер квартиры - int
	- свойство "settlerList": список жителей квартиры - ArrayList<Settler>
    - метод "addSettler": добавить нового жителя в квартиру (добавляет новый объект в коллекцию settlerList)

4) Житель (Settler) - кто будет проживать в квартире - можно использовать data class (без интерфейса, аналог POJO в Java) - по смыслу просто содержит свойства и нет доп. методов
    - свойство "name": имя

Под сущностью подразумевается важный смысловой объект, который участвует в задаче (интерфейс + классы-реализации, либо просто отдельный класс без интерфейса).

#### Условия

Доп. условия:
- Если пытаемся заселить более 2-х человек в одну квартиру - вывести ошибку "нельзя заселить более 2-х жителей в квартиру *number* " и не заселять жителя
- Адреса домов могут быть любыми, т.к. это не влияет на условия задачи
- Жителей желательно заселять в квартиры неравномерно (где-то по одному, где-то по двое, где-то пусто), чтобы проверить выполнение всех условий задачи

#### Запуск

Создаем в main:
- 1 город
- 5 домов (в каждом доме по 2 квартиры), адреса домов могут быть любыми
- 10 квартир (номера квартир присваиваем от 1 до 10 по возрастанию), в одну квартиру можно заселить не более 2-х человек
- 15 жителей (имена - любые), которых нужно будет неравномерно расселить по квартирам (в какие конкретные дома и квартиры - на ваше усмотрение) - итого 5 квартир (домов)

Вывести информацию обо всех квартирах (ниже пример) - перепись населения

Если какая-либо квартира пустует (нет ни одного жителя) - вывести об этом информацию

Пример вывода в консоль после выполнения программы:
```
Город: Москва
Дом: ул. Иванова, д.5
- Квартира: 1
-- Житель settler1
-- Житель settler2
- Квартира: 2
-- Житель settler3
-- Житель settler4

Дом: ул. Петрова, д.28
- Квартира: 3
-- Житель settler6
- Квартира: 4
-- Житель settler7
-- Житель settler8

Дом: ул. Павлова, д.17
- Квартира: 5
-- Житель settler9
-- Житель settler10
- Квартира: 6
-- Житель settler11

Дом: ул. Лапочкина, д.2
- Квартира: 7
-- Житель settler13
-- Житель settler14
- Квартира: 8
-- Житель settler15
-- Житель settler16

Дом: ул. Королева, д.153
- Квартира: 9
-- Житель settler17
-- Житель settler18
- Квартира: 10
-- Никто не живет
```



 */


fun main() {

        // создаем город
        val city = City("Москва")

        // дома для города
        val house1 = House("ул. Иванова, д.5")
        val house2 = House("ул. Петрова, д.28")
        val house3 = House("ул. Павлова, д.17")
        val house4 = House("ул. Лапочкина, д.2")
        val house5 = House("ул. Королева, д.153")

        // создаем квартиры для домов
        val flat1 = Flat(1)
        val flat2 = Flat(2)
        val flat3 = Flat(3)
        val flat4 = Flat(4)
        val flat5 = Flat(5)
        val flat6 = Flat(6)
        val flat7 = Flat(7)
        val flat8 = Flat(8)
        val flat9 = Flat(9)
        val flat10 = Flat(10)


        // создаем жителей
        val settler1 = Settler("settler1")
        val settler2 = Settler("settler2")
        val settler3 = Settler("settler3")
        val settler4 = Settler("settler4")
        val settler5 = Settler("settler5")
        val settler6 = Settler("settler6")
        val settler7 = Settler("settler7")
        val settler8 = Settler("settler8")
        val settler9 = Settler("settler9")
        val settler10 = Settler("settler10")
        val settler11 = Settler("settler11")
        val settler12 = Settler("settler12")
        val settler13 = Settler("settler13")
        val settler14 = Settler("settler14")
        val settler15 = Settler("settler15")
        val settler16 = Settler("settler16")
        val settler17 = Settler("settler17")
        val settler18 = Settler("settler18")
        val settler19 = Settler("settler19")
        val settler20 = Settler("settler20")



        // добавляем дома в город
        city.addHouse(house1)
        city.addHouse(house2)
        city.addHouse(house3)
        city.addHouse(house4)
        city.addHouse(house5)


        // добавляем квартиры в дома
        house1.addFlat(flat1)
        house1.addFlat(flat2)
        house2.addFlat(flat3)
        house2.addFlat(flat4)
        house3.addFlat(flat5)
        house3.addFlat(flat6)
        house4.addFlat(flat7)
        house4.addFlat(flat8)
        house5.addFlat(flat9)
        house5.addFlat(flat10)

        // добавляем жителей в квартиры
        flat1.addSettler(settler1)
        flat1.addSettler(settler2)
        flat2.addSettler(settler3)
        flat2.addSettler(settler4)
        flat2.addSettler(settler5) // пытаемся заселить в одну квартиру более 2-х человек - в консоли напишется ошибка
        flat3.addSettler(settler6)
        flat4.addSettler(settler7)
        flat4.addSettler(settler8)
        flat5.addSettler(settler9)
        flat5.addSettler(settler10)
        flat6.addSettler(settler11)
        //        flat6.addSettler(settler12); не заселяем
        flat7.addSettler(settler13)
        flat7.addSettler(settler14)
        flat8.addSettler(settler15)
        flat8.addSettler(settler16)
        flat9.addSettler(settler17)
        flat9.addSettler(settler18)

//        flat10.addSettler(settler19);  не заселяем
//        flat10.addSettler(settler20);   не заселяем



        city.showSettledList() // показать заселенных жителей

    }
