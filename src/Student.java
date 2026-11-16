public class Student {
    private final String name;
    private final int age;
    private final int score;

    public boolean isActive() {
        return isActive;
    }

    private final boolean isActive;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

    public Student(String name, int age, int score, boolean isActive) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.isActive = isActive;
    }
}
