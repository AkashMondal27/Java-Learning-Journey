
public class RemoveDublicate {

    public static void result(String str, int idx,
                              StringBuilder newStr, boolean map[]) {

        // Base case
        if (idx == str.length()) {
            System.out.println("New string: " + newStr);
            return;
        }

        // Current character
        char currentChar = str.charAt(idx);

        // If character already exists
        if (map[currentChar - 'a']) {
            result(str, idx + 1, newStr, map);
        } else {
            map[currentChar - 'a'] = true;
            result(str, idx + 1, newStr.append(currentChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnacollege";

        result(str, 0, new StringBuilder(), new boolean[26]);
    }
}
