package pkgfinal.project.oop;

public class Item {

    private int number;
    private String name;
    private int quantity;
    private int price;
    private String tybe;
////كونستركتر موثيدات 
    public Item(int number, String name, int quantity, int price, String tybe) {
        this.number = number;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.tybe = tybe;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTybe() {
        return tybe;
    }

    public void setTybe(String tybe) {
        this.tybe = tybe;
    }

    @Override
    public String toString() {
        return ""
                + "Item Number : " + getNumber() + "\n"
                + "Item Name : " + getName() + "\n"
                + "Item Price : " + getPrice() + "\n"
                + "Item Type : " + getTybe() + "\n";
    }

}
