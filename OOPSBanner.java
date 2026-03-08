public class OOPSBanner {
    public static void main(String[] args) {
        String gap = "   ";

        // UC6: Use static methods to build the array dynamically
        String[] bannerLines = {
            String.join(gap, getO(1), getO(1), getP(1), getS(1)),
            String.join(gap, getO(2), getO(2), getP(2), getS(2)),
            String.join(gap, getO(3), getO(3), getP(3), getS(3)),
            String.join(gap, getO(4), getO(4), getP(4), getS(4)),
            String.join(gap, getO(5), getO(5), getP(5), getS(5))
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    // Static helper methods for each character pattern
    public static String getO(int row) {
        return switch (row) {
            case 1, 5 -> " **** ";
            default   -> "* *";
        };
    }

    public static String getP(int row) {
        return switch (row) {
            case 1, 3 -> "***** ";
            case 2    -> "* *";
            default   -> "* ";
        };
    }

    public static String getS(int row) {
        return switch (row) {
            case 1, 3, 5 -> " **** ";
            case 2       -> "* ";
            case 4       -> "     *";
            default      -> "      ";
        };
    }
}
