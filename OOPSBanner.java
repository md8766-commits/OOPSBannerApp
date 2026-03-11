import java.util.HashMap;
import java.util.Map;

public class OOPSBanner {

    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
        patternMap.put('O', new String[]{" **** ", "* *", "* *", "* *", " **** "});
        patternMap.put('P', new String[]{"***** ", "* *", "***** ", "* ", "* "});
        patternMap.put('S', new String[]{" **** ", "* ", " **** ", "     *", " **** "});
    }

    public static void main(String[] args) {
        renderBanner("OOPS");
    }

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
