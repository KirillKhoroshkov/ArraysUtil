package main

object HardSort {

    fun <T : Comparable<T>> heapSort(array: Array<T>) {//Пирамидальная(кучей)
        for (index in array.size / 2 - 1 downTo 0) {
            heapify(array, index, array.size)
        }
        for (index in array.lastIndex downTo 1) {
            val temporary = array[index]
            array[index] = array[0]
            array[0] = temporary
            heapify(array, 0, index)
        }
    }

    private fun <T : Comparable<T>> heapify(array: Array<T>, start: Int, length: Int) {
        val left = 2 * start + 1
        val right = left + 1
        var indexOfMax = start
        if (left < length && array[left] > array[indexOfMax]) {
            indexOfMax = left
        }
        if (right < length && array[right] > array[indexOfMax]) {
            indexOfMax = right
        }
        if (indexOfMax != start) {
            val temporary = array[indexOfMax]
            array[indexOfMax] = array[start]
            array[start] = temporary
            heapify(array, indexOfMax, length)
        }
    }

    fun <T : Comparable<T>> quickSort(array: Array<T>){//Хоара
        quickSort(array, 0, array.lastIndex)
    }

    private fun <T : Comparable<T>> quickSort(array: Array<T>, min: Int, max: Int) {
        var left = min
        var right = max
        val key = array[(min + max) / 2]
        while (left <= right) {
            while (array[left] < key) {
                left++
            }
            while (array[right] > key) {
                right--
            }
            if (left <= right) {
                val temporary = array[left]
                array[left] = array[right]
                array[right] = temporary
                right--
                left++
            }
        }
        if (min < right) {
            quickSort(array, min, right)
            quickSort(array, right + 1, max)
        }
    }

    fun <T : Comparable<T>> mergeSort(array: Array<T>) {
        mergeSort(array, 0, array.size)
    }

    private fun <T : Comparable<T>> mergeSort(array: Array<T>, begin: Int, end: Int) {
        if (end - begin > 1){
            val middle = (end + begin) / 2
            mergeSort(array, begin, middle)
            mergeSort(array, middle, end)
            merge(array, begin, middle, end)
        }
    }

    private fun <T : Comparable<T>> merge(array: Array<T>, begin: Int, middle: Int, end: Int) {
        val left = array.copyOfRange(begin, middle)
        val right = array.copyOfRange(middle, end)
        var leftIndex = 0
        var rightIndex = 0
        for (index in begin..end - 1){
            if (leftIndex < left.size && (rightIndex == right.size || left[leftIndex] <= right[rightIndex])){
                array[index] = left[leftIndex++]
            }
            else{
                array[index] = right[rightIndex++]
            }
        }
    }
}