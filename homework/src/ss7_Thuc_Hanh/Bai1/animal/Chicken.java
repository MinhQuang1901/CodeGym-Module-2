package ss7_Thuc_Hanh.Bai1.animal;

import ss7_Thuc_Hanh.Bai1.animal.Animal;
import ss7_Thuc_Hanh.Bai1.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cuc tac, cuc tac";
    }

    @Override
    public String howToEat() {
        return "Hello";
    }
}
