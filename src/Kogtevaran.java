public class Kogtevaran extends Hogwards{
    private int mind;
    private int wisdom;
    private int wit;

    public Kogtevaran(String name, String surName,int mind, int wisdom, int wit) {
        super(name, surName);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
    }

    public static void newMethods(Kogtevaran student1, Kogtevaran student2) {
        int totalValue = student1.mind + student1.wisdom + student1.wit;
        int totalValue2 = student2.mind + student2.wisdom + student2.wit;

        if (totalValue > totalValue2) {
            System.out.println(student1.getName() + " лучше чем " + student2.getName() + " у него(-её) " + totalValue + " баллов");
        } else if (totalValue < totalValue2) {
            System.out.println(student2.getName() + " лучше чем " + student1.getName() + " у него(-её) " + totalValue + " баллов");
        }
    }
}
