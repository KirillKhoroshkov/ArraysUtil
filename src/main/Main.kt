package main
class Main {

    companion object {

        @JvmStatic fun Sort(array: Array<Int>) {

        }

        @JvmStatic fun toString (array: Array<Int>): String{
            val sb = StringBuilder()
            for (element in array.dropLast(1)){
                sb.append(element.toString())
                sb.append(", ")
            }
            sb.append(array.last())
            return sb.toString()
        }
    }
}