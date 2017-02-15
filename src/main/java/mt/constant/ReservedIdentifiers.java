package mt.constant;

import java.util.ArrayList;
import java.util.List;

public class ReservedIdentifiers {
    public static List<String> getReservedWords() {
        List<String> reservedWords = new ArrayList<>();
        reservedWords.add("abstract");
        reservedWords.add("assert");
        reservedWords.add("boolean");
        reservedWords.add("break");
        reservedWords.add("byte");
        reservedWords.add("case");
        reservedWords.add("catch");
        reservedWords.add("char");
        reservedWords.add("class");
        reservedWords.add("const");
        reservedWords.add("continue");
        reservedWords.add("default");
        reservedWords.add("do");
        reservedWords.add("double");
        reservedWords.add("else");
        reservedWords.add("enum");
        reservedWords.add("extends");
        reservedWords.add("false");
        reservedWords.add("final");
        reservedWords.add("finally");
        reservedWords.add("float");
        reservedWords.add("for");
        reservedWords.add("goto");
        reservedWords.add("if");
        reservedWords.add("implements");
        reservedWords.add("import");
        reservedWords.add("instanceof");
        reservedWords.add("int");
        reservedWords.add("interface");
        reservedWords.add("long");
        reservedWords.add("native");
        reservedWords.add("new");
        reservedWords.add("null");
        reservedWords.add("package");
        reservedWords.add("private");
        reservedWords.add("protected");
        reservedWords.add("public");
        reservedWords.add("return");
        reservedWords.add("short");
        reservedWords.add("static");
        reservedWords.add("super");
        reservedWords.add("switch");
        reservedWords.add("synchronized");
        reservedWords.add("this");
        reservedWords.add("throw");
        reservedWords.add("throws");
        reservedWords.add("transient");
        reservedWords.add("true");
        reservedWords.add("try");
        reservedWords.add("void");
        reservedWords.add("volatile");
        reservedWords.add("while");
        return reservedWords;
    }

    public static List<String> getMathOperators() {
        List<String> mathOperators = new ArrayList<>();
        mathOperators.add(">");
        mathOperators.add("<");
        mathOperators.add("=");
        mathOperators.add("+");
        mathOperators.add("-");
        mathOperators.add("--");
        mathOperators.add("++");
        mathOperators.add(">=");
        mathOperators.add("<=");
        mathOperators.add("*");
        mathOperators.add("/");
        mathOperators.add("&&");
        mathOperators.add("||");
        mathOperators.add("==");
        mathOperators.add("!=");
        return mathOperators;
    }
}
