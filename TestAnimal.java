public class TestAnimal{
    public static void main(String[] args) {
        Animal cow = new Cow(4, "Moo", "Grass");
        Animal horse = new Horse(4, "Baa", "Grass", "White");
        Animal sheep = new Sheep(4, "Baa", "Grass", "Dolly");

        cow.makeSound();
        horse.makeSound();
        sheep.makeSound();

        System.out.println("Cow type: " + cow.getType());
        System.out.println("Horse type: " + horse.getType());
        System.out.println("Sheep type: " + sheep.getType());

        Animal clonedCow = cow.clone();
        Animal clonedColor = horse.clone();
        Animal clonedSheep = sheep.clone();

        System.out.println("Cloned Cow type: " + clonedCow.getType());
        System.out.println("Cloned Horse type: " + clonedColor.getType());
        System.out.println("Cloned Sheep type: " + clonedSheep.getType());
}
}
