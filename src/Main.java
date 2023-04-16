public class Main {
    public static void main(String[] args) {

        Grifendor studentGrifendors1 = new Grifendor("Гарри", "Поттер", 45, 56, 56);
        Grifendor studentGrifendors2 = new Grifendor("Гермиона", "Гренджер", 85, 56, 86);
        Grifendor studentGrifendors3 = new Grifendor("Рон", "Визли", 55, 46, 66);

        Grifendor.newMethods(studentGrifendors1, studentGrifendors2);


        Puffenduy puffenduyStudent1 = new Puffenduy("Захария", "Смит", 75, 46, 35);
        Puffenduy puffenduyStudent2 = new Puffenduy("Седрик", "Диггори", 45, 75, 76);
        Puffenduy puffenduyStudent3 = new Puffenduy("Джастин", "Финч-Флетчли", 33, 63, 54);

        Puffenduy.newMethods(puffenduyStudent2, puffenduyStudent3);


        Slizerin slizerinStudent1 = new Slizerin("Драко", "Малфой", 55, 66, 56, 64);
        Slizerin slizerinStudent2 = new Slizerin("Грэхэм", "Монтегю", 57, 59, 64, 90);
        Slizerin slizerinStudent3 =  new Slizerin("Грегори", "Грегори", 12, 45, 67, 87);

        Slizerin.newMethods(slizerinStudent1, slizerinStudent2);

        Kogtevaran kogtevaranStudent1 = new Kogtevaran("Чжоу", "Чанг", 55, 68, 57);
        Kogtevaran kogtevaranStudent2 = new Kogtevaran("Падма", "Патил", 65, 45, 26);
        Kogtevaran kogtevaranStudent3 = new Kogtevaran("Маркус", "Белби", 93, 69, 58);

        Kogtevaran.newMethods(kogtevaranStudent1, kogtevaranStudent2);

    }


}


