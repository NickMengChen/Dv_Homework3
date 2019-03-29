package practice11;
import java.util.ArrayList;
import java.util.LinkedList;

public class Teacher extends Person{

    private LinkedList<Klass> linkedList = new LinkedList<Klass>();
    public void WelcomeNewMember(Student student){

        System.out.println("I am " + this.getName() + ". I know " + student.getName() + " has joined Class 2.");
    }
    public void WelcomeNewLeader(Student student){

        System.out.println("I am " + this.getName() + ". I know " + student.getName() + " become Leader of Class 2.");
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList){
        super(id, name, age);
        this.linkedList = linkedList;
        for (Klass x : linkedList)
        {
            x.setTeacher(this);
        }
    }

    public Teacher (int id, String name, int age){
        super(id, name, age);
        //linkedList.add(null);
    }
    public LinkedList<Klass> getClasses() {
        return linkedList;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setKlass(int klass) {
        klass = klass;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public String introduce() {

        if (linkedList.size() != 0) {
            String query = super.introduce() + " I am a Teacher. I teach Class ";
            String query2 = "";
            for (Klass x : linkedList)
            {
                query2 += x.getNumber() + ", ";
                System.out.println(x.getNumber());
            }
            query2 =  query2.substring(0, query2.length() - 2) + ".";
            query += query2;
            return query;

        }
        return super.introduce() + " I am a Teacher. I teach No Class.";
    }

    public Boolean isTeaching(Student student){
        if (linkedList.size() == 0)
            return false;
        for (Klass x : linkedList)
        {
            if (x == null)
                continue;
            if (x.getNumber() == student.getKlass().getNumber())
                return true;
        }
        return false;
    }


    public String introduceWith(Student student){
        //if (student.getKlass().getNumber() == klass.getNumber())
        if (isTeaching(student))
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";

    }

}