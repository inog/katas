package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class JadenCasingStringsTest {


        JadenCasingStrings jadenCase = new JadenCasingStrings();

        @Test
        public void test() {
            assertEquals( "Most Trees Are Blue", jadenCase.toJadenCase("most trees are blue"),"toJadenCase doesn't return a valide JadenCase String! try again please :)");
        }

        @Test
        public void testNullArg() {
            assertNull(jadenCase.toJadenCase(null),"Must return null when the arg is null" );
        }

        @Test
        public void testEmptyArg() {
            assertNull(jadenCase.toJadenCase(""),"Must return null when the arg is empty string");
        }



}