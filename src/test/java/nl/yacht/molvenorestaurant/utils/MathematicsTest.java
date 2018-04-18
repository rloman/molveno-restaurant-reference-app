package nl.yacht.molvenorestaurant.utils;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MathematicsTest {

    // in unittest terms this is called a Fixture ... that is OK
    // .0..12
    private final List<Integer> fibonList = Arrays.asList(0, 1, 1, 2, 3, 5, 8,
            13, 21, 34, 55, 89, 144, 233);


    @Test
    public void testFibon() {
        for (int i = 0; i < 12; i++) {
            Assert.assertEquals(Integer.valueOf(fibonList.get(i)).intValue(), Mathematics.fibon(i));
        }

    }

    @Test
    public void testGGD() {
        Assert.assertEquals(4, Mathematics.ggd(36,8));
        Assert.assertEquals(4, Mathematics.ggd(752, 372));
        Assert.assertEquals(2, Mathematics.ggd(3658, 56));
        Assert.assertEquals(3, Mathematics.ggd(51,12));
        Assert.assertEquals(3, Mathematics.ggd(12, 51));
    }

    @Test
    public void testKgv(){

        Assert.assertEquals(12, Mathematics.kgv(4,3));

        System.out.println(Mathematics.kgv(40, 110));
    }

    @Test
    public void hanoiOneStone() {
        Mathematics.hanoi(1);
    }

    @Test
    public void hanoiTwoStones() {
        Mathematics.hanoi(2);
    }

    @Test
    public void hanoiThreeStones() {
        Mathematics.hanoi(3);
    }

    @Test
    public void hanoiEightStones() {
        Mathematics.hanoi(8);
    }

}
