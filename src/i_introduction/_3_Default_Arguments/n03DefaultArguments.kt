package i_introduction._3_Default_Arguments

import util.TODO
import util.doc2

fun foo(name: String, toUpperCase: Boolean = false, number: Int = 42): String =  (if (toUpperCase) name.toUpperCase() else name) + number

fun task3(): String {
    return (foo("a" ) +
            foo("b", number = 1) +
            foo("c", toUpperCase = true) +
            foo(name = "d", number = 2, toUpperCase = true))
}