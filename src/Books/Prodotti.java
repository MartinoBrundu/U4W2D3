package Books;

import java.util.ArrayList;
import java.util.List;

public class Prodotti {
    private long  id ;
    private String name;
    private String category;
    private double price;

    public Prodotti (long id, String n, String cate, double p) {
        this.id= id;
        this.name= n;
        this.category= cate;
        this.price= p ;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Prodotti{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
