import java.util.*;

class Instructor extends User {

    Instructor(String name, String username, String password, String dob, String phone) {
        super(name, username, password, dob, phone);
    }

    void showMenu() {
        System.out.println("\n--- Instructor Menu ---");
        System.out.println("1. Create Course");
        System.out.println("2. View Courses");
        System.out.println("3. Log Out");
        System.out.println("4. Exit Platform");
    }

    int handleMenu(Scanner sc, AuthServ auth, CourseServ cs) {

        while (true) {
            showMenu();
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Enter Course Title: ");
                String title = sc.nextLine();
                cs.addCourse(new Course(title, name));
            }

            else if (ch == 2) {
                cs.showCourses();
            }
            else if (ch == 3) return 1;
            else if (ch == 4) return 2;
        }
    }
}