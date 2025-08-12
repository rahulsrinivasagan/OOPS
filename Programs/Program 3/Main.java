import java.util.*;

class Employee {
    Scanner scan = new Scanner(System.in);

    int eid;
    String ename, eemail;

    void details() {
        System.out.println("Enter the ID of Employee : ");
        eid = scan.nextInt();
        scan.nextLine();  // consume leftover newline
        System.out.println("Enter the Name of Employee : ");
        ename = scan.nextLine();
        System.out.println("Enter the Mail ID of Employee : ");
        eemail = scan.nextLine();
    }

    void salary_calculation(double basicpay, double allowanceRate) {
        double da, hra, p_fund, gross_salary, net_salary;
        da = basicpay * allowanceRate;
        hra = basicpay * 0.80;
        p_fund = basicpay * 0.70;
        gross_salary = basicpay + da + hra;
        net_salary = gross_salary - p_fund;
        System.out.println("Gross Salary: " + gross_salary);
        System.out.println("Net Salary: " + net_salary);
    }

    void showDetails() {
        System.out.println("\n------------------------------------------");
        System.out.println("Employee ID : " + eid);
        System.out.println("Employee Name : " + ename);
        System.out.println("Employee Email ID : " + eemail);
        System.out.println("\n------------------------------------------");
    }
}

class HR extends Employee {

    void Hr_Details() {
        double basicpay;
        details();
        System.out.println("Enter the Basic pay of HR(80% Allowance) : ");
        basicpay = scan.nextDouble();
        salary_calculation(basicpay, 0.80);
        showDetails();
    }
}

class SeniorProgrammer extends Employee {

    void SP_details() {
        double basicpay;
        details();
        System.out.println("Enter the Basic pay of Senior Programmer(50% Allowance) : ");
        basicpay = scan.nextDouble();
        salary_calculation(basicpay, 0.50);
        showDetails();
    }
}

class Fresher extends Employee {

    void fresher_details() {
        double basicpay;
        details();
        System.out.println("Enter the Basic pay of Fresher(10% Allowance) : ");
        basicpay = scan.nextDouble();
        salary_calculation(basicpay, 0.10);
        showDetails();
    }
}

public class Main {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int ch;
        System.out.println("\nChoose the Employee Designation Option : ");
        System.out.println("1.HR\n2.SENIOR PROGRAMMER\n3.FRESHER");
        System.out.println("Choose your Option : ");
        ch = scan.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Give the Necessary Details of HR");
                HR hr = new HR();
                hr.Hr_Details();
                break;
            case 2:
                System.out.println("Give the Necessary Details of Senior Programmer");
                SeniorProgrammer sp = new SeniorProgrammer();
                sp.SP_details();
                break;
            case 3:
                System.out.println("Give the Necessary Details of Fresher");
                Fresher fr = new Fresher();
                fr.fresher_details();
                break;
            default:
                System.out.println("Enter the Correct Option");
                break;
        }

        scan.close();
    }
}
