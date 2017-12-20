package lyubin.task1.task1Page87;

import java.util.GregorianCalendar;

public class Student {
    private int id;
    private String name;
    private String patronymic;
    private String surname;
    private GregorianCalendar birthdate;
    private String adress;
    private String phone;
    private String faculty;
    private int courseNumber;
    private int groupNumber;

    Student(int id, String name, String patronymic, String surname, GregorianCalendar birthdate, String adress, String phone, String faculty, int courseNumber, int groupNumber) {
        this.id = id;
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.birthdate = birthdate;
        this.adress = adress;
        this.phone = phone;
        this.faculty = faculty;
        this.courseNumber = courseNumber;
        this.groupNumber = groupNumber;

    }

    int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    GregorianCalendar getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(GregorianCalendar birthdate) {
        this.birthdate = birthdate;
    }

    String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate=" + birthdate +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                ", faculty='" + faculty + '\'' +
                ", courseNumber=" + courseNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
