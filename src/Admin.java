import java.util.*;

class Admin extends User {

    Admin(String name, String username, String password, String dob, String phone) {
        super(name, username, password, dob, phone);
    }

    void showMenu() {
        System.out.println("\n--- Admin Menu ---");
        System.out.println("1. View Users");
        System.out.println("2. Remove User");
        System.out.println("3. Remove Course");
        System.out.println("4. Log Out");
        System.out.println("5. Exit Platform");
    }

    int handleMenu(Scanner sc, AuthServ auth, CourseServ cs) {

        while (true) {
            showMenu();
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                auth.showAllUsers();
            }

            else if (ch == 2) {
                System.out.print("Enter username: ");
                String uname = sc.nextLine();
                auth.removeUser(uname);
            }

            else if (ch == 3) {
                cs.showCourses();
                System.out.print("Enter course ID: ");
                int id = sc.nextInt();
                cs.removeCourse(id);
            }
            else if(ch==4) return 1;
            else if(ch==5) return 2;
        }
    }
}