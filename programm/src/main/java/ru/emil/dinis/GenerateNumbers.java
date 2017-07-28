package ru.emil.dinis;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by dinis on 25.07.17.
 */
public class GenerateNumbers {

    private Random random = new Random();

    public GenerateNumbers() {

    }

    public Set<Integer> generate() {
        Set<Integer> result = new LinkedHashSet<>();

        while (result.size() < 3) {
            result.add(this.random.nextInt(9));
        }
        return result;
    }
}
