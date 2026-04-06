import java.util.Scanner;

abstract class User {
    String name, username, password, dob, phone;

    User(String name, String username, String password, String dob, String phone) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.dob = dob;
        this.phone = phone;
    }

    abstract void showMenu();

    abstract int handleMenu(Scanner sc, AuthServ auth, CourseServ cs);
}