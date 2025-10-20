public class SubArrays {

    public static void PrintSubarrays(int number[]) {
        int ts = 0; // total subarrays

        for (int i = 0; i < number.length; i++) { // start index
            for (int j = i; j < number.length; j++) { // end index
                for (int k = i; k <= j; k++) { // print from i to j
                    System.out.print(number[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays = " + ts);
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        PrintSubarrays(number);
    }
}
