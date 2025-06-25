package InterviewPrograms;

public class ReplacewithNum {

    public static String replaceLetterToNum(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'o') {
                sb.append('3');
            } else if (ch == 'r') {
                sb.append('2');
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "tomorrow";
        String result = replaceLetterToNum(str);
        System.out.println("Replaced String: " + result); // Output: t3m3223w
    }
}
