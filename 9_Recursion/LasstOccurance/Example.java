
public class Example {

    static int lastOccurrence(int[] arr, int key, int i) {
        if (i < 0) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return lastOccurrence(arr, key, i - 1);
    }

    public static void main(String[] args) {
        int[] arr = {8,3,6,9,5,10,2,5,3};
        int key = 5;

        System.out.println(
            "Last occurrence: " +
            lastOccurrence(arr, key, arr.length - 1)
        );
    }
}
