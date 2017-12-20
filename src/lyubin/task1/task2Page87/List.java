package lyubin.task1.task2Page87;

class List {
    private Customer[] customerslist = new Customer[50];
    private int count = 0;

    void addCustomer(Customer n)
    {
        customerslist[count++] = n;
    }


    void customerSort(Customer[] mass) {
        for (int i = 0; i < mass.length - 1; i++) {
            for (int j = 1; j < (mass.length - i); j++) {
                if (mass[j - 1].getName().compareTo(mass[j].getName()) > 0) {
                    Customer tmp = mass[j - 1];
                    mass[j - 1] = mass[j];
                    mass[j] = tmp;
                }
            }
        }
    }

    public Customer[] getByFilter(Integer lowwerId, Integer upperId) {
        return getCustomeresById(lowwerId, upperId);
    }

    private Customer[] getCustomeresById(Integer lowwerId, Integer upperId) {
        int count = 0;
        for (Customer c : customerslist) {
            if (c != null && isGood(lowwerId, upperId, c)) {
                count++;
            }
        }
        if (count != 0) {
            Customer[] customerOut = new Customer[count];
            count = 0;
            for (int i = 0; i < customerslist.length - 1; i++) {
                if (customerslist[i] != null && isGood(lowwerId, upperId, customerslist[i])) {
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
    public void showCustomers(){
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

