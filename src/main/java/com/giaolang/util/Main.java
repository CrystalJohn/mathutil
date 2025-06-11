package com.giaolang.util;

import com.giaolang.util.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        verifyFactorialGivenRightArgsRunsWell();
    }
    // TEST CASE #4,5,6: VERIFY THE GETFACTORIAL() WITH N = 3,4,5,...;
    public static void verifyFactorialGivenRightArgsRunsWell(){
        System.out.println("3! = expected: 6" + ", actual: " + MathUtility.getFactorial(3));
        System.out.println("4! = expected: 24" + ", actual: " + MathUtility.getFactorial(4));
        System.out.println("5! = expected: 120" + ", actual: " + MathUtility.getFactorial(5));
        System.out.println("6! = expected: 720" + ", actual: " + MathUtility.getFactorial(6));
    }
    // TEST CASE #3: VERIFY THE GETFACTORIAL() WITH N = 2;
    public static void verifyFactorialGivenRightArg2RunsWell(){
        System.out.println("2! = expected: 2" + ", actual: " + MathUtility.getFactorial(2));
    }
    // TEST CASE 2: VERIFY THE GETFACTORIAL() WITH N = 1
    public static void verifyFactorialGivenRightArg1RunsWell(){
        long n = 1;
        long expected = 1; //hy vọng 1 trả về nếu tính 1!
        long actual = MathUtility.getFactorial(n);
        //test là so ánh
        System.out.println("1! = expected: " + expected + ", actual: " + actual);
    }
    // TEST THỬ HÀM TÍNH GIAI THỪA, GỌI TRONG MAIN()
    // MUỐN TEST CASE GÌ ĐÓ THÌ PHẢI CÓ TEST CASE
    // TEST CASE #1: VERIFY THE GETFACTORIAL() WITH N = 0
    // STEPS:
        // GIVEN N = 0
        // CALL getFactorial(n=0)
    // EXPECTED RESULT:
    //      the method must return 1 as the result of 0! = 1
    // STATUS: PASSED \ FAILED PHẢI CHỜ
    public static void verifyFactorialGivenRightArgORunsWell(){
        long n = 0;
        long expected = 1; //hy vọng 1 trả về nếu 0!
        long actual = MathUtility.getFactorial(n);
        //test là so ánh
        System.out.println("0! = expected: " + expected + ", actual: " + actual);
    }
}
// KĨ THUẬT VỪA GÕ CODE, VỪA GÕ TEST CASE, VỪA GÕ TEST RUN, ĐC GỌI LÀ
// TDD( ĐƯA VÀO CV) TEST DRIVEN DEVELOPMENT