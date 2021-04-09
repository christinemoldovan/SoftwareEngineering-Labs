package moldovan.christine.lab7.ex3;


public class EncryptDecrypt {

    private int shift = 1;

    public EncryptDecrypt() {
    }

    String encryptFile(String content) {
        String s = "";
        for (int i = 0; i < content.length(); i++) {
            char c = (char) (content.charAt(i) + shift);
            if (c > 'z')
                s += (char) (content.charAt(i) - (26 - shift));
            else
                s += (char) (content.charAt(i) + shift);
        }
        return s;
    }

    String decryptFile(String content) {
        String s = "";
        for (int i = 0; i < content.length(); i++) {
            char c = (char) (content.charAt(i) - shift);
            if (c > 'z')
                s += (char) (content.charAt(i) + (26 + shift));
            else
                s += (char) (content.charAt(i) - shift);
        }
        return s;
    }

}
