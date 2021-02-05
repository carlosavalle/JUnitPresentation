package avalle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyTestClass {


   @Test
   // @Disabled("no implemented")
   @DisplayName("It is equal")
     void testSumEquals(){
        Calculator calc = new Calculator();
        assertEquals(3,calc.Sum(1,2));
    }

    @Test
    // @Disabled("no implemented")
    @DisplayName("It is not equal")
     void testSumNoEquals(){
        Calculator calc = new Calculator();
        assertNotEquals(4,calc.Sum(1,2));
    }

    @Test
    @DisplayName("It is a second test")
    void Test (){
        StringBuilder s1 = new StringBuilder("abc");
        StringBuilder s2 = new StringBuilder("abc");


        assertNotSame(s1.toString(), s2.toString());

        //assertEquals(s1.toString(), s2.toString());
    }
}
