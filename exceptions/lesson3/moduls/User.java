package lesson3.moduls;

public class User {
    private String name;
    private String soName;
    private String patronymic;
    private String dateBirth;
    private String number;
    private String gender;


    public User(String name, String soName, String patronymic,
                String dateBirth, String number, String gender) {
        this.name = name;
        this.soName = soName;
        this.patronymic = patronymic;
        this.dateBirth = dateBirth;
        this.number = number;
        this.gender = gender;
    }

    public String getname(){
        return name;
    }

    @Override
    public String toString() {
        return "<" + name + ">" + "<" + soName + ">" + "<" + patronymic + ">" + "<" + dateBirth + ">" +
                "<" + number + ">" + "<" + gender + ">";
    }
}