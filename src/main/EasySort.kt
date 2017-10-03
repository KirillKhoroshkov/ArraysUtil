package main
object EasySort {

    fun <T : Comparable<T>> bubbleSort(array: Array<T>) {//Пузырек с флагом
        var flag: Boolean
        var temporary: T
        var lastIndex = array.size - 2
        do {
            flag = false
            for (j in 0..lastIndex) {
                if (array[j] > array[j + 1]) {
                    flag = true
                    temporary = array[j]
                    array[j] = array[j + 1]
                    array[j + 1] = temporary
                }
            }
            lastIndex--
        } while (flag)
    }

    fun <T : Comparable<T>> insertionSort(array: Array<T>) {//Вставками
        var temporary: T
        for (sortedIndex in 1..array.lastIndex) {
            temporary = array[sortedIndex]
            var index = sortedIndex
            while (index != 0 && temporary < array[index - 1]) {
                array[index] = array[index - 1]
                index--
            }
            array[index] = temporary
        }
    }

    fun countingSort(array: Array<Int>) {//Подсчетом
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