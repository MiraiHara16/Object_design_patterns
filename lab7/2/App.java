public class App {
    public static void main(String[] args) {
        // Create employees
        EmployeeComponent ceo = new Manager("Settha", "CEO", 500000);

        EmployeeComponent headSales = new Manager("Kamphaka", "Head Sales", 300000);
        EmployeeComponent sales1 = new Employee("Wiroj", "Sales", 150000);
        EmployeeComponent sales2 = new Employee("Weeranan", "Sales", 100000);

        EmployeeComponent headMarketing = new Manager("UngInk", "Head Marketing", 300000);
        EmployeeComponent marketing1 = new Employee("Oak", "Marketing", 200000);
        EmployeeComponent marketing2 = new Employee("Aem", "Marketing", 250000);

        // Assign subordinates
        ((Manager) ceo).addSubordinate(headSales);
        ((Manager) ceo).addSubordinate(headMarketing);

        ((Manager) headSales).addSubordinate(sales1);
        ((Manager) headSales).addSubordinate(sales2);

        ((Manager) headMarketing).addSubordinate(marketing1);
        ((Manager) headMarketing).addSubordinate(marketing2);

        // Print report
        ceo.print();
    }
}