package org.kdklearns.part_1;

public class Main {

    public static void main(String[] args) {
        String str1 = "ja";
        String str2 = "va";
        String str3 = str1 + str2;
        String str4 = "java";

        System.out.println(str4 == str3);

        String str5 = "hello";
        str5 = "world";
        String str6 = "world";
        System.out.println(str5 == str6);

        String str7 = "❤️";
        String str8 = "🙏🏼";
        System.out.println(str7.length());
        System.out.println(str8.length());
    }
}
