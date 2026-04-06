import java.util.*;

class Student extends User {

    ArrayList<Course> enrolledCourses = new ArrayList<>();
    HashMap<Integer, Integer> progressMap = new HashMap<>();

    Student(String name, String username, String password, String dob, String phone) {
        super(name, username, password, dob, phone);
    }

    void showMenu() {
        System.out.println("\n--- Student Menu ---");
        System.out.println("1. View Courses");
        System.out.println("2. Enroll Course");
        System.out.println("3. View Progress");
        System.out.println("4. Complete Course");
        System.out.println("5. Search Course");
        System.out.println("6. Log Out");
        System.out.println("7. Exit Platform");

    }

    int handleMenu(Scanner sc, AuthServ auth, CourseServ cs) {

        while (true) {
            showMenu();
            int ch = sc.nextInt();

            if (ch == 1) {
                cs.showCourses();
            }

            else if (ch == 2) {
                cs.showCourses();
                System.out.print("Enter Course ID: ");
                int id = sc.nextInt();

                Course c = cs.getCourseById(id);
                if (c != null) enrollCourse(c);
            }

            else if (ch == 3) {
                viewProgress();
            }

            else if (ch == 4) {
                System.out.print("Enter Course ID: ");
                int id = sc.nextInt();

                Course c = cs.getCourseById(id);
                if (c != null) completeCourse(c);
            }

            else if (ch == 5) {
                sc.nextLine();
                System.out.print("Enter keyword: ");
                String key = sc.nextLine();
                cs.searchCourse(key);
            }
            else if (ch == 6) {
                return 1; // logout
            }

            else if (ch == 7) {
                return 2; // exit
            }
        }
    }

    void enrollCourse(Course c) {
        enrolledCourses.add(c);
        progressMap.put(c.courseId, 0);
        System.out.println("Enrolled!");
    }

    void viewProgress() {
        for (Course c : enrolledCourses) {
            System.out.println(c.title + " -> " + progressMap.get(c.courseId) + "%");
        }
    }
    
    void completeCourse(Course c) {
        progressMap.put(c.courseId, 100);
        System.out.println("\nCERTIFICATE: " + name + " completed " + c.title);
    }
}