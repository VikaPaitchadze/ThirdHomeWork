package org.example;

//  მესამე ამოცანა

public class Numbers {
    public static void main(String[] args) {
        // მოცემული მასივი
        int[] arr = {18, -3, 5, -7, 6, 89, 13, 0, -89};

        // ამ ცვლადს  გამოვიყენებთ ელემენტების გაცვლისთვის
        int Exchange;

        //რამდენჯერმე ვატარებ "გავლას" მასივზე
        for (int i = 0; i < arr.length - 1; i++) {
        //ვადარებთ მეზობელ ელემენტებს
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // თუ მარცხენა ელემენტი მეტია მარჯვენაზე, მათ ადგილებს ვცვლი
                if (arr[j] > arr[j + 1]) {
                    // გაცვლა
                    Exchange = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = Exchange;
                }
            }
        }

        // ვბეჭდავთ უკვე დალაგებულ მასივს

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}