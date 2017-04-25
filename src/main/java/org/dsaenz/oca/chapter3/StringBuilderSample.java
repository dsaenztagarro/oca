package org.dsaenz.oca.chapter3;

import static java.lang.System.out;

class StringBuilderSample {
        public static void main(String[] args) {
                StringBuilder sb;
                CharSequence cs = "String";
                sb = new StringBuilder(); sb.append(cs);
                out.println(sb.length() + " " + sb.capacity()); // 6 16

                sb = new StringBuilder(0); sb.append(cs);
                out.println(sb.length() + " " + sb.capacity()); // 6 6
                sb.append("1234567890abcdef");
                out.println(sb.length() + " " + sb.capacity()); // 22 22

                sb = new StringBuilder("String");
                out.println(sb.length() + " " + sb.capacity()); // 6 22

                sb = new StringBuilder(cs);
                out.println(sb.length() + " " + sb.capacity()); // 6 22
                sb.append("1234");
                out.println(sb.length() + " " + sb.capacity()); // 10 22
                sb.append("1234567890abcdef");
                out.println(sb.length() + " " + sb.capacity()); // 10 46

                char[] seq = { 'S', 't', 'r', 'i', 'n', 'g' };
                sb = new StringBuilder(cs);
                out.println(sb.length() + " " + sb.capacity()); // 6 16
        }
}
