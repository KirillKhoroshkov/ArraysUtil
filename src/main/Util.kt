package main

object Util {
    fun <T> toString(array: Array<T>): String {
        if (array.isEmpty()) {
            return String()
        }
        val sb = StringBuilder()
        for (element in array.dropLast(1)) {
            sb.append(element.toString())
            sb.append(", ")
        }
        sb.append(array.last())
        return sb.toString()
    }
}