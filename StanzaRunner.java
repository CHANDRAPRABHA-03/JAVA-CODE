class StanzaRunner {
    public static void main(String[] args) {
        
		
		Stanza stanza = new Stanza();
        Stanza stanza1 = new Stanza(4, "girl", "Sonnet", "English", true, "William Shakespeare", 40, false, "Love", 25.5);
        Stanza stanza2 = new Stanza(6, "dream", "Haiku", "Japanese", false, "Matsuo Basho", 30, true, "Nature", 20.0);
        Stanza stanza3 = new Stanza(8, "ocean", "Limerick", "English", true, "Edward Lear", 50, false, "Adventure", 15.5);
        Stanza stanza4 = new Stanza(4, "moon", "Sonnet", "English", false, "John Keats", 45, true, "Romance", 28.0);
        Stanza stanza5 = new Stanza(5, "bird", "Ballad", "English", true, "Samuel Taylor Coleridge", 60, true, "Freedom", 22.5);
        Stanza stanza6 = new Stanza(3, "sun", "Acrostic", "English", false, "Emily Dickinson", 35, true, "Nature", 18.0);
        Stanza stanza7 = new Stanza(7, "star", "Cinquain", "English", true, "Ezra Pound", 25, false, "Love", 24.0);
        Stanza stanza8 = new Stanza(4, "tree", "Couplet", "French", false, "Paul Verlaine", 40, true, "Nature", 30.0);
        Stanza stanza9 = new Stanza(6, "wind", "Rondeau", "French", true, "Louis MacNeice", 55, false, "Adventure", 19.0);
        Stanza stanza10 = new Stanza(5, "fire", "Free Verse", "English", false, "Walt Whitman", 70, true, "Emotion", 26.5);
        

        stanza.info();
        stanza1.info();
        stanza2.info();
        stanza3.info();
        stanza4.info();
        stanza5.info();
        stanza6.info();
        stanza7.info();
        stanza8.info();
        stanza9.info();
        stanza10.info();
        
    }
}

