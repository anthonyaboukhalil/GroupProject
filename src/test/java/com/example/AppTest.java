package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    void testOddAvg1() {
        int sum_odd = 0;
        int count_odd = 0;

        for (int i = 0; i < 50; i++) {
            if(i%2==1)
            {
                sum_odd += i;
                count_odd++;
            }

        }

        assertEquals(25.0, App.oddAvg(count_odd, sum_odd));
    }

    @Test
    void testOddAvg2() {
        int sum_odd = 0;
        int count_odd = 0;

        for (int i = 0; i < 100; i++) {
            if(i%2==1)
            {
                sum_odd += i;
                count_odd++;
            }

        }

        assertEquals(50.0, App.oddAvg(count_odd, sum_odd));
    }

}
