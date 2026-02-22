public class OOPSBanner {
    public static void main(String[] args) {
        // UC3: Optimized banner using String.join()
        String gap = "   ";
        String[] r1 = {" **** ", " **** ", " *****", "  ****"};
        String[] r2 = {"* *", "* *", "* *", " * "};
        String[] r3 = {"* *", "* *", "***** ", "  *** "};
        String[] r4 = {"* *", "* *", "* ", "     *"};
        String[] r5 = {" **** ", " **** ", "* ", " **** "};

        System.out.println(String.join(gap, r1));
        System.out.println(String.join(gap, r2));
        System.out.println(String.join(gap, r3));
        System.out.println(String.join(gap, r4));
        System.out.println(String.join(gap, r5));
    }
}
