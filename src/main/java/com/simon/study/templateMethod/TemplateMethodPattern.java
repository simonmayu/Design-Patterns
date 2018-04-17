package com.simon.study.templateMethod;

public class TemplateMethodPattern {

    public static void main(String[] args) {
        DiscountCalculator calculator1 = new DiscountCalculator1();
        calculator1.calculate();

        DiscountCalculator calculator2 = new DiscountCalculator2();
        calculator2.calculate();

        DiscountCalculator calculator3 = new DiscountCalculator3();
        calculator3.calculate();
    }


    public interface DiscountCalculator {
        void calculate();
    }


    public static abstract class AbstractDiscountCalculator implements DiscountCalculator {

        public void calculate() {
            commonCalculate();
            specificCalculate();
        }

        private void commonCalculate() {
            System.out.println("通用的计算逻辑");
        }

        protected abstract void specificCalculate();
    }


    public static class DiscountCalculator1 extends AbstractDiscountCalculator {
        @Override
        protected void specificCalculate() {
            System.out.println("优惠计算器1的特殊计算逻辑");
        }
    }

    public static class DiscountCalculator2 extends AbstractDiscountCalculator {
        @Override
        protected void specificCalculate() {
            System.out.println("优惠计算器2的特殊计算逻辑");
        }
    }


    public static class DiscountCalculator3 extends AbstractDiscountCalculator {
        @Override
        protected void specificCalculate() {
            System.out.println("优惠计算器3的特殊计算逻辑");
        }
    }
}
