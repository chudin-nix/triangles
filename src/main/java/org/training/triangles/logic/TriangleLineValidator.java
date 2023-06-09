package org.training.triangles.logic;

import java.util.regex.Pattern;

public class TriangleLineValidator {

    private static final String TRIANGLE_LINE_REGEX = "\\d+(\\.\\d+)?(\\s+\\d+(\\.\\d+)?){5}$";

    public boolean isValidLine (String line) {
        return Pattern.matches(TRIANGLE_LINE_REGEX, line);
    }
}
