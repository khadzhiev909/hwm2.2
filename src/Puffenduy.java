public class Puffenduy  extends Hogwards{
    int industriousness;
    int loyal;
    int honesty;

    public Puffenduy(String name, String surName, String facultetName, int powerOfMagic, int transgressionDistance, int industriousness, int loyal, int honesty) {
        super(name, surName, powerOfMagic, transgressionDistance, facultetName);
        this.industriousness = industriousness;
        this.loyal = loyal;
        this.honesty = honesty;
    }
    public static void newMethods(Puffenduy student1, Puffenduy student2) {
        int totalValue = student1.industriousness + student1.loyal + student1.honesty;
        int totalValue2 = student2.industriousness + student2.loyal + student2.honesty;

        if (totalValue > totalValue2) {
            System.out.println(student1.getName() + " лучше чем " + student2.getName() + " у него(-её) " + totalValue + " баллов");
        } else if (totalValue < totalValue2) {
            System.out.println(student2.getName() + " лучше чем " + student1.getName() + " у него(-её) " + totalValue + " баллов");
        }
    }
}
