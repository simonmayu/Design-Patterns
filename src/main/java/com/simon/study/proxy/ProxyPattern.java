package com.simon.study.proxy;

public class ProxyPattern {

    public static void main(String[] args) {
        Subject subject = new ConcreateSubject();
        Subject proxy = new Proxy(subject);

        proxy.request();

    }


    public interface Subject {
        void request();
    }


    public static class ConcreateSubject implements Subject {
        @Override
        public void request() {
            System.out.println("执行请求");
        }
    }

    public static class Proxy implements Subject {
        private Subject subject;

        public Proxy(Subject subject) {
            this.subject = subject;
        }

        @Override
        public void request() {
            System.out.println("执行额外的条件判断,考虑是否需要调用subject的request的方法");
            boolean invoke = true;
            if (invoke) {
                subject.request();
            }
        }
    }
}
