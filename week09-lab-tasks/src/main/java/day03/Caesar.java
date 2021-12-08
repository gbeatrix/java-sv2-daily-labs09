package day03;

public class Caesar extends Encryption {
    private int offset;

    public Caesar(int offset) {
        this.offset = offset;
    }

    @Override
    public String encrypts(String input) {
        input = input.toUpperCase();
        char[] result = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            result[i] = encode(input.charAt(i));
        }
        return new String(result);
    }

    private char encode(char ch) {
        if ('A' <= ch && ch <= 'Z') {
            return (char) ('A' + (ch - 'A' + offset) % 26);
        } else {
            return ch;
        }
    }
}
