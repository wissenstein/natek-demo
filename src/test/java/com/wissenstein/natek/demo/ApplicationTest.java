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
        String sentence = "one  ";
        String expectedSentence = "eno  ";

        String inversedSentence = application.inverse(sentence);

        assertEquals(expectedSentence, inversedSentence);
    }

    @Test
    public void inverseSerevalWords() {
        String sentence = "one   two  three";
        String expectedSentence = "eno   owt  eerht";

        String inversedSentence = application.inverse(sentence);

        assertEquals(expectedSentence, inversedSentence);
    }
}
