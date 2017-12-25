package lyubin.task1.task2Page87.logic;

import lyubin.task1.task2Page87.bean.Catalogue;
import lyubin.task1.task2Page87.bean.Customer;

public class CatalogueService {
    public Customer[] getByFilter(Catalogue catalogue,Integer lowwerId, Integer upperId) {
        return getCustomeresById(catalogue,lowwerId, upperId);
    }

    private Customer[] getCustomeresById(Catalogue catalogue,Integer lowwerId, Integer upperId) {
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
                if (catalogue.getCustomerslist()customerslist[i] != null && isGood(lowwerId, upperId, customerslist[i])) { //разобраться
                    customerOut[count] = customerslist[i];
                    count++;
                }
            }
            return customerOut;
        }
        return null;
    }
    private boolean isGood(Integer lowwerId, Integer upperId, Customer in) {
        if ((lowwerId != null && in.getCreditNumberCard() > lowwerId) && upperId != null && in.getCreditNumberCard() < upperId) {
            return true;
        } else {
            return false;
        }
    }
    public void showCustomers(Catalogue catalogue){
        for(Customer c : customerslist){
            System.out.println(c.toString());
        }
    }

    public void showCustomers(Customer[] in){
        for(Customer c : in){
            System.out.println(c.toString());
        }
    }
}
