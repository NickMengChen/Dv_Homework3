package practice04;

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
        return "My name is " + name + ". I am " + age + " years old. I am a Student. I am at Class " + Klass + ".";
        //assertThat(tom.introduce()).isEqualTo("My name is Tom. I am 21 years old. I am a Student. I am at Class 2.");
    }
}