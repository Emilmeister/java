package ru.emil.dinis;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by dinis on 25.07.17.
 */
public class Input {
    private Scanner scan = new Scanner(System.in);

    public Input() {

    }

    public int ask(String s) {
        System.out.println(s);
        int numb = Integer.parseInt(scan.nextLine());
        return numb;
    }

    public Set<Integer> genSet() {
        Set<Integer> result = new LinkedHashSet<>();
        while (result.size() < 3) {
            result.add(this.ask("Enter numbers!!"));
        }
        return result;
    }
}
