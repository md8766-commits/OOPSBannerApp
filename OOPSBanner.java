import java.util.HashMap;
import java.util.Map;

public class OOPSBanner {

    // Centralized Pattern Management using Map
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
        patternMap.put('O', new String[]{" **** ", "* *", "* *", "* *", " **** "});
        patternMap.put('P', new String[]{"***** ", "* *", "***** ", "* ", "* "});
        patternMap.put('S', new String[]{" **** ", "* ", " **** ", "     *", " **** "});
    }

    public static void main(String[] args) {
        renderBanner("OOPS");
    }

    /**
     * UC8: Final Rendering Function
     * Uses patternMap for O(1) retrieval and nested loops for assembly.
     */
    public static void renderBanner(String word) {
        String gap = "   ";
        int bannerHeight = 5;

        for (int row = 0; row < bannerHeight; row++) {
            StringBuilder lineBuilder = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                String[] pattern = patternMap.get(c);
                
                if (pattern != null) {
                    lineBuilder.append(pattern[row]);
                    if (i < word.length() - 1) {
                        lineBuilder.append(gap);
                    }
                }
            }
            System.out.println(lineBuilder.toString());
        }
    }
}
