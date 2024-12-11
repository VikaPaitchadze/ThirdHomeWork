package org.example;

//მეორე ამოცანის * მესამე ნაბიჯი *

 class InterFaceClass implements Pirveli, Meore {

     public void replaceSymbolA(String text) {

         String result = text.replace("a", "z");
         System.out.println(result);
     }
     public void replaceSymbolB(String text) {

         String result = text.replace("b", "w");
         System.out.println(result);
     }
 }