package com.mgdsaalgos.string;

public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello"; // Refers to the same object in String Pool

        String str3 = new String("Hello"); // Creates a new object in heap memory

        String s1 = "Java";
        s1 = s1 + " Programming"; // New object is created, old object is discarded
        System.out.println(s1);

        String st1 = "Hello";
        String st2 = " World";
        String st3 = st1 + st2;
        System.out.println(st3);

        System.out.println(st1.length());

        char ch = st1.charAt(1);
        System.out.println(ch);

        String sub = st1.substring(2, 4);
        System.out.println(sub);

        String ss1 = "Hello";
        String ss2 = "Hello";
        String ss3 = new String("Hello");
        System.out.println(ss1 == ss2); // true (Same reference in String Pool)
        System.out.println(ss1 == ss3); // false (Different objects in Heap)
        System.out.println(ss1.equals(ss3)); // true (Content is same)

        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println(numStr);

        String sentence = "Java,Python,C++";
        String[] words = sentence.split(",");
        for (String word : words) {
            System.out.println(word);
        }

        String str = "Java is good";
        String newStr = str.replace("good", "awesome");
        System.out.println(newStr);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb.toString());

        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb1.append(" ").append(i);
        }
        String result = sb1.toString();
        System.out.println(result);


    }
}
