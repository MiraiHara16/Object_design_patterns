
class Employee implements EmployeeComponent {
    private String name;
    private String position;
    private int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.println("Employee :[ Name : " + name + ", position : " + position + ", salary : " + salary + " ]");
    }
}
