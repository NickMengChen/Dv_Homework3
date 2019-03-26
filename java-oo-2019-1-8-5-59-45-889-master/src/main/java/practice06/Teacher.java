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
        //return super.introduce() + " I am a Student. I am at Class " + Klass + ".";
//
//>My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2.
//
//        如果klass为空，就会返回：
//
//>My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.

        if (Klass != -1)
        {
            return super.introduce() + " I am a Teacher. I teach Class " + Klass + ".";
        }
        return super.introduce() + " I am a Teacher. I teach No Class.";
    }
}