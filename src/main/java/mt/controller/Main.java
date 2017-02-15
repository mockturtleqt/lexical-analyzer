package mt.controller;


import mt.action.TextReader;
import mt.chain.BasicBreaker;
import mt.chain.TextBreaker;
import mt.composite.Component;
import mt.exception.UnknownSequenceException;

public class Main {
    private static final String FILE_NAME = "./TextData.txt";

    public static void main(String[] args) {
        TextReader textReader = new TextReader();
        String content = textReader.readTextFromFile(FILE_NAME);
        try {
            BasicBreaker breaker = new TextBreaker();
            Component text = breaker.breakText(content);
            System.out.println(text);
        } catch (UnknownSequenceException e) {
            System.out.println(e.getMessage());
        }

    }
}
