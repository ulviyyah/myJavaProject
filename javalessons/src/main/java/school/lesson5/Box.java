package school.lesson5;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruits = new ArrayList<>();

    // Метод добавления фрукта в коробку
    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float totalWeight = 0.0f;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<T> otherBox) {
        if (this.fruits.isEmpty() || otherBox.fruits.isEmpty()) {
            return false;
        }
        return this.getWeight() == otherBox.getWeight();
    }

    public void swapFruits(Box<T> otherBox) {
        if (this.fruits.isEmpty() || otherBox.fruits.isEmpty()) {
            return;
        }

        if (this.fruits.get(0).getClass() != otherBox.fruits.get(0).getClass()) {
            return;
        }

        List<T> tempFruits = new ArrayList<>(this.fruits);
        this.fruits = new ArrayList<>(otherBox.fruits);
        otherBox.fruits = tempFruits;
    }
}


