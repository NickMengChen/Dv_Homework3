package practice10;

import java.util.ArrayList;

public class Klass {
    private int Number;
    private Student leader;
    private ArrayList<Student> students = new ArrayList<>();

    public ArrayList<Student> getStudents() {
        return students;
    }

    public int getNumber() {
        return Number;
    }


    public boolean appendMember(Student student)
    {
        if (students.contains(student))
            return false;
        else
            students.add(student);

        return true;
    }

    public boolean isLeader(Student student) {
        if (leader == null)

            return false;
        return this.leader.getId() == student.getId();
    }

    public boolean assignLeader(Student leader) {

        if (!students.contains(leader))
        {
            System.out.print("It is not one of us.\n");
            return false;
        }
        this.leader = leader;
        return true;
    }

    public Student getLeader() {
        return leader;
    }

    public Klass(int number) {
        Number = number;
    }

    public String getDisplayName(){
        return "Class " + this.getNumber();
    }
}
