package com.codegym;

public class MyListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1,"Huy");
        Student b = new Student(2,"Huong");
        Student c = new Student(3,"Hy");
        Student d = new Student(4,"uy");
        Student e = new Student(5,"Huy");

        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> newMyList = new MyList<>();

        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
//        studentMyList.add(e);
//        studentMyList.add(1, d);
//        studentMyList.clear();
        studentMyList.size();

//        for (int i = 0; i < studentMyList.size(); i++) {
//            Student student = (Student) studentMyList.elements[i];
//            System.out.println(student.getId());
//            System.out.println(student.getName());
//        }
//        System.out.println("Size: " + studentMyList.size());
//
//        System.out.println(studentMyList.get(2).getName());
//        System.out.println(studentMyList.indexOf(e));
//        System.out.println(studentMyList.contains(e));

        newMyList = studentMyList.clone();
        Student student = newMyList.remove(3);
        System.out.println(student.getName());

//        for (int i = 0; i < newMyList.size(); i++){
//            System.out.println(newMyList.get(i).getName());
//        }
    }
}
