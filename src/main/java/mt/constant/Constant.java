package mt.constant;

import java.util.regex.Pattern;

public class Constant {
    public static final Pattern NUMBER_PATTERN = Pattern.compile("(\\d+)");
    public static final Pattern VARIABLE_NAME_PATTERN = Pattern.compile("(^[a-zA-Z_$][a-zA-Z_$0-9]*$)");
}
