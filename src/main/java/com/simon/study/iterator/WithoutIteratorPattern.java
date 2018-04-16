package com.simon.study.iterator;


import java.util.HashMap;
import java.util.Map;

/**
 * @author simon
 */
public class WithoutIteratorPattern {
    public static void main(String[] args) {

        Student stu1 = new Student("simon1");
        Student stu2 = new Student("simon2");
        Student[] students = new Student[2];
        students[0] = stu1;
        students[1] = stu2;
        ClassroomArray arrayroom = new ClassroomArray(students);
        for (Student resultStudent : arrayroom.getStudents()) {
            System.out.println(resultStudent);
        }


        System.out.println("==================================");
        Map<String, Student> maps = new HashMap<String, Student>();
        maps.put(stu1.getName(), stu1);
        maps.put(stu2.getName(), stu2);


        ClassroomMap maproom = new ClassroomMap(maps);

        for (Student stu : maproom.getStudents().values()) {
            System.out.println(stu);
        }
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


    public static class ClassroomArray {
        private Student[] students;

        public ClassroomArray(Student[] students) {
            this.students = students;
        }

        public Student[] getStudents() {
            return students;
        }

        public void setStudents(Student[] students) {
            this.students = students;
        }
    }


    public static class ClassroomMap {
        private Map<String, Student> students;

        public ClassroomMap(Map<String, Student> students) {
            this.students = students;
        }

        public Map<String, Student> getStudents() {
            return students;
        }

        public void setStudents(Map<String, Student> students) {
            this.students = students;
        }
    }

}
