package test

import main.Main
import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class Tests {

    @Test fun toStringTest(){
        val array = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        assertEquals(Main.toString(array), "0, 1, 2, 3, 4, 5, 6, 7, 8, 9")
    }

}