public class largestStrings {
    public static void main(String[] args) {
        String fruits [] ={ " mango "," apple "," orange " };
        String largest = fruits[0];
        for (String fruit : fruits) {
            if (largest.compareTo(fruit) < 0) {
                largest = fruit;
            }
        }
        System.out.println(largest);
    }
}

//Here use the " lexicographic " . = >  a<b<c<d<e.......<x <y <z 