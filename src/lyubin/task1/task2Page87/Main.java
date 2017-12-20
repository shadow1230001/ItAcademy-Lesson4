package lyubin.task1.task2Page87;

public class Main {
    public static void main(String[] args) {
        Customer[] customers = new Customer[3];
        customers[0] = new Customer(1, "lyubin", "vladimir", "eugenavich", "Minsk", 123456, "128Acd963");
        customers[1] = new Customer(2, "lyubin", "igor", "eugenavich", "Minsk", 123456789, "128Acdfg964");
        customers[2] = new Customer(3, "lyubin", "eugeniy", "gorelskiy", "Minsk", 12305, "789456ytf15");

        List list = new List();
        list.customerSort(customers);
        for (Customer customer : customers) {
            list.addCustomer(customer);
            System.out.println("Customer list= " + customer.toString());
        }
        list.showCustomers( list.getByFilter(1, 123457));
    }
}
