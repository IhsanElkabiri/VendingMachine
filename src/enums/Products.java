package enums;

public enum Products {
    MIRENDINA(7,1,12),
    TANGO(2,2,10),
    KITKAT(4,3,16),
    SNICKERS(8,4,11),
    MILKA(10,5,5);
    private final int price;
    private final int numberProduct;
    private int stock_Product;

    private Products(int price, int numberProduct, int stock_Product) {
        this.price = price;
        this.numberProduct = numberProduct;
        this.stock_Product = stock_Product;
    }

    public int getPrice() {
        return price;
    }

    public int getNumberProduct() {
        return numberProduct;
    }

    public int getStock_Product() {
        return stock_Product;
    }

}
