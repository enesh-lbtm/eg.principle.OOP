package com.test.task;

public class Main {
    public static void main(String[] args) {
        String str = new String(" Friendship is one of the most beautiful things. " +
                "Friends inspire us, support us," +
                "help us to grow, make us feel valued and loved. " +
                "Friendship can be described as a flower that must be consistently watered and maintained in order to grow and grow well. " +
                "Though social networks has played important roles in providing the opportunity for friends to connect, " +
                "the best way to maintain cordial relationship with your friends is to send a cool message as you think of them. " +
                "On this page we present you a wide collection of nice friendship quotes and friendship messages that will help to express your feelings and show your friends how much you appreciate their friendship.");
        TextTools textTools = new TextTools();
        Text text = textTools.delimiterSentence(str);
        System.out.println(text);
    }
}
