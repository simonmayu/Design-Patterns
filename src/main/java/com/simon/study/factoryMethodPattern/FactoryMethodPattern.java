package com.simon.study.factoryMethodPattern;

public class FactoryMethodPattern {

    public static void main(String[] args) {

    }

    public interface Product {
        void execute();
    }


    public static class Product1 implements Product {
        @Override
        public void execute() {
            System.out.println("产品1的功能逻辑");
        }
    }


    public static class Product2 implements Product {
        @Override
        public void execute() {
            System.out.println("产品2的功能逻辑");
        }
    }

    public static class Product3 implements Product {
        @Override
        public void execute() {
            System.out.println("产品3的功能逻辑");
        }
    }


    public static abstract class AbstractProductFactory {

        public Product createProduct() {
            commonCreate();
            return specificCreate();
        }

        public void commonCreate() {
            System.out.println("生产产品的通用逻辑");
        }

        protected abstract Product specificCreate();
    }


    public  static class Product1Factory extends AbstractProductFactory{
        @Override
        protected Product specificCreate() {
            return null;
        }
    }











}
