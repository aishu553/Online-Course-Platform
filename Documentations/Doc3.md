## 06 April 2026 | Monday 15:30 pm

-> Completed structuring the Online Course Platform project

-> Organized code inside `src` with separate files:

* User, Student, Instructor, Admin
* Course, Rateable
* AuthService, CourseService
* Main

---

-> Built using OOP concepts:

* Abstraction → User is abstract
* Inheritance → Student, Instructor, Admin extend User
* Polymorphism → handleMenu() differs per class
* Interface → Rateable for course rating

---

-> Authentication (AuthService):

* Signup + Login using ArrayList
* Preloaded users for testing (no DB)

---

-> Course management (CourseService):

* Add, view, remove, search
* Preloaded courses for demo

---

-> Student features:

* View, enroll, track progress (HashMap)
* Rate, complete course, certificate, search

---

-> Instructor:

* Create and view courses

---

-> Admin:

* View users, remove users/courses

---

-> Design choices:

* ArrayList → users/courses
* HashMap → courseId → progress
* No instanceof → used polymorphism (handleMenu)

---

-> Added Logout & Exit:

* Logout → back to login/signup
* Exit → end program

---

-> Single Scanner passed across methods (no multiple instances)

-> Added `.gitignore` to exclude `.class` files (i feel like this is the most amazing thing i learned while building this project. Silly)

---

-> Final system supports:

* Authentication, RBAC
* Course creation & enrollment
* Progress tracking, rating, search, certificates

---

-> Learned applying OOP to build a structured, interactive system without backend
