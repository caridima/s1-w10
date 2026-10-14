public class StudentMain{
    public static void main(String[] args) {
        Student h1 = new Student("ASU", "Bob");
        Student h2= new Student("MED", "Curt");
        System.out.println(h1.isSameClub(h2));
    }
    
}