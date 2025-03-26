class HairRunner {
    public static void main(String[] args) {
        Hair personHair = new Hair();

        System.out.println("Hair Color: " + personHair.color);
        System.out.println("Hair Length: " + personHair.length);
        System.out.println("Is Hair Curly? " + personHair.isCurly);
        System.out.println("Hair Texture: " + personHair.texture);

        personHair.color = "Brown";
        personHair.length = 12;
        personHair.isCurly = false;
        personHair.texture = "Silky";

        System.out.println("Updated Hair Color: " + personHair.color);
        System.out.println("Updated Hair Length: " + personHair.length);
        System.out.println("Updated Is Hair Curly? " + personHair.isCurly);
        System.out.println("Updated Hair Texture: " + personHair.texture);
    }
}

