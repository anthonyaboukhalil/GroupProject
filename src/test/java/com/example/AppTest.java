package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testevenAvg() {
        assertEquals(12, App.evenAvg(50,600));
    }
}
