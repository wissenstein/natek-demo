/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wissenstein.natek.demo;

/**
 *
 * @author Oleksij
 */
public class Application {

    private static final char SPACE = ' ';

    public static void main(String[] args) {

    }

    public String inverse(String sentence) {
        final StringBuilder sentenceBuilder = new StringBuilder();
        final int sentenceLength = sentence.length();

        int i = 0;
        char currentChar;
        while (i < sentenceLength) {
            final StringBuilder wordBuilder = new StringBuilder();

            while ((i < sentenceLength)
                    && (currentChar = sentence.charAt(i)) != SPACE) {
                wordBuilder.append(currentChar);

                i++;
            }

            sentenceBuilder
                    .append(inverseWord(wordBuilder.toString()));

            while ((i < sentenceLength)
                    && ((sentence.charAt(i)) == SPACE)) {
                sentenceBuilder.append(SPACE);

                i++;
            }
        }

        return sentenceBuilder.toString();
    }

    private String inverseWord(String word) {
        StringBuilder inversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            inversed.append(word.charAt(i));
        }
        return inversed.toString();
    }
}
