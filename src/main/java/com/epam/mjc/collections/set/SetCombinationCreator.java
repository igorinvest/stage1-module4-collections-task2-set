package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result = new TreeSet<>();

        Stream<String> stream1 = firstSet.stream();
        stream1.forEach(s -> {
            if(secondSet.contains(s) && !thirdSet.contains(s)) {
                result.add(s);
            }
        });

        Stream<String> stream3 = thirdSet.stream();
        stream3.forEach(s -> {
            if(!firstSet.contains(s) && !secondSet.contains(s)) {
                result.add(s);
            }
        });

        return result;
    }
}
