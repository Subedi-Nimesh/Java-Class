package assignment.Day1;

public class Car {
    public static void main(String[] args) {
        ClassCar car1 = new ClassCar();
        ClassCar car2 = new ClassCar();
        ClassCar car3 = new ClassCar();


        car1.description("4", 11000, "Nissan", "Versa", 2017);
        car2.description("2", 20000, "Hyundai", "Tucson", 2020);
        car3.description("4", 28000, "Honda", "Civic", 2015);

        System.out.println("You paid $" + car1.price + " for a " + car1.year + " " + car1.make + " " + car1.model + " with " + car1.door + " doors");
        System.out.println("You paid $" + car2.price + " for a " + car2.year + " " + car2.make + " " + car2.model + " with " + car2.door + " doors");
        System.out.println("You paid $" + car3.price + " for a " + car3.year + " " + car3.make + " " + car3.model + " with " + car3.door + " doors");
    }
}
