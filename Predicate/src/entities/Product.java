package entities;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //  Static Trabalha com o produto que eu passar pra ele
    public static boolean staticProductPredicate(Product p){
        return p.getPrice() >= 100.00;
    }

    // Sem ser static ele trabalha com o objeto da classe, então n preciso passar de arg
    public boolean nonStaticProductPredicate(){
        return getPrice() >= 100.00;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
