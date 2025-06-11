package com.giaolang.util.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    // CHUẨN BỊ BỘ DATA ĐỂ RIÊNG - DD -  DATA DRIVEN
    // LÁT HỒI FILL VÀO HÀM SO SÁNH -  T TESTING
    // FILL VÀO QUA THAM SỐ HÀM - HÀM LÀM VIC VỚI NHIỀU DATA
    // DDT CÒN GỌI TÊN KHÁC: PARAMETERIZE TESTING - KIỂM THỬ THEO KIỂU THAM SỐ HÓA

    // BỘ DATA: NẰM TRONG HÀM STATIC - TĨNH 1 CHỖ ĐỂ CÁC NƠI VÀO LẤY
    // BỘ DATA: THƯỜNG L MẢNG 2 CHIỀU, GIÁ TRỊ ĐẦU VÀO VÀ GIÁ TRỊ KỲ VỌNG

    public static Object[][] initData() {
        return new Object[][]{{0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}, {6, 720}};
    }
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgsRusWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }


}