package chapter.two;

import chapter.two.ma.esta.Etudiant;

public class GenericDemo {
    public static void main(String[] args) {
        Pair<String, Integer> pairStringInteger = new Pair<>("Test", 1);
        Pair<Etudiant, char> pairEtudiantChar = new Pair<>(new Etudiant("John", "Doe", 23, 19.50), 'A');

        GenAnimalFille<Chien> chien = new GenAnimalFille<>();
    }
}

class Pair<U, V> {
    private U leftValue;
    private V rightValue;

    public Pair(U rightValue, V leftValue) {
        this.rightValue = rightValue;
        this.leftValue = leftValue;
    }

    public U getRightValue() {
        return this.rightValue;
    }

    public V getLeftValue() {
        return this.leftValue;
    }
}

class Animal {}

class Chat extends Animal {}

class Chien extends Animal {}

class GenAnimal<U extends Animal> {
    private U animal;
}

class GenAnimalFille<U extends Animal> extends GenAnimal<U> {}
