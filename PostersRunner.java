class PostersRunner {
    public static void main(String[] args) {
        
		Posters poster = new Posters();
        Posters poster1 = new Posters("Art", "Van Gogh", 50, 70, "Canvas", true, "Wood", 199.99, 1889, "Impressionism");
        Posters poster2 = new Posters("Movie", "Star Wars", 60, 90, "Paper", false, "", 15.99, 1977, "Sci-Fi");
        Posters poster3 = new Posters("Music", "The Beatles", 40, 60, "Cardboard", true, "Plastic", 29.99, 1965, "Rock");
        Posters poster4 = new Posters("Abstract", "Pablo Picasso", 55, 80, "Canvas", true, "Wood", 249.99, 1937, "Cubism");
        Posters poster5 = new Posters("Photography", "Ansel Adams", 70, 100, "Photo Paper", false, "", 79.99, 1940, "Landscape");
        Posters poster6 = new Posters("Pop Art", "Andy Warhol", 50, 70, "Vinyl", true, "Wood", 149.99, 1962, "Pop Art");
        Posters poster7 = new Posters("Vintage", "Alphonse Mucha", 60, 90, "Silk", true, "Gold", 299.99, 1900, "Art Nouveau");
        Posters poster8 = new Posters("Movie", "The Godfather", 70, 100, "Paper", false, "", 19.99, 1972, "Drama");
        Posters poster9 = new Posters("Music", "Queen", 40, 60, "Plastic", true, "Aluminum", 39.99, 1975, "Rock");
        Posters poster10 = new Posters("Art", "Claude Monet", 55, 75, "Canvas", true, "Wood", 179.99, 1874, "Impressionism");

        poster.info();
        poster1.info();
        poster2.info();
        poster3.info();
        poster4.info();
        poster5.info();
        poster6.info();
        poster7.info();
        poster8.info();
        poster9.info();
        poster10.info();
    }
}
