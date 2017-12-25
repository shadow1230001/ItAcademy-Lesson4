package lyubin.task1.task2Page87.runner;

import lyubin.task1.task2Page87.bean.Catalogue;
import lyubin.task1.task2Page87.bean.Customer;

import static lyubin.task1.task2Page87.constant.CustomerConstant.*;

public class Main {
    public static void main(String[] args) {
        Customer[] customers = new Customer[3];
        customers[0] = new Customer(CUSTOMER_ID_FIRST, "lyubin", "vladimir", "eugenavich", "Minsk", 123456, "128Acd963");
        customers[1] = new Customer(CUSTOMER_ID_SECOND, "lyubin", "igor", "eugenavich", "Minsk", 123456789, "128Acdfg964");
        customers[2] = new Customer(CUSTOMER_ID_THIRD, "lyubin", "eugeniy", "gorelskiy", "Minsk", 12305, "789456ytf15");

        Catalogue catalogue = new Catalogue();
        catalogue.customerSort(customers);
        for (Customer customer : customers) {
            catalogue.addCustomer(customer);
            System.out.println("Customer catalogue= " + customer.toString());
        }
        catalogue.showCustomers( catalogue.getByFilter(1, 123457));
    }
}
