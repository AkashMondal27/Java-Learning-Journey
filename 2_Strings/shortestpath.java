public class shortestpath {

    public static float result(String path) {
        // initial coordinates (start point)
        int X = 0;
        int Y = 0;

        // traverse each character in the path
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);

            if (direction == 'N') {       // north
                Y++;
            } else if (direction == 'S') { // south
                Y--;
            } else if (direction == 'W') { // west
                X--;
            } else if (direction == 'E') { // east
                X++;
            }
        }

        // formula for shortest path distance = √(x² + y²)
        float distance = (float) Math.sqrt((X * X) + (Y * Y));
        return distance;
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(result(path));  // print the result
    }
}
