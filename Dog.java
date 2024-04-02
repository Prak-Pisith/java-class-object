// Tester Class
class Dog {
    public static void main(String[] args) {
        DogClass jim = new DogClass();
        jim.size = 45;
        jim.breed = "Pitbull";
        jim.name = "Jimmy";

        jim.bark();
    }
}


class DogClass {
    int size;
    String breed;
    String name;

    public void bark() {
        System.out.println("Wuff, Wuff");
    }
}