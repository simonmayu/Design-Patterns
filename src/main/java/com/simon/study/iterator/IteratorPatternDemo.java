package com.simon.study.iterator;

public class IteratorPatternDemo {

    public static void main(String[] args) {

    }


    public interface Iterator {
        public abstract boolean hasNext();

        public abstract Object next();
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

    private static class Classroom {
        private Student[] students;
        private int last = 0;


        public Classroom(int size) {
            this.students = new Student[size];
        }

        public Student getStudent(int index) {
            return students[index];
        }

        public void addStudent(Student student) {
            this.students[last] = student;
            last++;
        }

        public int getLength() {
            return last;
        }


        public Iterator iterator() {
            return new ClassroomIterator(this);
        }
    }


}
