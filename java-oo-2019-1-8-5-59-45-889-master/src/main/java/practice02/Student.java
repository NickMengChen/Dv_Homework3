package practice02;

public class Student extends Person{
    private int Klass;
    public Student(String name, int age, int Klass){
        super(name, age);
        this.Klass = Klass;
    }
    public int getKlass() {
        return Klass;
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
        Klass = klass;
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
        return "I am a Student. I am at Class " + Klass + ".";
    }
}
