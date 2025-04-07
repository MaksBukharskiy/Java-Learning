public class ConstructorsLearning {
    public static void main(String[] args) {

        Student student1 = new Student("Maks", 16, 4.2, false);
        Student student2 = new Student("Andrey", 18, 4.0, true);

        System.out.println(student1.name);
        System.out.println(student2.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(" ");

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println(" ");

        student1.personalInfo();
        student2.personalInfo();
    }

}
