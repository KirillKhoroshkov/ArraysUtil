package test

import main.EasySort
import main.HardSort
import main.Util
import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class SortTests {

    private fun runTests(sort: (Array<Int>) -> Unit){
        val testArray = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        val array = arrayOf(9, 3, 6, 1, 4, 5, 2, 7, 8, 0)
        println(Util.toString(array))
        sort(array)
        println(Util.toString(array))
        assertEquals(array, testArray)
    }

    @Test fun bubbleSortTest() {
        println("bubbleSort")
        runTests({ array: Array<Int> -> run { EasySort.bubbleSort(array) }})
    }

    @Test fun insertionSortTest(){
        println("insertionSort")
        runTests({ array: Array<Int> -> run { EasySort.insertionSort(array) }})
    }

    @Test fun countingSortTest(){
        println("countingSort")
        runTests({ array: Array<Int> -> run { EasySort.countingSort(array) }})
    }

    @Test fun heapSortTest(){
        println("heapSort")
        runTests({ array: Array<Int> -> run { HardSort.heapSort(array) }})
    }

    @Test fun quickSortTest(){
        println("quickSort")
        runTests({ array: Array<Int> -> run { HardSort.quickSort(array) }})
    }

    @Test fun mergeSortTest(){
        println("mergeSort")
        runTests({ array: Array<Int> -> run { HardSort.mergeSort(array) }})
    }
}