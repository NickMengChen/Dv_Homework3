package practice08;

public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age, Klass klass){
        super(id, name, age);
        this.klass = klass;
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

    public void setKlass(Klass klass) {
        this.klass = klass;
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

        if(klass.isLeader(this)) {

            return super.introduce() + " I am a Student. I am Leader of Class " + klass.getNumber() + ".";
        }

        System.out.println(klass.getNumber() + "ssss");
        return super.introduce() + " I am a Student. I am at Class " + klass.getNumber() + ".";

    }


}