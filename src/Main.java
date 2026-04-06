import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AuthServ auth = new AuthServ();
        CourseServ cs = new CourseServ();
        cs.preloadCourses();
        auth.preloadUsers();

        // Preloaded courses
        while (true){
            System.out.println("=========== Welcome to Online Course Platform===========");
    
            System.out.println("1. Sign Up\n2. Login");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            sc.nextLine();
    
            User user = null;
            if (choice == 1) {
                System.out.print("Name: ");
                String name = sc.nextLine();
    
                System.out.print("Username: ");
                String username = sc.nextLine();
    
                System.out.print("Password: ");
                String password = sc.nextLine();
    
                System.out.print("DOB: ");
                String dob = sc.nextLine();
    
                System.out.print("Phone: ");
                String phone = sc.nextLine();
    
                System.out.println("1.Student 2.Instructor 3.Admin");
                int role = sc.nextInt();
    
                if (role == 1)
                    user = new Student(name, username, password, dob, phone);
                else if (role == 2)
                    user = new Instructor(name, username, password, dob, phone);
                else
                    user = new Admin(name, username, password, dob, phone);
    
                auth.signup(user);
            }
    
            else {
                System.out.print("Username: ");
                String username = sc.nextLine();
    
                System.out.print("Password: ");
                String password = sc.nextLine();
    
                user = auth.login(username, password);
    
                if (user == null) {
                    System.out.println("Invalid login");
                    return;
                }
            }
            int result = user.handleMenu(sc, auth, cs);
            if (result == 2) {
                System.out.println("Exiting platform...");
                break;
            }
        }
   }
}