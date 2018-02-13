package rodCutting;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class PerformanceTest {

    private RodCutter rodCutter;
    private RodCutterOptimal rodCutterOptimal;

    @Test
    public void canary(){
        assertTrue(true);
    }

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
        rodCutter = new RodCutter(lengthAndPriceMap);
        rodCutterOptimal = new RodCutterOptimal(lengthAndPriceMap);
    }

    @Test
    public void compareRunningTimes(){
        assertTrue(getRunningTime(rodCutter) > getRunningTime(rodCutterOptimal)*10);
    }

    private long getRunningTime(RodCutter rodCutterForTest){
        long startTime = System.nanoTime();
        rodCutterForTest.cutRod(10);
        long endTime = System.nanoTime();
        return endTime-startTime;
    }

}
