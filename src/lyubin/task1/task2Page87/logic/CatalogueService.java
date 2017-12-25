package lyubin.task1.task2Page87.logic;

import lyubin.task1.task2Page87.bean.Catalogue;
import lyubin.task1.task2Page87.bean.Customer;

public class CatalogueService {
    public static Customer[] getByFilter(Catalogue catalogue, Integer lowwerId, Integer upperId) {
        return getCustomeresById(catalogue, lowwerId, upperId);
    }

    private static Customer[] getCustomeresById(Catalogue catalogue, Integer lowwerId, Integer upperId) {
        int count = 0;
        for (Customer c : catalogue.getCustomerslist()) {
            if (c != null && isGood(lowwerId, upperId, c)) {
                count++;
            }
        }
        if (count != 0) {
            Customer[] customerOut = new Customer[count];
            count = 0;
            for (int i = 0; i < catalogue.getCustomerslist().length - 1; i++) {
                if (catalogue.getCustomerslist()[i] != null && isGood(lowwerId, upperId, catalogue.getCustomerslist()[i])) { //разобраться
                    customerOut[count] = catalogue.getCustomerslist()[i];
                    count++;
                }
            }
            return customerOut;
        }
        return null;
    }

    private static boolean isGood(Integer lowwerId, Integer upperId, Customer in) {
        return (lowwerId != null && in.getCreditNumberCard() > lowwerId) &&
                upperId != null &&
                in.getCreditNumberCard() < upperId;
    }


    public static void showCustomers(Customer[] in) {
        for (Customer c : in) {
            System.out.println(c.toString());
        }
    }
}
