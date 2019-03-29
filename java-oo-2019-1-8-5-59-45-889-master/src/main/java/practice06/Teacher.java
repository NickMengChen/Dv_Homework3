package practice06;

public class Teacher extends Person{
    private int Klass;

    public Teacher(String name, int age, int Klass){
        super(name, age);
        this.Klass = Klass;
    }

    public Teacher (String name, int age){
        super(name, age);
        Klass = -1;
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

        if (Klass != -1)
            return super.introduce() + " I am a Teacher. I teach Class " + Klass + ".";
        return super.introduce() + " I am a Teacher. I teach No Class.";
    }
}