package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < sourceList.size(); i++) {
            int v = sourceList.get(i);
            if(v % 2 == 0) {
                int toBeAdded = v;
                while (toBeAdded % 2 == 0) {
                    toBeAdded = toBeAdded / 2;
                    result.add(toBeAdded);
                }
            } else {
                result.add(v * 2);
            }
            result.add(v);
        }
        return result;
    }
}
