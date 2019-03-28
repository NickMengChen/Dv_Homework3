package practice09;


public class Person {
    protected int id;
    protected String name;
    protected int age;
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person)) {
            return false;
        }
        Person other = (Person) o;
        return other.id == id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person(int id, String name, int age){
        this.name = name;
        this.age = age;
        this.id = id;
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


    public String introduce() {
        return "My name is " +
                "" + name + ". I am " + age +
                " years old.";
    }
}