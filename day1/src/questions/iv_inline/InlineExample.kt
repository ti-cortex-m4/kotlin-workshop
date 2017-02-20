package questions.iv_inline

import java.util.ArrayList

fun main(args: Array<String>) {
    val list = listOf(2, -1, 1, 0)

    // Write the Kotlin code equivalent to the generated bytecode.
    val result = list.filter { it > 0 }

    /*
    */
}

inline fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T> {
    val destination = ArrayList<T>()
    for (element in this) {
        if (predicate(element)) destination.add(element)
    }
    return destination
}