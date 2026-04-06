
class Course  {

    static int counter = 1;
    int courseId;
    String title;
    String instructorName;

    Course(String title, String instructorName) {
        this.courseId = counter++;
        this.title = title;
        this.instructorName = instructorName;
    }

    void display() {
        System.out.println(courseId + ". " + title + " (by " + instructorName +" )");
    }
}