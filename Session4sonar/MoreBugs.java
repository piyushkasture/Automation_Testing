package test;   

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

/**
 * Additional bug patterns that SonarQube can detect.
 */
public class MoreBugs {

    private static final Logger logger = LogManager.getLogger(MoreBugs.class);

    // ================== STRING ISSUES ==================

    // Efficient string concatenation in loop (fixed from inefficient)
    public String inefficientConcatenation(List<String> items) {
        StringBuilder result = new StringBuilder();
        for (String item : items) {
            result.append(item);
        }
        return result.toString();
    }

    // Proper string comparison (== replaced with equals, null‑safe)
    public boolean literalStringComparison(String input) {
        return "test".equals(input);
    }

    // ================== COLLECTION ISSUES ==================

    // Use isEmpty() instead of size() == 0
    public boolean checkEmpty(List<String> list) {
        return list.isEmpty();
    }

    // ================== METHOD ISSUES ==================

    // Use return values and logger instead of System.out
    public void ignoreReturnValue(String str) {
        str = str.trim();
        str = str.toLowerCase();
        if (logger.isInfoEnabled()) {
            logger.info("Normalized string: {}", str);
        }
    }

    // ================== LOOP ISSUES ==================

    // Fix off-by-one and invoke logger conditionally
    public void offByOne(int[] arr) {
        if (logger.isInfoEnabled()) {
            for (int i = 0; i < arr.length; i++) {
                logger.info("Array element [{}] = {}", i, arr[i]);
            }
        }
    }

    // Replace redundant comparison x == x with real condition
    public boolean redundantComparison(int x) {
        return x > 0;
    }

    // Extract assignment from condition and merge ifs
    public void assignmentInCondition(int x) {
        int y = x;
        if (y > 0 && logger.isInfoEnabled()) {
            logger.info("Positive value: {}", y);
        }
    }
}