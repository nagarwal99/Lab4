/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * A class that checks if one larger string is part of another smaller string.
 */
public class ReclamationProject {
/**
 * Returns the portion of a string that is the same as a part of another string.
 * @param first a string
 * @param second a string
 * @return any part of the strings that are similar
 */
    public static String doIt(final String first, final String second) {
        String smaller = first;
        String larger = second;
        if (smaller.length() > larger.length()) {
            String temp = smaller;
            smaller = larger;
            larger = temp;
            }
        String similar = "";

        for (int i = 0; i < smaller.length(); i++) {
            for (int j = smaller.length() - i; j > 0; j--) {
                for (int k = 0; k < larger.length() - j; k++) {
                    if (smaller.regionMatches(i, larger, k, j) && j > similar.length()) {
                        similar = smaller.substring(i, i + j);
                    }
                }
            }
        } return similar; }
}
