package school.lesson3;

public class Employees {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employees (String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        Employees[] employees = new Employees[5];
        employees[0] = new Employees("Ivanov Ivan", "Engineer", "ivvanov@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employees("Dyatlov Petr", "Manager", "dyatlov@mailbox.com", "892345678", 40000, 45);
        employees[2] = new Employees("Sidorov Sidor", "Analyst", "sidorov@mailbox.com", "892356789", 35000, 35);
        employees[3] = new Employees("Smirnov Sergey", "Developer", "smirnov@mailbox.com", "892367890", 45000, 50);
        employees[4] = new Employees("Vasilyev Kirill", "Designer", "vasilyev@mailbox.com", "892378901", 32000, 25);

        System.out.println("Employees older than 40:");
        for (Employees employee : employees) {
            if (employee.age > 40) {
                employee.printInfo();
            }
        }
    }
}

