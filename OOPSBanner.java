public class OOPSBanner {

    // UC7: Static Inner Class for Character Pattern Management
    static class CharacterPatternMap {
        private char character;
        private String[] patterns;

        public CharacterPatternMap(char character, String[] patterns) {
            this.character = character;
            this.patterns = patterns;
        }

        public String getRow(int row) {
            return (row >= 0 && row < patterns.length) ? patterns[row] : "";
        }
    }

    public static void main(String[] args) {
        String gap = "   ";

        // Creating instances for O, P, and S
        CharacterPatternMap charO = new CharacterPatternMap('O', new String[]{
            " **** ", "* *", "* *", "* *", " **** "
        });
        CharacterPatternMap charP = new CharacterPatternMap('P', new String[]{
            "***** ", "* *", "***** ", "* ", "* "
        });
        CharacterPatternMap charS = new CharacterPatternMap('S', new String[]{
            " **** ", "* ", " **** ", "     *", " **** "
        });

        // Building the banner using the objects
        for (int i = 0; i < 5; i++) {
            System.out.println(String.join(gap, 
                charO.getRow(i), 
                charO.getRow(i), 
                charP.getRow(i), 
                charS.getRow(i)
            ));
        }
    }
}
