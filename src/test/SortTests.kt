package test

import main.EasySort
import main.Util
import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class SortTests {

    @Test fun toStringTest(){
        val array = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        assertEquals(Util.toString(array), "0, 1, 2, 3, 4, 5, 6, 7, 8, 9")
    }

    @Test fun bubbleSortTest(){
        val testArray = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        val array = arrayOf(9, 3, 6, 1, 4, 5, 2, 7, 8, 0)
        EasySort.bubbleSort(array)
        println(Util.toString(array))
        assertEquals(array, testArray)
    }

    @Test fun insertSortTest(){
        val testArray = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        val array = arrayOf(9, 3, 6, 1, 4, 5, 2, 7, 8, 0)
        EasySort.insertionSort(array)
        println(Util.toString(array))
        assertEquals(array, testArray)
    }

    @Test fun countingSortTest(){
        val testArray = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        val array = arrayOf(9, 3, 6, 1, 4, 5, 2, 7, 8, 0)
        EasySort.countingSort(array)
        println(Util.toString(array))
        assertEquals(array, testArray)
    }
}