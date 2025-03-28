class Stanza {
    int numberOfLines;
    String rhymeScheme;
    String poemType;
    String language;
    boolean isWrittenInVerse;
    String poetName;
    int totalSyllables;
    boolean isFreeVerse;
    String theme;
    double length;  

    
    public Stanza() {
    }

    
    public Stanza(int numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

  
    public Stanza(int numberOfLines, String rhymeScheme) {
        this(numberOfLines);
        this.rhymeScheme = rhymeScheme;
    }

    
    public Stanza(int numberOfLines, String rhymeScheme, String poemType) {
        this(numberOfLines, rhymeScheme);
        this.poemType = poemType;
    }

    
    public Stanza(int numberOfLines, String rhymeScheme, String poemType, String language, boolean isWrittenInVerse) {
        this(numberOfLines, rhymeScheme, poemType);
        this.language = language;
        this.isWrittenInVerse = isWrittenInVerse;
    }

    
    public Stanza(int numberOfLines, String rhymeScheme, String poemType, String language, boolean isWrittenInVerse, String poetName, int totalSyllables) {
        this(numberOfLines, rhymeScheme, poemType, language, isWrittenInVerse);
        this.poetName = poetName;
        this.totalSyllables = totalSyllables;
    }

   
    public Stanza(int numberOfLines, String rhymeScheme, String poemType, String language, boolean isWrittenInVerse, String poetName, int totalSyllables, boolean isFreeVerse, String theme) {
        this(numberOfLines, rhymeScheme, poemType, language, isWrittenInVerse, poetName, totalSyllables);
        this.isFreeVerse = isFreeVerse;
        this.theme = theme;
    }

    
    public Stanza(int numberOfLines, String rhymeScheme, String poemType, String language, boolean isWrittenInVerse, String poetName, int totalSyllables, boolean isFreeVerse, String theme, double length) {
        this(numberOfLines, rhymeScheme, poemType, language, isWrittenInVerse, poetName, totalSyllables, isFreeVerse, theme);
        this.length = length;
    }

    
    public void info() {
        System.out.println("------Stanza Information-----");
        System.out.println("Number of Lines: " + this.numberOfLines);
        System.out.println("Rhyme Scheme: " + this.rhymeScheme);
        System.out.println("Poem Type: " + this.poemType);
        System.out.println("Language: " + this.language);
        System.out.println("Written in Verse: " + this.isWrittenInVerse);
        System.out.println("Poet's Name: " + this.poetName);
        System.out.println("Total Syllables: " + this.totalSyllables);
        System.out.println("Free Verse: " + this.isFreeVerse);
        System.out.println("Theme: " + this.theme);
        System.out.println("Length (cm): " + this.length);
    }
}
