package practice.city.objects

import practice.city.interfaces.DEFAULT_CAPACITY
import practice.city.interfaces.IFlat
import java.util.*

// квартира
class Flat(override var number: Int) : IFlat {

    // override нужен для того, чтобы указать, что мы реализовываем переменную из интерфейса (иначе компилятор будет ругаться, что не все реализовали)
    override var settlerList = ArrayList<Settler>() // список жителей квартиры (сразу создаем пустую коллекцию)

    // добавление жителя в квартиру
    override fun addSettler(settler: Settler) {
        if (settlerList.size < DEFAULT_CAPACITY) { // если еще есть свободное место в квартире
            settlerList.add(settler)
        } else {
            println("Нельзя заселить более 2-х жителей в квартиру $number")
        }
    }



}
