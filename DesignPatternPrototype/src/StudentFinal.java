public class StudentFinal implements Prototype{
    @Override
    public Prototype clone() {
        return new StudentFinal(age,rollNumber,name);
    }


    int age;
    private int rollNumber;
    String name;

    public StudentFinal(int age, int rollNumber, String name) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name  = name;
    }


}
