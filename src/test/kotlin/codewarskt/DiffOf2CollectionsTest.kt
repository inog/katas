package codewarskt

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class DiffOf2CollectionsTest {

    @Test
    fun testDiff(){
        val cut: DiffOf2Collections = DiffOf2Collections()
        val result = cut.diff(emptyList(), emptyList())
        assertEquals(0, result.size, "should be 0")
        assertTrue(result.isEmpty(),"should return empty for the empty content")

        assertEquals(listOf<Character>(), cut.diff(listOf<Char>('a', 'b'), listOf<Char>('a', 'b')), "should return empty for the same content")
        assertEquals(listOf('a', 'b'), cut.diff(listOf('a', 'b'), emptyList()), "should return A if B is empty")
        assertEquals(listOf('c', 'd'), cut.diff(emptyList(), listOf('c', 'd')), "should return B if A is empty")
        assertEquals(listOf('z'), cut.diff(listOf('a', 'b', 'z'), listOf('a', 'b')), "should return the last character")
        assertEquals(listOf('d', 'e', 'j', 'z'), cut.diff(listOf('a', 'b', 'z', 'd', 'e', 'd'), listOf('a', 'b', 'j', 'j')), "should return the sorted characters")


    }
}