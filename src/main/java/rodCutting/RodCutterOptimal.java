package rodCutting;

import java.util.*;
import java.lang.ArrayIndexOutOfBoundsException;
import java.util.AbstractMap.SimpleEntry;
import java.util.stream.Stream;

public class RodCutterOptimal extends RodCutter{

    private Map<Integer, SimpleEntry<Integer, List<Integer>>> OptimalLengthsAndCutsMap = new HashMap<>();

    public RodCutterOptimal (Map<Integer, Integer> lengthAndPriceMap){
        super(lengthAndPriceMap);
    }

    public SimpleEntry<Integer, List<Integer>> cutRod(int length){
        if(!OptimalLengthsAndCutsMap.containsKey(length)){
            OptimalLengthsAndCutsMap.put(length, super.cutRod(length));
        }

        return OptimalLengthsAndCutsMap.get(length);
    }
}