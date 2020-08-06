package labs;

public class CaesarCipher {
    private static String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        String[] inputStrings = {"   HeY ZeBrA", "Shruthik Musu Kula Reddy wAs Here"}; // Test String is initialized here
        for (int i = 0; i < inputStrings.length; i++) {
            encrypt(inputStrings[i]);
        }
    }

    public static void encrypt(String inputStr) {
        String returnString = new String();

        int index = 0;
        while (!Character.isLetter(inputStr.charAt(index))) {
            returnString += inputStr.charAt(index);
            index++;
        }

        int searchIndex = 0;
        while(index < inputStr.length()) {
            if(Character.isLetter(inputStr.charAt(index))) {
                searchIndex = (s.indexOf(inputStr.charAt(index)) < 26) ? 0 : 26;
                int outputIndex = (s.indexOf(inputStr.charAt(index)) + 13) % 26 + searchIndex;
                returnString += s.charAt(outputIndex);
            } else {
                returnString += inputStr.charAt(index);
            }
            index++;
        }

        System.out.println("Original: " + inputStr + ", Encrypted String: " + returnString);
    }
}
