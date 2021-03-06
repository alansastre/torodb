
package com.torodb.torod.db.postgresql.converters;

import com.torodb.torod.core.subdocument.values.PatternValue;
import java.util.regex.Pattern;

/**
 *
 */
public class PatternConverter {
    
    public static String toPosixPattern(PatternValue value) {
        int flags = value.getValue().flags();
        if ((flags & Pattern.UNICODE_CASE) != 0) {
            throw new IllegalArgumentException(
                    "Flag Unicode case is not supported on Postgresql"
            );
        }
        if ((flags & Pattern.UNICODE_CASE) != 0) {
            throw new IllegalArgumentException(
                    "Flag Unix lines is not supported on Postgresql"
            );
        }
        return value.toString();
    }

    public static PatternValue fromPosixPattern(String posixPattern) {
        return new PatternValue(Pattern.compile(posixPattern));
    }
}
