package ss7_Thuc_Hanh.Bai1;

import ss7_Thuc_Hanh.Bai1.animal.Animal;
import ss7_Thuc_Hanh.Bai1.animal.Chicken;
import ss7_Thuc_Hanh.Bai1.animal.Tiger;
import ss7_Thuc_Hanh.Bai1.edible.Edible;
import ss7_Thuc_Hanh.Bai1.fruit.Apple;
import ss7_Thuc_Hanh.Bai1.fruit.Fruit;
import ss7_Thuc_Hanh.Bai1.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }

        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Orange();
        fruit[1] = new Apple();
        for (Fruit fruit1 : fruit){
            System.out.println(fruit1.howToEat());
        }
    }
}
