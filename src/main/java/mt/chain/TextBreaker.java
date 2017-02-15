package mt.chain;


import mt.composite.Component;
import mt.composite.ComponentType;
import mt.composite.TextComposite;
import mt.composite.TextLeaf;
import mt.exception.UnknownSequenceException;

import static mt.composite.ComponentType.TEXT;

public class TextBreaker extends BasicBreaker {
    private static final String RESERVED_CHARACTERS = "(?<=[{};()])|(?=[{};()])";
    private static final String SEMICOLON = ";";
    private static final String LEFT_PARENTHESES = "(";
    private static final String RIGHT_PARENTHESES = ")";
    private static final String OPEN_CURLY_BRACKET = "{";
    private static final String CLOSED_CURLY_BRACKET = "}";

    public TextBreaker() {
        this.setSuccessor(new SentenceBreaker());
    }

    public Component breakText(String text) throws UnknownSequenceException {
        Component textComposite = new TextComposite(TEXT);
        for (String part : text.split(RESERVED_CHARACTERS)) {
            if (SEMICOLON.equals(part)) {
                textComposite.add(new TextLeaf(part, ComponentType.SEMICOLON));
            } else if (LEFT_PARENTHESES.equals(part)) {
                textComposite.add(new TextLeaf(part, ComponentType.LEFT_PARENTHESES));
            } else if (RIGHT_PARENTHESES.equals(part)) {
                textComposite.add(new TextLeaf(part, ComponentType.RIGHT_PARENTHESES));
            } else if (OPEN_CURLY_BRACKET.equals(part)) {
                textComposite.add(new TextLeaf(part, ComponentType.OPEN_CURLY_BRACKET));
            } else if (CLOSED_CURLY_BRACKET.equals(part)) {
                textComposite.add(new TextLeaf(part, ComponentType.CLOSED_CURLY_BRACKET));
            } else {
                textComposite.add(successor.breakText(part));
            }
        }
        return textComposite;
    }
}
