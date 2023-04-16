public class Slizerin  extends Hogwards{
    int cunning;
    int determination;
    int ambition;
    int resourcefulness;
    public Slizerin(String name, String surName, int cunning, int determination, int ambition, int resourcefulness) {
        super(name, surName);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
    }

    public static void newMethods(Slizerin student1, Slizerin student2) {
        int totalValue = student1.ambition + student1.cunning + student1.resourcefulness;
        int totalValue2 = student2.ambition + student2.cunning + student2.resourcefulness;

        if (totalValue > totalValue2) {
            System.out.println(student1.getName() + " лучше чем " + student2.getName() + " у него(-её) " + totalValue + " баллов");
        } else if (totalValue < totalValue2) {
            System.out.println(student2.getName() + " лучше чем " + student1.getName() + " у него(-её) " + totalValue + " баллов");
        }
    }
}
