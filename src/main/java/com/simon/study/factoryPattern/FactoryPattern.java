package com.simon.study.factoryPattern;

public class FactoryPattern {

    public static void main(String[] args) {
        Product product = ProductFactory.create();
        product.execute();
    }

    // 如果此时有100个地方都需要获取Product的实例
    // 但是此时Product实现类改了
    // 我们只要修改一个地方即可，就是ProductFacory中

    public interface Product {
        void execute();
    }

    public static class ProductImpl implements Product {
        @Override
        public void execute() {
            System.out.println("产品1实现的功能");
        }
    }

    public static class ProductFactory {
        public static Product create() {
            return new ProductImpl();
        }
    }
}
