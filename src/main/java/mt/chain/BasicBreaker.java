package mt.chain;


import mt.composite.Component;
import mt.exception.UnknownSequenceException;

public abstract class BasicBreaker {
    BasicBreaker successor;

    void setSuccessor(BasicBreaker successor) {
        this.successor = successor;
    }

    public abstract Component breakText(String data) throws UnknownSequenceException;
}
