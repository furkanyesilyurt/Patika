import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Employee furkan;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Calisanin adi: ");
        String name = scanner.nextLine();
        System.out.print("Calisanin maasi: ");
        Double salary = scanner.nextDouble();
        System.out.print("Calisılan saat: ");
        int workHours = scanner.nextInt();
        System.out.print("Giris yili: ");
        int hireYear = scanner.nextInt();

        furkan = new Employee(name, salary, workHours, hireYear);
        double tax = furkan.tax(salary);
        double bonus = furkan.bonus(workHours);
        double raiseSalary = furkan.raiseSalary(hireYear, salary);
        double totalMaas = salary + tax + bonus + raiseSalary;
        System.out.println("Toplam maas: " + totalMaas);
        //System.out.println(tax + " " + bonus + " " + raiseSalary);
        scanner.close();
    }
}
