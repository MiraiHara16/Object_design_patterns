import java.util.Scanner;
public class CustomerMailApplication {
    
    /*private Customer customer;
    public CustomerMailApplication(Customer customer) {
        this.customer = customer;
    }*/

    public static void main(String[] args) {
        Customer cust = getCustomerTypeFromUser();
        String mail = null;
        if (cust != null) {
            mail = generateMail(cust);
            System.out.println(mail);
        }
        else {
            System.out.println("Error");
        }
        
    }
    public static String generateMail(Customer cust) {
        return cust.createMail();
    }
    public static Customer getCustomerTypeFromUser() {
        Customer customer = null;
        Scanner in = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = in.nextInt();
        switch(type) {
            case 1:
                customer = CustomerMailFactory.createCustomer("Regular");
                break;
            case 2:
                customer = CustomerMailFactory.createCustomer("Mountain");
                break;
            case 3:
                customer = CustomerMailFactory.createCustomer("Delinquent");
                break;
            
        }
        return customer;
    }
    
}
