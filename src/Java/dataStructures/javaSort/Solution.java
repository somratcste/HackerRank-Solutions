package Java.dataStructures.javaSort;

import java.util.*;

class Student implements Comparable{

    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        super();
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Object o) {
        double epsilon = 0.001; // since we shouldn't use "==" with doubles
        Student student = (Student) o;
        if (Math.abs(cgpa - student.cgpa) > epsilon) {
            return student.cgpa > cgpa ? 1 : -1; // descending order
        } else if (!name.equals(student.name)) {
            return name.compareTo(student.name);
        } else {
            return id - student.id;
        }
    }
}

class StudentComparator implements Comparator<Student> {

    double epsilon = 0.001;
    public int compare(Student s1, Student s2) {
        if (Math.abs(s1.getCgpa() - s2.getCgpa()) > epsilon) {
            return s2.getCgpa() > s1.getCgpa() ? 1 : -1;
        } else if (!s1.getName().equals(s2.getName())) {
            return s1.getName().compareTo(s2.getName());
        } else {
            return s1.getId()-s2.getId();
        }
    }
}

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) {

        int totalNumber = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();
        for (int count = 0; count < totalNumber; count ++ ) {
            int id = scanner.nextInt();
            String name = scanner.next();
            double cgpa = scanner.nextDouble();
            students.add(new Student(id, name, cgpa));
        }
        Collections.sort(students);
//        Collections.sort(students, new StudentComparator());
        for (Student student: students) {
            System.out.println(student.getName());
        }
    }
}
