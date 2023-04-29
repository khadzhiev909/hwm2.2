public class Kogtevaran extends Hogwards{
    private int mind;
    private int wisdom;
    private int wit;

    public Kogtevaran(String name, String surName, String facultetName, int powerOfMagic, int transgressionDistance, int mind, int wisdom, int wit) {
        super(name, surName, powerOfMagic, transgressionDistance, facultetName);
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
