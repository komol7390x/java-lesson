package Lesson2.Student;

public class Student {
        String name;
        int age;
        int course;

        Student(String name,int age,int course){
            this.name=name;
            this.age=age;
            this.course=course;
            System.out.println("Yangi talaba yaratildi: "+name);
        }

        Student(){
        }

    void sayHello2() {
        System.out.println("Salom! Men " + this.name + ", " + this.age + " yoshdaman.");
    }


    public void sayHello(){
            System.out.println("Salom " + this.name + " " +this.age+"-yoshdaman");
        }

        void  moveToNextCourse(){
            course++;
            System.out.println(this.name+" endi " + course + "-kursda");
        }

}
