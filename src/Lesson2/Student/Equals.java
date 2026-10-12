package Lesson2.Student;

public class Equals {
    public void equalsExample() {
        Student x=new Student(); x.name="Ali";
        Student y=new Student(); y.name="Ali";
        Student z=x;

        System.out.println("Equal1 " + (x==y));
        System.out.println("Equal2 " + (x==z));

        String s1=new String("Hello");
        String s2=new String("Hello");
        System.out.println("Equal3 " + x.equals(y));
        System.out.println("Equal4 " + s1.equals(s2));
    }
}
