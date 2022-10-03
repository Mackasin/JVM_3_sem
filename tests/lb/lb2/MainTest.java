package lb.lb2;

import com.nki.dzhurynskyi.laboratorywork.lb2.Main;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }


    @Test
    void xValuesArrayCreateTest() {

        double[] xValues;
        double x1 =1;
        int x2 = 2;
        double step = 0.1;

        xValues = main.xValuesArrayCreate(x1, x2, step);

        assertNotNull(xValues);
    }

    @Test
    void yValuesArrayFillTest0() {

        double a = 2.4;
        double x1 = 1;
        int x2 = 5;
        double step = 0.01;

        double[] xValues = main.xValuesArrayFill(x1, x2, step);
        double[] yValues = main.yValuesArrayFill(xValues, a);

        double element0 = yValues[0];

        assertEquals(-0.0668948, element0, 0.00001);

    }

    @Test
    void yValuesArrayFillTest140(){

        double a = 2.4;
        double x1 = 1;
        int x2 = 5;
        double step = 0.01;

        double[] xValues = main.xValuesArrayFill(x1, x2, step);
        double[] yValues = main.yValuesArrayFill(xValues, a);

        double element140 = yValues[140];

        assertEquals(0.002729, element140, 0.00001);

    }

    @Test
    void yValuesArrayFillTest400(){

        double a = 2.4;
        double x1 = 1;
        int x2 = 5;
        double step = 0.01;

        double[] xValues = main.xValuesArrayFill(x1, x2, step);
        double[] yValues = main.yValuesArrayFill(xValues, a);

        double element300 = yValues[300];

        assertEquals(5.05964, element300, 0.00001);
    }


    @Test
    void xValuesArrayFillTest() {

        double x1 = 1;
        int x2 = 2;
        double step = 0.1;

        double[] xValuesTemp = {1,1.1,1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9,2};
        double[] xValues = main.xValuesArrayFill(x1, x2, step);

        assertArrayEquals(xValuesTemp, xValues, 0.01);
    }


    @Test
    void getMinIndexTest() {

        double[] yValues = {2.2, 0.2, 3.0, 1.3};

        int minIndex = main.getMinIndex(yValues);

        assertEquals(1, minIndex);
    }


    @Test
    void getMinElementTest() {

        double[] yValues = {1.1, 2.2, 3.3};

        double minElement = main.getMinElement(yValues);

        assertEquals(1.1, minElement, 0.01);
    }


    @Test
    void getMinElementArgumentTest() {

        double[] yValues = {1.1, 2.2, 3.3};
        double[] xValues = {0.5, 1, 1.5};

        double minElementArgument = main.getMinElementArgument(yValues, xValues);

        assertEquals(0.5, minElementArgument, 0.01);

    }

    @Test
    void getMaxIndexTest() {

        double[] yValues = {2.2, 7.1, 9.0, 5.2};

        int maxIndex = main.getMaxIndex(yValues);

        assertEquals(2, maxIndex);

    }

    @Test
    void getMaxElementTest() {

        double[] yValues = {1.1, 2.2, 3.3};

        double maxElement = main.getMaxElement(yValues);

        assertEquals(3.3, maxElement, 0.01);
    }


    @Test
    void getMaxElementArgumentTest() {

        double[] yValues = {1.1, 2.2, 3.3};
        double[] xValues = {0.5, 1, 1.5};

        double maxElementArgument = main.getMaxElementArgument(yValues, xValues);

        assertEquals(1.5, maxElementArgument, 0.01);
    }

    @Test
    void getSumTest() {

        double[] yValues = {1.1, 2.2, 3.3};

        double sum = main.getSum(yValues);

        assertEquals(6.6, sum, 0.01);

    }

    @Test
    void getAverageTest() {

        double[] yValues = {1.1, 2.2, 3.3};

        double average = main.getAverage(yValues);

        assertEquals(2.2, average, 0.01);
    }


    @Test
    void calculateStepsTest() {

        double x1 = 0.5;
        int x2 = 1;
        double step = 0.1;

        int result = main.calculateSteps(x1, x2, step);

        assertEquals(6, result);
    }
}