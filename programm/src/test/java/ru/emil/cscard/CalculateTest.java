package ru.emil.cscard;

import org.junit.Test;

import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by dinis on 24.07.17.
 */
public class CalculateTest {

    @Test
    public void whenNumbersThenSet() {
        Print print = new Print();
        Calculate calculate = new Calculate();
        Set<Integer> set = calculate.generateSet();
        System.out.println(set);

        if (set.contains(3)) {
            System.out.println("yes");
        } else {
            System.out.println("nou");
        }
        print.osnova();
    }
}
