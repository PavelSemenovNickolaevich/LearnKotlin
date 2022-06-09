package practice.city.objects

import practice.city.interfaces.ICity
import practice.city.interfaces.IHouse

import java.util.*

// город
class City(override var name: String) : ICity {

    // override нужен для того, чтобы указать, что мы реализовываем переменную из интерфейса (иначе компилятор будет ругаться, что не все реализовали)
    override var houseList = ArrayList<IHouse>() // список всех домов города (сразу создаем пустую коллекцию)

    override fun addHouse(house: IHouse) {
        houseList.add(house) // добавляем в общую коллекцию
    }


    override fun showSettledList() { // показать заселенных жителей (используем для этого вложенные циклы)

        println("Город: $name") // выводим название города


        // 1й цикл по домам
        for (house in houseList) {
            println("Дом ${house.address}") // выводим дом с адресом



            // 2й цикл по квартирам каждого дома
            for (flat in house.flatList) { // цикл по квартирам
                println("- Квартира: ${flat.number}") // выводим квартиру с номером

                if (flat.settlerList.isEmpty()) { // если в квартире нет жителей, isEmpty() - специальный готовый метод для проверки на пустоту коллекции
                    println("-- Никто не живет")
                }else {

                    // 3й цикл по жителям каждой квартиры
                    for (settler in flat.settlerList) { // цикл по жителям

                        println("Житель ${settler.name}") // печатаем жителя
                    }
                }


            }

            println() // для отступа, чтобы не слипались записи
        }
    }

}
