package com.concepts.core.java.tech.example;

class Food {
    public String name = null;
    public Food() {

    }
    public Food(String name) {
        this.name = name;
    }
    public void servesFood() {
        System.out.println("I'm serving " + this.name);
    }
}

class Fruit extends Food {
    public Fruit(String name) {
        super.name = name;
    }
}

class FastFood extends Food {
    public FastFood(String name) {
        super.name = name;
    }
}

class FoodFactory extends Food {
    public Food getFood(String string) {
        if (string.equals("Fruit")) {
            return new Fruit("Fruit");
        } else {
            return new FastFood("FastFood");
        }
    }
}

class FoodFactoryExample {
    public static void main(String[] args) throws java.lang.Exception {
        FoodFactory myFoods = new FoodFactory();
        Food food1 = myFoods.getFood("FastFood");
        Food food2 = myFoods.getFood("Fruit");
        System.out.println("My name is: " + food1.getClass().getName());
        System.out.println("My name is: " + food2.getClass().getName());
        System.out.println("Our superclass is: " + food1.getClass().getSuperclass().getName());// modification
        food1.servesFood();
        food2.servesFood();
    }
}