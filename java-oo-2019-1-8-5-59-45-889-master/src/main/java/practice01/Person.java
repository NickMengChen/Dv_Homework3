package practice01;

public class Person {

    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //public String introduce()

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //@Override
    public String introduce() {
        return "My name is " +
                "" + name + ". I am " + age +
                " years old.";
    }
    //assertThat(introduce).isEqualTo("My name is Tom. I am 21 years old.");

}
