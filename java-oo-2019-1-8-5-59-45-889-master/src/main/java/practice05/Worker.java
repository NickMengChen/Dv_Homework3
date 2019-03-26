package practice05;

public class Worker extends Person{

    public Worker(String name, int age)
    {
        super(name, age);
    }


    public String introduce() {
        return super.introduce() + " I am a Worker. I have a job.";
    }
//assertThat(tom.introduce()).isEqualTo("My name is Tom. I am 21 years old. I am a Worker. I have a job.");

}