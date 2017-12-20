package lyubin.task1.task1Page87;

import java.util.Calendar;
import java.util.GregorianCalendar;

class List {
    private Student[] studentlist = new Student[100];

    private int count = 0;

    void addStudent(Student n) {
        studentlist[count++] = n;
    }


    void listOut(Student[] studentlist) {

        for (Student mass : studentlist) {

            System.out.print("id:" + mass.getId() + ", ");
            System.out.print("name: " + mass.getName() + ", ");
            System.out.print("patronymic: " + mass.getPatronymic() + ", ");
            System.out.print("surname: " + mass.getSurname() + ", ");
            System.out.print("id: " + mass.getId() + ", ");
            System.out.print("birthdate: " + mass.getBirthdate().get(Calendar.YEAR) + "-" + mass.getBirthdate().get(Calendar.MONTH)
                    + "-" + mass.getBirthdate().get(Calendar.DAY_OF_MONTH) + ", ");
            System.out.print("adress: " + mass.getAdress() + ", ");
            System.out.print("phone: " + mass.getPhone() + ", ");
            System.out.print("faculty: " + mass.getFaculty() + ", ");
            System.out.print("course number: " + mass.getCourseNumber() + ", ");
            System.out.print("group number: " + mass.getGroupNumber() + ", ");
            System.out.println();
        }
    }

    void listOutByFaculty() {

        for (Student mass : studentlist) {
            if (mass != null) {

                if ("IGH".equalsIgnoreCase(mass.getFaculty())) {

                    System.out.print("id:" + mass.getId() + ", ");
                    System.out.print("name: " + mass.getName() + ", ");
                    System.out.print("patronymic:" + mass.getPatronymic() + ", ");
                    System.out.print("surname: " + mass.getSurname() + ", ");
                    System.out.print("id: " + mass.getId() + ", ");
                    System.out.print("birthdate: " + mass.getBirthdate().get(Calendar.YEAR) + "-" + mass.getBirthdate().get(Calendar.MONTH)
                            + "-" + mass.getBirthdate().get(Calendar.DAY_OF_MONTH) + ", ");
                    System.out.print("adress: " + mass.getAdress() + ", ");
                    System.out.print("phone: " + mass.getPhone() + ", ");
                    System.out.print("faculty: " + mass.getFaculty() + ", ");
                    System.out.print("course number: " + mass.getCourseNumber() + ", ");
                    System.out.print("group number: " + mass.getGroupNumber() + ", ");
                    System.out.println();

                }
            }

        }

    }


    void listOutByFacultyAndCourse() {

        for (Student mass : studentlist) {
            if (mass != null) {
                if (mass.getFaculty().equalsIgnoreCase("IGH") && mass.getCourseNumber() == 5) {

                    System.out.print("id: " + mass.getId() + ", ");
                    System.out.print("name: " + mass.getName() + ", ");
                    System.out.print("patronymic: " + mass.getPatronymic() + ", ");
                    System.out.print("surname:" + mass.getSurname() + ", ");
                    System.out.print("id: " + mass.getId() + ", ");
                    System.out.print("birthdate: " + mass.getBirthdate().get(Calendar.YEAR) + "-" + mass.getBirthdate().get(Calendar.MONTH)
                            + "-" + mass.getBirthdate().get(Calendar.DAY_OF_MONTH) + ", ");
                    System.out.print("adress: " + mass.getAdress() + ", ");
                    System.out.print("phone: " + mass.getPhone() + ", ");
                    System.out.print("faculty: " + mass.getFaculty() + ", ");
                    System.out.print("course number: " + mass.getCourseNumber() + ", ");
                    System.out.print("group number: " + mass.getGroupNumber() + ", ");
                    System.out.println();

                }
            }
        }
    }

    void listOutByYear(GregorianCalendar year) {

        for (Student mass : studentlist) {
            if (mass != null) {
                if (mass.getBirthdate().get(Calendar.YEAR) > year.get(Calendar.YEAR)) {

                    System.out.print("id: " + mass.getId() + ", ");
                    System.out.print("name: " + mass.getName() + ", ");
                    System.out.print("patronymic: " + mass.getPatronymic() + ", ");
                    System.out.print("surname: " + mass.getSurname() + ", ");
                    System.out.print("id: " + mass.getId() + ", ");
                    System.out.print("birthdate: " + mass.getBirthdate().get(Calendar.YEAR) + "-" + mass.getBirthdate().get(Calendar.MONTH)
                            + "-" + mass.getBirthdate().get(Calendar.DAY_OF_MONTH) + ", ");
                    System.out.print("adress: " + mass.getAdress() + ", ");
                    System.out.print("phone: " + mass.getPhone() + ", ");
                    System.out.print("faculty: " + mass.getFaculty() + ", ");
                    System.out.print("course number:" + mass.getCourseNumber() + ", ");
                    System.out.print("group number: " + mass.getGroupNumber() + ", ");
                    System.out.println();

                }
            }
        }
    }

    void listOutByGroup() {

        for (Student mass : studentlist) {
            if (mass != null) {
                if (mass.getGroupNumber() == 1) {

                    System.out.print("id: " + mass.getId() + ", ");
                    System.out.print("name: " + mass.getName() + ", ");
                    System.out.print("patronymic: " + mass.getPatronymic() + ", ");
                    System.out.print("surname: " + mass.getSurname() + ", ");
                    System.out.print("id: " + mass.getId() + ", ");
                    System.out.print("birthdate: " + mass.getBirthdate().get(Calendar.YEAR) + "-" + mass.getBirthdate().get(Calendar.MONTH)
                            + "-" + mass.getBirthdate().get(Calendar.DAY_OF_MONTH) + ", ");
                    System.out.print("adress: " + mass.getAdress() + ", ");
                    System.out.print("phone: " + mass.getPhone() + ", ");
                    System.out.print("faculty:" + mass.getFaculty() + ", ");
                    System.out.print("course number:" + mass.getCourseNumber() + ", ");
                    System.out.print("group number: " + mass.getGroupNumber() + ", ");
                    System.out.println();

                }
            }
        }
    }

}

