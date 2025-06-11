package com.giaolang.util.mathutil.core;

public class MathUtility {
    // CLASS NÀY DÙNG CUNG CẤP CÁC HÀM TÍNH TOÁN TOÁN HỌC
    // BẮT CHƯỚC CLASS MATH, TRONG JDK
    public static long getFactorial(long n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. Must be between 0 and 20.");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. Must be between 0 and 20.");
            //Nếu đưa data n cà chớn, ném ra ngoại lệ, ném câu thông báo, ko có giá trị
        }
        if (n == 0){
            return 1;
        }
        // cpu chạy đc đến đây tức là n = 1,2,3,..19, 20
        // tính n! = 1.2.3.4.... thuật toán con heo đất, ốc bu nhồi thịt, nhân dồn, cộng dồn tích lũy
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i; //i = 1 nhân, i = 2 nhân 2, i=3  nhân 3, dồn vào result
                        // đang có bao nhiêu nhân tiếp
        }
        return result;
    }
}
