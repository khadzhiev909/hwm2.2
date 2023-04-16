public class Hogwards {
    private String name;
    private int rating;
    private String surName;

    public Hogwards(String name, String surName) {
        this.name = name;
        this.surName = surName;
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
                ", rating=" + rating +
                ", surName='" + surName + '\'' +
                '}';
    }


}


