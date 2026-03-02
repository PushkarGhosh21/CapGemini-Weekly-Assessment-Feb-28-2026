package com.junit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class NumberManipulatorTest {

    @Test
    void testDoubleTheArray() {
        // 1. Set up the class and input
        NumberManipulator manipulator = new NumberManipulator();
        int[] startingArray = {1, 2, 3};
        
        // 2. Define what you expect
        int[] expectedArray = {2, 4, 6};
        
        // 3. Get the actual result from your method
        int[] actualArray = manipulator.doubleTheArray(startingArray);
        
        // 4. Assert!
        assertArrayEquals(expectedArray, actualArray);
    }

}