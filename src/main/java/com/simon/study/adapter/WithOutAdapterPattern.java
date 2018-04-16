package com.simon.study.adapter;

public class WithOutAdapterPattern {
    public static void main(String[] args) {

        OldInterface oldObject = new OldInterfaceImpl();
        NewInterface newObject = new NewInterfaceImpl();

        oldObject.oldExecute();
        newObject.newExecute();

    }


    public static interface OldInterface {
        void oldExecute();
    }

    public static class OldInterfaceImpl implements OldInterface {
        @Override
        public void oldExecute() {
            System.out.println("老版本接口实现的功能逻辑");
        }
    }


    public static interface NewInterface {
        void newExecute();
    }

    public static class NewInterfaceImpl implements NewInterface {
        @Override
        public void newExecute() {
            System.out.println("新版本接口实现的功能逻辑");
        }
    }
}
