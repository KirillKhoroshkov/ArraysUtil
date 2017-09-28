package main

class HardSort {

    companion object {

        @JvmStatic fun <T: Comparable<T>>heapSort(array: Array<T>) {//Пирамидальная(кучей)
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

        @JvmStatic private fun <T: Comparable<T>>heapify(array: Array<T>, start: Int, length: Int){
            val left = 2 * start + 1
            val right = left + 1
            var indexOfMax = start
            if (left < length && array[left] > array[indexOfMax]){
                indexOfMax = left
            }
            if (right < length && array[right] > array[indexOfMax]){
                indexOfMax = right
            }
            if (indexOfMax != start){
                val temporary = array[indexOfMax]
                array[indexOfMax] = array[start]
                array[start] = temporary
                heapify(array, indexOfMax, length)
            }
        }
    }
}