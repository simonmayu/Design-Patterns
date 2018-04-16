package com.simon.study.iterator;

import java.util.ArrayList;
import java.util.List;

public class IteratorPatternDemo {

    public static void main(String[] args) {


        Student student1 = new Student("小明");
        Student student2 = new Student("小王");

        Classroom classroom = new Classroom(2);
        classroom.addStudent(student1);
        classroom.addStudent(student2);

        java.util.Iterator<Student> iterator = classroom.iterator();
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            System.out.println(student);
        }
    }


    public interface Iterator {
        public abstract boolean hasNext();

        public abstract Object next();
    }


    public interface Aggregate {
        public abstract java.util.Iterator<Student> iterator();
    }


    public static class Student {
        private String name;

        public Student(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" + "name='" + name + '\'' + '}';
        }
    }

    private static class ClassroomIterator implements Iterator {

        private Classroom classroom;
        private int index;

        public ClassroomIterator(Classroom classroom) {
            this.classroom = classroom;
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            if (index < classroom.getLength()) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object next() {
            Student student = classroom.getStudent(index);
            index++;
            return student;
        }
    }


    private static class Classroom implements Aggregate {
        // private Student[] students;
        private List<Student> students;
        private int last = 0;


        public Classroom(int size) {
            //this.students = new Student[size];
            this.students = new ArrayList<Student>(size);
        }

        public Student getStudent(int index) {
            //  return students[index];
            return students.get(index);
        }

        public void addStudent(Student student) {
//            this.students[last] = student;
//            last++;
            this.students.add(student);
        }

        public int getLength() {
            return students.size();
        }

        public java.util.Iterator iterator() {
            //return new ClassroomIterator(this);
            return students.iterator();
        }
    }

//    private static class Classroom {
//        private Student[] students;
//        private int last = 0;
//
//
//        public Classroom(int size) {
//            this.students = new Student[size];
//        }
//
//        public Student getStudent(int index) {
//            return students[index];
//        }
//
//        public void addStudent(Student student) {
//            this.students[last] = student;
//            last++;
//        }
//
//        public int getLength() {
//            return last;
//        }
//
//        public Iterator iterator() {
//            return new ClassroomIterator(this);
//        }
//    }


}
