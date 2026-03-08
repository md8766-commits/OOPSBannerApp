public class OOPSBanner {
    public static void main(String[] args) {
        // UC5: Inline Array Initialization with String.join() for conciseness
        String gap = "   ";

        String[] bannerLines = {
            String.join(gap, " **** ", " **** ", " *****", "  ****"),
            String.join(gap, "* *", "* *", "* *", " * "),
            String.join(gap, "* *", "* *", "***** ", "  *** "),
            String.join(gap, "* *", "* *", "* ", "     *"),
            String.join(gap, " **** ", " **** ", "* ", " **** ")
        };

        // Render using the enhanced for-loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
