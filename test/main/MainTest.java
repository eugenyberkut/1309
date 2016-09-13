package main;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Eugeny on 13.09.2016.
 */
public class MainTest {

    double EPS = 0.000001;
    Main main;

    @Before
    public void setUp() throws Exception {
        main = new Main();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testF() throws Exception {
        double expected = 1.0;
        double result = main.f(0.5);
        assertEquals(expected, result, EPS);
    }

    @Test
    public void testF2() throws Exception {
        double expected = 0.2078796;
        double result = main.f(Math.PI);
        assertEquals(expected,result,EPS);
    }

    @Test
    public void testF3() throws Exception {
        double expected = 0;
        double result = main.f(1);
        assertEquals(expected,result,EPS);
    }

    @Test
    public void testSteps() throws Exception {
        double start = 0;
        double finish = 10;
        double h = 0.1;
        int expected = 101;
        int result = main.steps(h,start, finish);
        assertEquals(expected,result);
    }

    @Test
    public void testCreateX() throws Exception {
        double start = 0;
        double finish = 1;
        double h = 0.1;
        double[] expected = {0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0};
        double[] x = main.createX(h, start, finish);
        assertArrayEquals(expected, x, EPS);
    }

    @Test
    public void testCreateX1() throws Exception {
        double start = 0;
        double finish = 3;
        double h = 0.004;
        double[] x = main.createX(h,start,finish);
        assertEquals(0.7, x[175], EPS);
        assertEquals(1.4, x[350], EPS);
        assertEquals(3.0, x[750], EPS);
    }
}