package exerciseFivePointOneOne;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestIntegerTest {
    SmallestInteger smallestInteger;
    @BeforeEach
    void setUp() {
        smallestInteger = new SmallestInteger();
    }
    @AfterEach
    void tearDown() {
    }

    @Test
    void numbersCanBeSetAndGotten(){
        smallestInteger.setNumber(5);
        assertEquals(5, smallestInteger.getNumber());
    }


    @Test
    void smallestNumberCanBeGotten(){
        smallestInteger.findSmallestNumber(4, 8, 2,5, 9);
        assertEquals(2, smallestInteger.getSmallestNumber());
    }
}