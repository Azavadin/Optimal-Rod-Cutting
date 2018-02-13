package rodCutting;

import org.junit.Before;
import org.junit.Test;
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.AbstractMap.SimpleEntry;

public class RodCutterOptimalTest {

    private RodCutterOptimal rodCutterOptimal;

    @Before
    public void setUp(){
        Map<Integer, Integer> lengthAndPriceMap = new HashMap<>();

        lengthAndPriceMap.put(1, 1);
        lengthAndPriceMap.put(2, 5);
        lengthAndPriceMap.put(3, 8);
        lengthAndPriceMap.put(4, 9);
        lengthAndPriceMap.put(5, 10);
        lengthAndPriceMap.put(6, 17);
        lengthAndPriceMap.put(7, 17);
        lengthAndPriceMap.put(8, 20);
        rodCutterOptimal = new RodCutterOptimal(lengthAndPriceMap);
    }

    @Test
    public void canary(){
        assertTrue(true);
    }

    @Test
    public void fetchMaxProfitForALengthOf0(){
        SimpleEntry<Integer, List<Integer>> expected = new SimpleEntry<>(0, Arrays.asList());

        assertEquals(expected, rodCutterOptimal.cutRod(0));    }

    @Test
    public void fetchMaxProfitForALengthOf1(){
        SimpleEntry<Integer, List<Integer>> expected = new SimpleEntry<>(1, Arrays.asList(1));

        assertEquals(expected, rodCutterOptimal.cutRod(1));}

    @Test
    public void fetchMaxProfitForALengthOf2(){
        SimpleEntry<Integer, List<Integer>> expected = new SimpleEntry<>(5, Arrays.asList(2));

        assertEquals(expected, rodCutterOptimal.cutRod(2));}

    @Test
    public void fetchMaxProfitForALengthOf5(){
        SimpleEntry<Integer, List<Integer>> expected = new SimpleEntry<>(13, Arrays.asList(2, 3));

        assertEquals(expected, rodCutterOptimal.cutRod(5));}

    @Test
    public void fetchMaxProfitForALengthOf8(){
        SimpleEntry<Integer, List<Integer>> expected = new SimpleEntry<>(22, Arrays.asList(2, 6));

        assertEquals(expected, rodCutterOptimal.cutRod(8));}

    @Test
    public void fetchMaxProfitForALengthOf10(){
        SimpleEntry<Integer, List<Integer>> expected = new SimpleEntry<>(27, Arrays.asList(2, 2, 6));

        assertEquals(expected, rodCutterOptimal.cutRod(10));}
}