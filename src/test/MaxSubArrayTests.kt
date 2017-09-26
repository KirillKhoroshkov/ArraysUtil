package test

import main.MaxSubArray
import main.Util
import org.testng.Assert
import org.testng.annotations.Test

class MaxSubArrayTests {

    @Test fun findMaxSubArrayTest0(){
        val testArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val array = MaxSubArray.findMaxSubArray(testArray)
        println(Util.toString(array))
        Assert.assertEquals(array, testArray)
    }

    @Test fun findMaxSubArrayTest1(){
        val testArray = arrayOf(3, 4, 5, 6, 7, 8, 9)
        val array = MaxSubArray.findMaxSubArray(arrayOf(0, 1, -2, 3, 4, 5, 6, 7, 8, 9))
        println(Util.toString(array))
        Assert.assertEquals(array, testArray)
    }

    @Test fun findMaxSubArrayTest2(){
        val testArray = arrayOf(1, 2, 3, 4, -5, 6, 7, 8, 9)
        val array = MaxSubArray.findMaxSubArray(arrayOf(0, 1, 2, 3, 4, -5, 6, 7, 8, 9))
        println(Util.toString(array))
        Assert.assertEquals(array, testArray)
    }


    @Test fun findMaxSubArrayTest3(){
        val testArray = arrayOf(1, 2, 3, 4)
        val array = MaxSubArray.findMaxSubArray(arrayOf(0, 1, 2, 3, 4, -5, -6, -7, -8, -9))
        println(Util.toString(array))
        Assert.assertEquals(array, testArray)
    }

    @Test fun findMaxSubArrayTest4(){
        val testArray = arrayOf<Long>(1, 2, 3, 4, -5, 6, 7)
        val array = MaxSubArray.findMaxSubArray(arrayOf<Long>(0, 1, 2, 3, 4, -5, 6, 7, -8, -9))
        println(Util.toString(array))
        Assert.assertEquals(array, testArray)
    }

    @Test fun findMaxSubArrayTest5(){
        val testArray = arrayOf<Long>(0)
        val array = MaxSubArray.findMaxSubArray(arrayOf<Long>(-1, -2, 0, 0, -4, -5))
        println(Util.toString(array))
        Assert.assertEquals(array, testArray)
    }

    @Test fun findMaxSubArrayTest6(){
        val testArray = arrayOf(1F, 2F, 3F, 4F)
        val array = MaxSubArray.findMaxSubArray(arrayOf(0F, 1F, 2F, 3F, 4F, -1F))
        println(Util.toString(array))
        Assert.assertEquals(array, testArray)
    }

    @Test fun findMaxSubArrayTest7(){
        val testArray = arrayOf(1.0, 2.0, 3.0, 4.0)
        val array = MaxSubArray.findMaxSubArray(arrayOf(0.0, 1.0, 2.0, 3.0, 4.0, 0.0))
        println(Util.toString(array))
        Assert.assertEquals(array, testArray)
    }

    @Test fun findMaxSubArrayTest8(){
        val testArray = arrayOf(-1.0)
        val array = MaxSubArray.findMaxSubArray(arrayOf(-10.0, -2.0, -1.0, -4.0))
        println(Util.toString(array))
        Assert.assertEquals(array, testArray)
    }

    @Test fun findMaxSubArrayTest9(){
        val testArray = arrayOf<Int>()
        val array = MaxSubArray.findMaxSubArray(arrayOf<Int>())
        println(Util.toString(array))
        Assert.assertEquals(array, testArray)
    }
}