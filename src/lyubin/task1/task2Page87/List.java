package lyubin.task1.task2Page87;

public class List {
    private Customer[] customerslist = new Customer[50];
    private int count = 0;

    void addCustomer(Customer n) {
        customerslist[count++] = n;
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

