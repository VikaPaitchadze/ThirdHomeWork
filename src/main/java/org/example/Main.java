package org.example;

// პირველი ამოცანის * მესამე ნაბიჯი *

public class Main {
    public static void main(String[] args) {
        ChildVowel counter = new ChildVowel();
        String text = "Java&Lela";
        int result = counter.countVowel(text);

        System.out.println(result);
    }
}
