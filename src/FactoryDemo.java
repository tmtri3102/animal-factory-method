public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal a1 = animalFactory.getAnimal("feline");
        System.out.println("Sound  : " + a1.makeSound());
        Animal a2 = animalFactory.getAnimal("canine");
        System.out.println("Sound  : " + a2.makeSound());;
    }
}
