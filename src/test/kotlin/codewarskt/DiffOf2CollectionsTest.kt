package codewarskt

import codewars.diffof2colections.kotlin.DiffOf2Collections
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class DiffOf2CollectionsTest {

    @Test
    fun testDiff(){
        val cut: DiffOf2Collections = DiffOf2Collections()
        val result = cut.diff()
        assertEquals(0, result.size, "should be 0")
        assertTrue(result.isEmpty())
    }

}