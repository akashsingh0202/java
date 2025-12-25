public class if_elseif_else {
    public static void main(String[] args) {
        int x = 10, y = 20, z = 25;

        if (x > y && x > z) {
            System.out.println("x is greatest");
        } else if (y > x && y > z) {
            System.out.println("y is greatest");
        } else {
            System.out.println("z is greatest");
        }
    }
}

