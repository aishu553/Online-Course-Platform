import java.util.*;

class AuthServ {

    ArrayList<User> users = new ArrayList<>();

    void signup(User user) {
        users.add(user);
        System.out.println("Signup successful!");
    }

    User login(String username, String password) {
        for (User u : users) {
            if (u.username.equals(username) && u.password.equals(password)) {
                return u;
            }
        }
        return null;
    }
    void preloadUsers() {

        users.add(new Student("Aishu", "aishu123", "pass123", "10-06-2007", "9999999999"));
        users.add(new Instructor("Priya", "pri123", "pass123", "02-02-1995", "8888888888"));
        users.add(new Admin("AdminUser", "admin", "admin123", "03-03-1990", "7777777777"));
    } 

    void showAllUsers() {
        for (User u : users) {
            System.out.println(u.name + " (" + u.username + ")");
        }
    }
    void removeUser(String username) {
    Iterator<User> it = users.iterator();

    while (it.hasNext()) {
        User u = it.next();
        if (u.username.equals(username)) {
            it.remove();
            System.out.println("User removed successfully!");
            return;
        }
    }
    

    System.out.println("User not found.");
    }
}