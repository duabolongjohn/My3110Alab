public class BuddyInfo {

    private String name;
    private String number;
    private String address;

    public BuddyInfo(String name, String address, String number) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}