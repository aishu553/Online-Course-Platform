import java.util.*;

class CourseServ {

    ArrayList<Course> courses = new ArrayList<>();
    void preloadCourses() {
        courses.add(new Course("Java Basics", "Admin"));
        courses.add(new Course("Data Structures", "Admin"));
        courses.add(new Course("Web Development", "Admin"));
        courses.add(new Course("Python for Beginners", "Admin"));
    }
    void addCourse(Course c) {
        courses.add(c);
        System.out.println("Course created!");
    }

    void showCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }

        for (Course c : courses) {
            c.display();
        }
    }

    Course getCourseById(int id) {
        for (Course c : courses) {
            if (c.courseId == id)
                return c;
        }
        return null;
    }

    void searchCourse(String keyword) {
        boolean found = false;

        for (Course c : courses) {
            if (c.title.toLowerCase().contains(keyword.toLowerCase())) {
                c.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching courses found.");
        }
    }
    void removeCourse(int id) {
    for (int i = 0; i < courses.size(); i++) {
        if (courses.get(i).courseId == id) {
            courses.remove(i);
            System.out.println("Course removed successfully!");
            return;
        }
    }

    System.out.println("Course not found.");
    }
}