package practice07;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(String name, int age, Klass klass){
        super(name, age);
        this.klass = klass;
    }

    public Teacher (String name, int age){
        super(name, age);
        klass = null;
    }
    public Klass getKlass() {
        return klass;
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
        if (klass != null)
            return super.introduce() + " I am a Teacher. I teach Class " + klass.getNumber() + ".";
        return super.introduce() + " I am a Teacher. I teach No Class.";
    }
    public String introduceWith(Student student){
        if (student.getKlass().getNumber() == klass.getNumber())
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";

    }
}