package org.example;

// პირველი ამოცანის * მეორე ნაბიჯი *

  class ChildVowel extends  TheVowelCounter {
      public int countVowel(String text) {

          String vowels = "aeiouAEIOU";
          int count = 0;

          for (int i = 0; i < text.length(); i++) {
              char c = text.charAt(i);
              if (vowels.contains(String.valueOf(c))) {
                  count++;

              }
          }

          return count;
      }
  }
