package com.simon.study.obsever;

import java.util.Observable;
import java.util.Observer;

public class ObserverPattern {

    public static void main(String[] args) {
        Subject subject = new Subject(0);

        Observer observer = new ConcreateObsever();
        subject.addObserver(observer);

        subject.setState(1);
        subject.setState(2);

    }


    public static class Subject extends Observable {
        private Integer state;

        public Integer getState() {
            return state;
        }

        public Subject(Integer state) {
            this.state = state;
        }

        public void setState(Integer state) {
            // 在这里状态就改变

            this.state = state;
            //通知关联的一些观察者,说我的状态变化了
            this.setChanged();
            //
            this.notifyObservers();
        }
    }

    public static class ConcreateObsever implements Observer {
        @Override
        public void update(Observable o, Object arg) {
            Subject subject = (Subject) o;
            Integer state = subject.getState();
            System.out.println("目标对象的状态发生了变化" + state);
        }
    }
}
