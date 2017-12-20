package lyubin.task1.task1Page87;

import java.util.GregorianCalendar;


public class Main {
    public static void main(String[] args) {
        Student[] stud = new Student[3];
        stud[0] = new Student(1, "vladimir", "eugenavich", "lyubin", new GregorianCalendar(1995, 7, 18), "Minsk", "+375(29)690-39-00", "IGH", 4, 131701);
        stud[1] = new Student(2, "Sergey", "Sergeevich", "Sergeev", new GregorianCalendar(1981, 5, 6), "Lviv", "063-333-99-33", "IGI", 4, 1);
        stud[2] = new Student(3, "Artur", "Vladimirovich", "Kulik", new GregorianCalendar(1985, 9, 1), "Kharkov", "063-433-90-30", "IGI", 1, 1);

        List l = new List();
        for (Student k : stud) {
            l.addStudent(k);
        }

        System.out.println("Students entered list: ");
        l.listOut(stud);
        System.out.println("Students list by entered facultate: ");
        l.listOutByFaculty();
        System.out.println("lists of students for each faculty and course: ");
        l.listOutByFacultyAndCourse();
        System.out.println("list of students were born after the given year: ");
        l.listOutByYear(new GregorianCalendar(1990, 9, 9));
        System.out.println("list of training groups: ");
        l.listOutByGroup();

    }
}
