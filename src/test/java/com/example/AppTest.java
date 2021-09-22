package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testevenAvg() {
        assertEquals(24, App.evenAvg(25,600));
    }
}
