package version6;

public class ArrayList_Phone {
    private String brand;
    private int price;

    public ArrayList_Phone() {
    }

    public ArrayList_Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    /**
     * 获取
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "ArrayList_Phone{brand = " + brand + ", price = " + price + "}";
    }
}
