package ru.emil.cscard;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by dinis on 23.07.17.
 */
public class Calculate {
    public int rdm() {
        int a = (int) Math.ceil(Math.random() * 9);
         return a;
    }

    public Set<Integer> generateSet() {
        Set<Integer> result = new LinkedHashSet();

        while (result.size() < 3) {
            result.add(this.rdm());
        }
        return result;
    }
}
