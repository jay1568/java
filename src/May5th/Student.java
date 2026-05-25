package Day01.src.May5th;

import java.io.ObjectStreamClass;
import java.util.Objects;
import java.util.SplittableRandom;

public class Student implements Comparable<Student>{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Student stu) {
        return this.id - stu.id;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ",name=" + name + "}";
    }
}
