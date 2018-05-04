package com.simon.study.strategy;

public class WithoutStrategyPattern {

    public static void main(String[] args) {
        int discountStyle = 1;
        if (discountStyle == 1) {
            System.out.println("执行优惠计价方式1的复杂业务逻辑");
        } else if (discountStyle == 2) {
            System.out.println("执行优惠计价方式2的复杂业务逻辑");
        } else if (discountStyle == 3) {
            System.out.println("执行优惠计价方式3的复杂业务逻辑");
        } else {
            System.out.println("执行默认的优惠计价方式的复杂业务逻辑");
        }
    }
}
