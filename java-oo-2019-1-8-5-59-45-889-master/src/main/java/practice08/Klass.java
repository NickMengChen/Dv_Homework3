package practice08;

public class Klass {
    private int Number;
    private Student leader;

    public int getNumber() {
        return Number;
    }

    public boolean isLeader(Student student) {
        if (leader == null)
            return false;
        return this.leader.getId() == student.getId();
    }

    public void assignLeader(Student leader) {
        this.leader = leader;
    }

    public Student getLeader() {
        return leader;
    }

    public Klass(int number) {
        Number = number;
    }

    public String getDisplayName(){
        return "Class " + this.getNumber();
    }
}
