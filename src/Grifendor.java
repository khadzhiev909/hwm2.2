import java.util.Objects;

public class Grifendor  extends Hogwards{
    private int nobility;
    private int honor;
    private int bravery;

    public Grifendor(String name, String surName, int nobility, int honor, int bravery) {
        super(name, surName);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Grifendor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grifendor grifendor = (Grifendor) o;
        return nobility == grifendor.nobility && honor == grifendor.honor && bravery == grifendor.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nobility, honor, bravery);
    }

    public static void newMethods(Grifendor student1, Grifendor student2) {
        int totalValue = student1.nobility + student1.honor + student1.bravery;
        int totalValue2 = student2.nobility + student2.honor + student2.bravery;

        if (totalValue > totalValue2) {
            System.out.println(student1.getName() + " лучше чем " + student2.getName() + " у него(-её) " + totalValue + " баллов");
        } else if (totalValue < totalValue2) {
            System.out.println(student2.getName() + " лучше чем " + student1.getName() + " у него(-её) " + totalValue + " баллов");
        }
    }
}
