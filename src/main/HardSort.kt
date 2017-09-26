package main

class HardSort {

    companion object {

        @JvmStatic fun <T: Comparable<T>>heapSort(array: Array<T>) {//Пирамидальная(кучей)
            var box: T
            for (index in array.lastIndex downTo 1){
                buildHeap(array, index)
                box = array[index]
                array[index] = array[0]
                array[0] = box
            }
        }

        @JvmStatic private fun <T: Comparable<T>>buildHeap(array: Array<T>, lastIndex: Int){
            var box: T

        }
    }
}