package mt.chain;


import mt.composite.Component;
import mt.composite.TextComposite;
import mt.composite.TextLeaf;
import mt.exception.UnknownSequenceException;

import java.util.List;

import static mt.composite.ComponentType.*;
import static mt.constant.Constant.NUMBER_PATTERN;
import static mt.constant.Constant.VARIABLE_NAME_PATTERN;
import static mt.constant.ReservedIdentifiers.getMathOperators;
import static mt.constant.ReservedIdentifiers.getReservedWords;

public class SentenceBreaker extends BasicBreaker {
    private List<String> reservedWords = getReservedWords();
    private List<String> mathOperators = getMathOperators();

    public Component breakText(String sentence) throws UnknownSequenceException {
        Component textComposite = new TextComposite(SENTENCE);
        for (String part : sentence.split(" ")) {
            part = part.trim();
            if (!part.isEmpty()) {
                if (NUMBER_PATTERN.matcher(part).find()) {
                    textComposite.add(new TextLeaf(part, NUMBER));
                } else if (reservedWords.contains(part)) {
                    textComposite.add(new TextLeaf(part, RESERVED_WORD));
                } else if (mathOperators.contains(part)) {
                    textComposite.add(new TextLeaf(part, MATH_OPERATOR));
                } else if (VARIABLE_NAME_PATTERN.matcher(part).find()) {
                    textComposite.add(new TextLeaf(part, WORD));
                } else {
                    throw new UnknownSequenceException("Unknown character sequence: '" + part + "'");
                }
            }
        }
        return textComposite;
    }
}
