package lyubin.task1.task2Page87.bean;

public class Catalogue {
    private Customer[] customerslist = new Customer[50];
    private int count = 0;

    public Catalogue(Customer[] customerslist, int count) {
        this.customerslist = customerslist;
        this.count = count;
    }

    public Customer[] getCustomerslist() {
        return customerslist;
    }

    public void setCustomerslist(Customer[] customerslist) {
        this.customerslist = customerslist;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void addCustomer(Customer n) {
        count++;
        Customer[] customerArray = new Customer[count + 1];
        for (int i = 1; i < customerslist.length && i <= count; i++) {
            customerArray[i] = customerslist[i];
        }
        customerArray[count] = n;
    }


    public void customerSort(Customer[] mass) {
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
}





