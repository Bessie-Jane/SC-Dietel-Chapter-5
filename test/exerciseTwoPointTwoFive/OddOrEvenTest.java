package exerciseTwoPointTwoFive;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddOrEvenTest {
    

    OddOrEven oddOrEven;

    @BeforeEach
    void setUp() {
        oddOrEven = new OddOrEven();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatNumberCanBeSetAndGotten() {
        oddOrEven.setNumber(10);
        assertEquals(10, oddOrEven.getNumber());
    }

    @Test
    void testThatNumberIsEitherOddOrEven(){
        assertFalse(oddOrEven.evenNumberChecker(7));
        assertTrue(oddOrEven.evenNumberChecker(8));
    }


}