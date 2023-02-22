package ru.markush.behavioral.chainOfResponsibility;

public class ChainRun {
    public static void main(String[] args) {
        Chain chain = new Chain();

        chain.add(
                object -> {
                    System.out.println(object);
                    return "123";
                },
                object -> {
                    String str = (String) object;
                    System.out.println(str);
                    return str.length();
                },
                object -> {
                    int len = (int) object;
                    len++;
                    System.out.println(len);
                    return len;
                }
        );

        chain.process("Hello world");
    }
}
