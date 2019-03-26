package practice07;

public class Klass {
    private int Number;

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public Klass(int number) {
        Number = number;
    }

    public String getDisplayName(){
        return "Class " + this.getNumber();
    }
}
