public class CipherAlgorithm {
    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String encrypt(String text, int key) {

        return shift(text, key);
    }

    public static String decrypt(String text, int key) {
        return shift(text, -key);
    }

    private static String shift(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (char c : text.toUpperCase().toCharArray()) {
            int index = ALPHABET.indexOf(c);
            if (index != -1) {
                int shiftedIndex = (index + shift + ALPHABET.length()) % ALPHABET.length();
                result.append(ALPHABET.charAt(shiftedIndex));
            } else {
                result.append(c);  // Non-alphabetic characters are unchanged
            }
        }

        return result.toString();
    }
}
