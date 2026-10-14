package Lesson3.Student;

public class ClassRoom {
    private final int stundentAverageAge;
    private final int quantity;
    private String className;
    private boolean active;

    private ClassRoom(int stundentAverageAge,int quantity){
        this.stundentAverageAge=stundentAverageAge;
        this.quantity=quantity;
    }

    public int getStundentAverageAge() {
        return stundentAverageAge;
    }

    public String getClassName() {
        return className;
    }

    public boolean getActive(){
        return  this.active;
    }
}
