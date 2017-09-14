package main
class Main {

    companion object {

        @JvmStatic fun bubbleSort(array: Array<Int>) {//Пузырек с флагом
            var flag : Boolean
            var box : Int
            var lastIndex = array.size - 2
            do {
                flag = false
                for (j in 0..lastIndex){
                    if (array[j] > array[j + 1]){
                        flag = true
                        box = array[j]
                        array[j] = array[j + 1]
                        array[j + 1] = box
                    }
                }
                lastIndex--
            } while (flag)
        }

        @JvmStatic fun insertSort(array: Array<Int>) {
            var box : Int
            var sortedIndex = 0
            var currentIndex : Int
            
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