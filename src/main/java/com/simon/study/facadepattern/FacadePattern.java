package com.simon.study.facadepattern;

public class FacadePattern {


    public static void main(String[] args) {
        SystemFacade facade = new SystemFacade();
        facade.execute();
        // 好处1：子系统2不需要care太多的模块，只要care一个门面类的接口就可以了
        // 好处2：如果多个地方都要调用这段逻辑，那么如果这个逻辑变了，只需要在门面类一个地方修改就可以了
    }

    public static class SystemFacade {
        public void execute() {
            ModuleA moduleA = new ModuleA();
            ModuleB moduleB = new ModuleB();
            ModuleC moduleC = new ModuleC();
            moduleA.execute();
            moduleB.execute();
            moduleC.execute();
            System.out.println("新增的一段逻辑");
        }
    }


    public static class ModuleA {
        public void execute() {
            System.out.println("子系统1的模块A的功能");
        }
    }


    public static class ModuleB {
        public void execute() {
            System.out.println("子系统1的模块B的功能");
        }
    }


    public static class ModuleC {
        public void execute() {
            System.out.println("子系统1的模块C的功能");
        }
    }
}
