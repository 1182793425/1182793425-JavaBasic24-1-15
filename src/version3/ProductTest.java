package version3;

public class ProductTest {
    public static void main(String[] args) {
        Product[] products=new Product[3];
        Product p1=new Product(1,"name1",20,50);
        Product p2=new Product(2,"name2",10,30);
        Product p3=new Product(3,"name3",30,10);

        products[0]=p1;
        products[1]=p2;
        products[2]=p3;

        for (int i = 0; i < products.length; i++) {
            Product productTest =products[i];
            System.out.println(productTest.getId()+productTest.getName()+productTest.getPrice()+productTest.getInventory());
        }
    }
}
