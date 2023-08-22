package com.workintech.stack.main;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));
        System.out.println("********************");
        System.out.println(checkForPalindromeFifo("abccba"));
        System.out.println(checkForPalindromeFifo("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindromeFifo("I did, did I?"));
        System.out.println(checkForPalindromeFifo("hello"));
        System.out.println(checkForPalindromeFifo("Don't nod"));
        System.out.println(decimalToBinary(13));
        System.out.println(decimalToBinary(6));

    }

    public static boolean checkForPalindrome(String text) {
        text = text.replaceAll("[.,?'!_\\- ]", "").toLowerCase(Locale.ENGLISH);
        String[] allLetters = text.split("");

        LinkedList<String> letters = new LinkedList<>();
        LinkedList lettersReverse = new LinkedList();

        for (String letter: allLetters){
            letters.add(letter);
            lettersReverse.push(letter);
        }

        return (letters.equals(lettersReverse)) ? true : false;

    }
    public static boolean checkForPalindromeFifo(String text) {
        text = text.replaceAll("[.,?'!_\\- ]", "").toLowerCase(Locale.ENGLISH);
        String[] allLetters = text.split("");

        LinkedList<String> queue = new LinkedList<>();
        LinkedList stack = new LinkedList();

        for (String letter: allLetters){
            queue.addLast(letter);
            stack.push(letter);
        }

        return (queue.equals(stack)) ? true : false;

    }
    public static int decimalToBinary(int number ) {
        LinkedList<Integer> digits = new LinkedList<>();

       while (number > 0){
           digits.push(number%2);
           number = number/2;
       }
       String dec = "";
       while (!digits.isEmpty()){
           dec += digits.removeFirst();
       }

        return Integer.parseInt(dec);

    }
}