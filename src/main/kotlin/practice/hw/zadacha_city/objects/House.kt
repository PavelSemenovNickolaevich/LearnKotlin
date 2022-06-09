package practice.city.objects

import practice.city.interfaces.IFlat
import practice.city.interfaces.IHouse

import java.util.*

// дом
class House(override var address: String) : IHouse {

    // override нужен для того, чтобы указать, что мы реализовываем переменную из интерфейса (иначе компилятор будет ругаться, что не все реализовали)
    override var flatList = ArrayList<IFlat>() // список квартир в доме (обязательно сразу создаем пустую коллекцию)

    // добавляем квартиру в дом
    override fun addFlat(flat: IFlat) {
        flatList.add(flat)
    }

}
