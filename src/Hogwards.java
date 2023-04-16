public class Hogwards {
    private String name;
    private String facultetName;
    private String surName;
    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwards(String name, String surName, int powerOfMagic, int transgressionDistance, String facultetName) {
        this.name = name;
        this.surName = surName;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
        this.facultetName = facultetName;
    }

    public String getFacultetName() {
        return facultetName;
    }

    public String getName() {
        return name;
    }
    public String getSurName() {
        return surName;
    }

    @Override
    public String toString() {
        return "Hogwards{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }

    public static void theBestInHogwards(Hogwards firstStudent, Hogwards secondStudent) {
        int totalSum = firstStudent.powerOfMagic + firstStudent.transgressionDistance;
        int totalSum2 = secondStudent.powerOfMagic + secondStudent.transgressionDistance;
        if (totalSum > totalSum2) {
            System.out.println("Студент " + firstStudent.getName() +  " " + firstStudent.getFacultetName() + " факультета лучше, чем студент " + secondStudent.getName() + secondStudent.getFacultetName() + " факультета.");
        } else {
            System.out.println("Студент " + secondStudent.getName() +  " " + secondStudent.getFacultetName() + " факультета лучше, чем студент " + firstStudent.getName() + secondStudent.getFacultetName() + " факультета.");

        }
    }
}


