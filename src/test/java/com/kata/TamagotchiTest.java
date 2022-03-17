package com.kata;

import static org.junit.Assert.*;

import org.junit.Test;

public class TamagotchiTest {
    
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test_tamagotchi_mood()
    {
        // Given
        Tamagotchi tamagotchi = new Tamagotchi();
        int expected = tamagotchi.getMood();

        // When
        int actual = 4;

        // Then
        assertEquals(expected, actual);
    }

}
