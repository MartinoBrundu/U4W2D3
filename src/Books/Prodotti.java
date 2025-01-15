package Books;

public class Prodotti {
    private Long  id ;
    private String name;
    private String category;
    private Double price;

    public Prodotti (long id, String n, String cate, Double p) {
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


    public void Stampa (){
        System.out.print("ID" + id, "nome" + name , "Categoria"+ category , "prezzo" + price);
    }
}
