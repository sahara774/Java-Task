package com.mycompany.studentregistrationsystem;
import java.util.ArrayList;
import java.util.List;

public class StudentRegistrationSystem {

   
    public static class CourseRegistrationManager {
        private List<Registration> registrations;
        private List<Course> courses;
        private List<Account> accounts;

        public CourseRegistrationManager() {
            this.registrations = new ArrayList<>();
            this.courses = new ArrayList<>();
            this.accounts = new ArrayList<>();
        }

        public void addRegistration(Registration reg) {
            registrations.add(reg);
        }

        public void addCourse(Course course) {
            courses.add(course);
        }

        public void addAccount(Account account) {
            accounts.add(account);
        }

        public List<Registration> getRegistrations() { return registrations; }
        public List<Course> getCourses() { return courses; }
        public List<Account> getAccounts() { return accounts; }
    }

  
    public static class Student {
        private String studentID;
        private String name;
        private Account account;

        public Student(String studentID, String name) {
            this.studentID = studentID;
            this.name = name;
        }

        public String getStudentID() { return studentID; }
        public void setStudentID(String studentID) { this.studentID = studentID; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public Account getAccount() { return account; }
        public void setAccount(Account account) { this.account = account; }
    }

    
    public static class Account {
        private String accountID;
        private String username;
        private String password;
        private Student student;

        public Account(String accountID, String username, String password, Student student) {
            this.accountID = accountID;
            this.username = username;
            this.password = password;
            this.student = student;
        }

        public String getAccountID() { return accountID; }
        public void setAccountID(String accountID) { this.accountID = accountID; }
        public String getUsername() { return username; }
        public void setUsername(String username) { this.username = username; }
        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }
        public Student getStudent() { return student; }
        public void setStudent(Student student) { this.student = student; }
    }

   
    public static class Course {
        private String courseID;
        private String courseName;
        private int credits;

        public Course(String courseID, String courseName, int credits) {
            this.courseID = courseID;
            this.courseName = courseName;
            this.credits = credits;
        }

        public String getCourseID() { return courseID; }
        public void setCourseID(String courseID) { this.courseID = courseID; }
        public String getCourseName() { return courseName; }
        public void setCourseName(String courseName) { this.courseName = courseName; }
        public int getCredits() { return credits; }
        public void setCredits(int credits) { this.credits = credits; }
    }

   
    public static class Registration {
        private String registrationID;
        private Student student;
        private Course course;

        public Registration(String registrationID, Student student, Course course) {
            this.registrationID = registrationID;
            this.student = student;
            this.course = course;
        }

        public String getRegistrationID() { return registrationID; }
        public void setRegistrationID(String registrationID) { this.registrationID = registrationID; }
        public Student getStudent() { return student; }
        public void setStudent(Student student) { this.student = student; }
        public Course getCourse() { return course; }
        public void setCourse(Course course) { this.course = course; }
    }

  
    public static void main(String[] args) {
        
        CourseRegistrationManager manager = new CourseRegistrationManager();

        
        Student student = new Student("S001", "Alice");

        
        Account account = new Account("A001", "alice123", "pass123", student);
        student.setAccount(account);

       
        Course course = new Course("C001", "Intro to Java", 3);

       
        Registration registration = new Registration("R001", student, course);

        
        manager.addAccount(account);
        manager.addCourse(course);
        manager.addRegistration(registration);

        
        System.out.println("Student: " + registration.getStudent().getName());
        System.out.println("Registered Course: " + registration.getCourse().getCourseName());
    }
}
