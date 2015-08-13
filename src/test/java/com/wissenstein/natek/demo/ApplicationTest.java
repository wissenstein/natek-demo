/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wissenstein.natek.demo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Oleksij
 */
public class ApplicationTest {

    private Application application = new Application();

    @Test
    public void inverseOneWord() {
        String word = "three";
        String expectedWord = "eerht";

        String inversedWord = application.inverse(word);

        assertEquals(expectedWord, inversedWord);
    }

    @Test
    public void inverseWordWithSpaces() {
        String word = "one  ";
        String expectedWord = "eno  ";

        String inversedWord = application.inverse(word);

        assertEquals(expectedWord, inversedWord);
    }

    @Test
    public void inverseSerevalWords() {
        String word = "one   two  three";
        String expectedWord = "eno   owt  eerht";

        String inversedWord = application.inverse(word);

        assertEquals(expectedWord, inversedWord);
    }
}
