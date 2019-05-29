package StudentManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class studentManagement {

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        while (true) {
            System.out.println("******欢迎来到学生信息管理系***************");
            System.out.println("0: 显示所有的学生");
            System.out.println("1: 添加学生");
            System.out.println("2: 修改学生");
            System.out.println("3: 删除学生");
            System.out.println("4: 查找学生");
            System.out.println("5: 退出系统");

            int caseNumber;
            while (true) {
                System.out.println("请输入你想选择的操作:");
                Scanner sc = new Scanner(System.in);
                if (sc.hasNextInt()) {
                    caseNumber = sc.nextInt();
                    break;
                } else {
                    System.out.println("你输入的方式有误");
                }
            }


            switch (caseNumber) {
                case 0:
                    System.out.println("显示所有学生操作");
                    findAllStudent(studentList);
                    break;
                case 1:
                    System.out.println("进入添加学生操作");
                    addStudent(studentList);
                    break;
                case 2:
                    System.out.println("进入修改学生操作");
                    updateStudent(studentList);
                    break;
                case 3:
                    System.out.println("进入删除学生操作");
                    deleteStudent(studentList);
                    break;
                case 4:
                    System.out.println("进入查找学生操作");
                    searchStudent(studentList);
                    break;
                case 5:
                    System.out.println("退出系统操作");
                    exit();
                    break;
                default:
                    System.out.println("你输入的信息有误");
            }

        }
    }

    public static class Student {
        private String name;
        private int age;
        private String role;

        public Student() {
        }

        public Student(String name, int age, String role) {
            this.name = name;
            this.age = age;
            this.role = role;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String getRole() {
            return role;
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        Student newStudent = new Student();
        int age = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入新建学生的姓名");
        String name = sc.nextLine();
        while (true) {
            System.out.println("请输入学生的年龄");
            sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                age = sc.nextInt();
                break;
            } else {
                System.out.println("请从新输入");
            }
        }
        System.out.println("请输入学生的角色");
        sc.nextLine();
        String roleName = sc.nextLine();
        newStudent.setName(name);
        newStudent.setAge(age);
        newStudent.setRole(roleName);
        array.add(newStudent);
        System.out.println("添加学生成功");
    }

    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("现在暂时没有数据");
        } else {
            System.out.print("姓名\t年龄\t角色\n");
            for (Student item : array) {
                System.out.println(item.getName() + '\t' + item.getAge() + '\t' + item.getRole());
            }
        }
    }

    public static void deleteStudent(ArrayList<Student> array) {
        System.out.println("请输入想删除的人的姓名");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for (Student item : array) {
            if (item.getName().equals(name)) {
                System.out.println("找到了该同学");
                array.remove(item);
                System.out.println("已删除该同学");
                return;
            }
        }
        System.out.println("没找到该同学");
    }


    public static void searchStudent(ArrayList<Student> array){
        System.out.println("请输入想要查找的学生的姓名");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for (Student item: array){
            if(item.getName().equals(name))
                System.out.println("找到了该同学");
                System.out.println(item.getName() + '\t' + item.getRole() + '\t' +  item.getAge());
                return;
            }
        System.out.println("没有找到该同学");
        }

    public static void updateStudent(ArrayList<Student> array) {
        System.out.println("请输入你想修改的姓名");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for (Student item : array) {
            if (item.getName().equals(name)) {
                System.out.println("找到了该同学，请输入新的年龄");
                item.setAge(sc.nextInt());
                System.out.println("请输入新的角色");
                sc.nextLine();
                item.setRole(sc.nextLine());
                System.out.println("修改成功");
                return;
            }
        }
        System.out.println("没有找到符合标准的同学");
    }

    public static void exit() {
        System.exit(0);
    }
}
