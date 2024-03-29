package i_introduction._10_Object_Expressions

import util.TODO
import util.doc10
import java.util.*
import java.util.function.Consumer


fun task10(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object : Comparator<Int> {
        override fun compare(o1: Int, o2: Int): Int {
            return o2.compareTo(o1)
        }
    })
    return arrayList
}