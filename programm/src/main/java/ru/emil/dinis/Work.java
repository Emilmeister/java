package ru.emil.dinis;

import java.util.Set;

/**
 * Created by dinis on 25.07.17.
 */
public class Work {

    private GenerateNumbers genNumb = new GenerateNumbers();

    private Input input = new Input();



    public Work() {

    }

    public void work() {
        Set<Integer> genSet = genNumb.generate();

        Set<Integer> inputSet = input.genSet();

        if (genSet.equals(inputSet)) {
            System.out.println("ok!!");
        } else {
            System.out.println("now!!");
        }

        System.out.println("System generation set:   " + genSet);
        System.out.println("Your set:   " + inputSet);
    }
}
