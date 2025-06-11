package com.giaolang.util.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test   // @Test tương đương hàm main(), code trong hàm này sẽ run như hàm main
    // biến mỗi test case thành test run, thành main() để chạy
    void verifyFactorialGivenRightArgORunsWell() {
        // 0! có là 1 hay ko
        assertEquals(1, MathUtility.getFactorial(0));
    }
    @Test
    void verifyFactorialGivenRightArg1RunsWell() {
        assertEquals(1, MathUtility.getFactorial(1));
    }
    @Test
    void verifyFactorialGivenRightArg2RunsWell() {
        assertEquals(2, MathUtility.getFactorial(2));
    }
    @Test
    void verifyFactorialGivenRightArg3RunsWell() {
        assertEquals(6, MathUtility.getFactorial(3));
    }
}