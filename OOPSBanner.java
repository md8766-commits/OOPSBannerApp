public class OOPSBanner {
    public static void main(String[] args) {
        // UC4: Using an array and loop for modularity
        String gap = "   ";
        
        // Array population using String.join()
        String[] bannerLines = {
            String.join(gap, " **** ", " **** ", " *****", "  ****"),
            String.join(gap, "* *", "* *", "* *", " * "),
            String.join(gap, "* *", "* *", "***** ", "  *** "),
            String.join(gap, "* *", "* *", "* ", "     *"),
            String.join(gap, " **** ", " **** ", "* ", " **** ")
        };

        // Enhanced for-loop for cleaner output traversal
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
