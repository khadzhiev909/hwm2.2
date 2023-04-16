public class Main {
    public static void main(String[] args) {

        Grifendor studentGrifendors1 = new Grifendor("Гарри", "Поттер", "Грифендор", 45, 56, 56, 45, 56);
        Grifendor studentGrifendors2 = new Grifendor("Гермиона", "Гренджер", "Грифендор", 85, 56, 86, 45, 56);
        Grifendor studentGrifendors3 = new Grifendor("Рон", "Визли", "Грифендор", 55, 46, 66, 45, 56);

        Grifendor.newMethods(studentGrifendors1, studentGrifendors2);


        Puffenduy puffenduyStudent1 = new Puffenduy("Захария", "Смит", "Пуффендуй", 75, 46, 35, 45, 56);
        Puffenduy puffenduyStudent2 = new Puffenduy("Седрик", "Диггори", "Пуффендуй", 45, 75, 76, 45, 56);
        Puffenduy puffenduyStudent3 = new Puffenduy("Джастин", "Финч-Флетчли", "Пуффендуй", 33, 63, 54, 45, 56);

        Puffenduy.newMethods(puffenduyStudent2, puffenduyStudent3);


        Slizerin slizerinStudent1 = new Slizerin("Драко", "Малфой", "Слизарин", 55, 66, 56, 64, 45, 56);
        Slizerin slizerinStudent2 = new Slizerin("Грэхэм", "Монтегю", "Слизарин", 57, 59, 64, 90, 45, 56);
        Slizerin slizerinStudent3 =  new Slizerin("Грегори", "Грегори", "Слизарин", 12, 45, 67, 87, 45, 56);

        Slizerin.newMethods(slizerinStudent1, slizerinStudent2);

        Kogtevaran kogtevaranStudent1 = new Kogtevaran("Чжоу", "Чанг", "Когтеваран", 55, 68, 57, 45, 56);
        Kogtevaran kogtevaranStudent2 = new Kogtevaran("Падма", "Патил", "Когтеваран", 65, 45, 26, 45, 56);
        Kogtevaran kogtevaranStudent3 = new Kogtevaran("Маркус", "Белби", "Когтеваран", 93, 69, 58, 45, 56);

        Kogtevaran.newMethods(kogtevaranStudent1, kogtevaranStudent2);

        Hogwards.theBestInHogwards(puffenduyStudent1, kogtevaranStudent1);

    }


}


