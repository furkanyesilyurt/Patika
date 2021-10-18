/**
 * Employee
 */
public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(double salary){
        if(salary<1000){
            return 0;
        } else return (salary*3/100);
    }

    double bonus(int workHours){
        if(workHours>40){
            int fazla = workHours - 40;
            return fazla*30;
        }
        return 0;
    }

    double raiseSalary(int hireYear,double salary){
        if(hireYear>2011){
            return salary*0.05;
        } else if(hireYear<=2011 && hireYear>2001){
            return salary*0.1;
        } else return salary*0.15;
    }

    void calisanBilgileri(){
        System.out.println("Name: " + name + 
        "\nSalary: " + salary + 
        "\nworkHours: " + workHours + 
        "\nHireYears: " + hireYear);
    }
}