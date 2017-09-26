package main
class EasySort {

    companion object {

        @JvmStatic fun <T: Comparable<T>>bubbleSort(array: Array<T>) {//Пузырек с флагом
            var flag: Boolean
            var box: T
            var lastIndex = array.size - 2
            do {
                flag = false
                for (j in 0..lastIndex) {
                    if (array[j] > array[j + 1]) {
                        flag = true
                        box = array[j]
                        array[j] = array[j + 1]
                        array[j + 1] = box
                    }
                }
                lastIndex--
            } while (flag)
        }

        @JvmStatic fun <T: Comparable<T>> insertionSort(array: Array<T>) {//Вставками
            var box: T
            for (sortedIndex in 1..array.lastIndex) {
                box = array[sortedIndex]
                var index = sortedIndex
                while (index != 0 && box < array[index - 1]) {
                    array[index] = array[index - 1]
                    index--
                }
                array[index] = box
            }
        }

        @JvmStatic fun countingSort(array: Array<Int>) {//Подсчетом
            val min = array.min()!!
            val countArray = Array(array.max()!! - min + 1, { 0 })
            for (element in array) {
                countArray[element - min]++
            }
            var i = 0
            for (index in 0..countArray.lastIndex) {
                while (countArray[index] > 0) {
                    array[i] = min + index
                    i++
                    countArray[index]--
                }
            }
        }
    }
}