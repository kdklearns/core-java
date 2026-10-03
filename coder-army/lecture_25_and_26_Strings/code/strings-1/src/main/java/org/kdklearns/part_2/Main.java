package org.kdklearns.part_2;

public class Main {

    private static void test(int[] arr) {

    }

    public static void main(String[] args) {
        // test({1, 2, 3}) not allowed
        test(new int[]{1, 2, 3});
        char[] letters = {'k', 'e', 's', 'h', 'a', 'v'};
        String name = new String(letters, 2, 3);

        byte[] nums = {97, 98, 99, 100};
        String str = new String(nums);

        System.out.println(name);
        System.out.println(str);

        // StringBuilder
        StringBuilder sb = new StringBuilder("java");
        sb.append(" is so cool!");
        System.out.println(sb);

        sb.replace(0, 2, "e");
        System.out.println(sb);

        sb.insert(4, "green ");
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder("yahoo");
        System.out.println(sb2.capacity());
    }
}
