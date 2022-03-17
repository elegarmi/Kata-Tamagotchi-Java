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

    @Test
    public void test_tamagotchi_hunger()
    {
        // Given
        Tamagotchi tamagotchi = new Tamagotchi();
        int expected = tamagotchi.getHunger();

        // When
        int actual = 4;

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void test_tamagotchi_energy()
    {
        // Given
        Tamagotchi tamagotchi = new Tamagotchi();
        int expected = tamagotchi.getEnergy();

        // When
        int actual = 4;

        // Then
        assertEquals(expected, actual);
    }

}
