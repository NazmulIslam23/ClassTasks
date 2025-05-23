import java.util.Date;

class Student {
    long id;
    String name;
    String program;

    public Student(long id, String name, String program) {
        this.id = id;
        this.name = name;
        this.program = program;
    }

    void displayStudent() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
    }
}

class Instructor {
    long id;
    String name;
    String department;
    String title;

    public Instructor(long id, String name, String department, String title) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.title = title;
    }

    void displayInstructor() {
        System.out.println("Instructor ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Title: " + title);
    }
}

class Course {
    long id;
    String syllabus;
    String title;
    String credits;
    String prerequisite;

    public Course(long id, String syllabus, String title, String credits, String prerequisite) {
        this.id = id;
        this.syllabus = syllabus;
        this.title = title;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }

    void displayCourse() {
        System.out.println("Course ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Syllabus: " + syllabus);
        System.out.println("Credits: " + credits);
        System.out.println("Prerequisite: " + prerequisite);
    }
}

class CourseOffering {
    long studentID;
    long instructorID;
    long courseID;
    Date time;
    int sectionNo;
    int roomId;
    int year;
    String semester;

    Student student;
    Instructor instructor;
    Course course;

    public CourseOffering(Student student, Instructor instructor, Course course,
                          Date time, int sectionNo, int roomId, int year, String semester) {
        this.student = student;
        this.instructor = instructor;
        this.course = course;
        this.studentID = student.id;
        this.instructorID = instructor.id;
        this.courseID = course.id;
        this.time = time;
        this.sectionNo = sectionNo;
        this.roomId = roomId;
        this.year = year;
        this.semester = semester;
    }

    void displayCourseOffering() {
        System.out.println("=== Course Offering ===");
        student.displayStudent();
        instructor.displayInstructor();
        course.displayCourse();
        System.out.println("Section: " + sectionNo);
        System.out.println("Room: " + roomId);
        System.out.println("Year: " + year);
        System.out.println("Semester: " + semester);
        System.out.println("Time: " + time);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Student student = new Student(101, "Alice Johnson", "Computer Science");
        Instructor instructor = new Instructor(501, "Dr. Smith", "CS", "Professor");
        Course course = new Course(301, "Algorithms & Data Structures", "CS201", "3", "CS101");

        CourseOffering offering = new CourseOffering(
                student, instructor, course, new Date(), 1, 204, 2025, "FA");

        offering.displayCourseOffering();
    }
}
