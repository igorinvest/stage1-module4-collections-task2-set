package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> result = new TreeSet<>();
        for (int i = 0; i < sourceList.size(); i++) {
            int sq = sourceList.get(i) * sourceList.get(i);
            if(sq >= lowerBound && sq <= upperBound) {
                result.add(sq);
            }
        }
        return result;
    }
}
