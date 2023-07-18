package oopWithNLayeredApp.entities;

public class Product {   // ekleyeceğimi ürünler ile ilgili özellikler burada tanımlandı ve sett ve get edildi yapıcı metot yazıldı
    private int id;
    private String name;
    private double unitPrice;
    public Product() {
    }

    public Product(int id, String name, double unitPrice) { // Bu bir Constructordur
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    // get ve sett islemleri yapıldı
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
