/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Course mat = new Course("Matematik", "101MAT", "MAT");
        Course fizik = new Course("Fizik", "101FZK", "FZK");
        Course kimya = new Course("Kimya", "101KMY", "KMY");

        Student furkan = new Student("Furkan","EEM","113",mat,fizik,kimya);

        furkan.addBulkExamNote(80, 70, 60);
        System.out.println(furkan.isCheckPass());
    }

}