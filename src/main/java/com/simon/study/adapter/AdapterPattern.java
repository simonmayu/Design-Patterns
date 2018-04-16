package com.simon.study.adapter;

public class AdapterPattern {

    public static void main(String[] args) {


        NewInterface oldObject = new NewInterfaceAdapter(new OldInterfaceImpl());
        NewInterface newObject = new NewInterfaceImpl();
        oldObject.newExecute();
        newObject.newExecute();

    }


    public static class NewInterfaceAdapter implements NewInterface {
        private OldInterface oldObject;

        public NewInterfaceAdapter(OldInterface oldObject) {
            this.oldObject = oldObject;
        }

        @Override
        public void newExecute() {
            oldObject.oldExecute();
        }
    }

    public static interface NewInterface {
        void newExecute();
    }

    public static interface OldInterface {
        void oldExecute();
    }

    public static class NewInterfaceImpl implements NewInterface {
        @Override
        public void newExecute() {
            System.out.println("新版本接口实现的功能逻辑");
        }
    }


    public static class OldInterfaceImpl implements OldInterface {
        @Override
        public void oldExecute() {
            System.out.println("老版本接口实现的功能逻辑");
        }
    }

}
