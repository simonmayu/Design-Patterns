package com.simon.study.command;

public class CommandPattern {

    public static void main(String[]args){
        Command commandA = new CommandA();
        Command commandB = new CommandB();
        Invoker   invoker = new Invoker();
        invoker.setCommand(commandA);
        invoker.execute();

        invoker.setCommand(commandB);
        invoker.execute();
    }

    


    public interface Command{
        void execute();
    }


    public static class CommandA implements  Command{
        @Override
        public void execute() {
            System.out.println("命令A的功能逻辑");
        }
    }


    public static class CommandB implements Command{
        @Override
        public void execute() {
            System.out.println("命令B的功能逻辑");
        }
    }


    public static class Invoker{
        private Command command;

        public Command getCommand(){
            return command;
        }
        public void setCommand(Command command){
            this.command=command;
        }

        public void execute(){
            System.out.println("一些别的逻辑A");
            command.execute();
            System.out.println("一些别的逻辑B");
        }
    }
}
