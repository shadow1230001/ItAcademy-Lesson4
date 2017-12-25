package lyubin.task1.task2Page87.bean;

public class Customer {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String adress;
    private int creditNumberCard;
    private String numberBankAccount;

    public Customer(int id, String surname, String name, String patronymic, String adress, int creditNumberCard, String numberBankAccount) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.adress = adress;
        this.creditNumberCard = creditNumberCard;
        this.numberBankAccount = numberBankAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getCreditNumberCard() {
        return creditNumberCard;
    }

    public void setCreditNumberCard(int creditNumberCard) {
        this.creditNumberCard = creditNumberCard;
    }

    public String getNumberBankAccount() {
        return numberBankAccount;
    }

    public void setNumberBankAccount(String numberBankAccount) {
        this.numberBankAccount = numberBankAccount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", adress='" + adress + '\'' +
                ", creditNumberCard=" + creditNumberCard +
                ", numberBankAccount='" + numberBankAccount + '\'' +
                '}';
    }
}
