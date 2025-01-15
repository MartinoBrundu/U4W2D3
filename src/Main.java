import Books.Prodotti;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Prodotti> prodotti = new ArrayList<>();
        prodotti.add(new Prodotti(1L, "Libro A", "Books" , 102.0));
        prodotti.add(new Prodotti(2L, "Libro B", "Books" , 208.32));
        prodotti.add(new Prodotti(3L, "Libro C", "Baby" , 30.0));
        prodotti.add(new Prodotti(4L, "Libro D", "Boys" , 30.0));
        prodotti.add(new Prodotti(5L, "Libro E", "Books" , 30.0));
        System.out.println(prodotti);
        List<Prodotti> catBooks = prodotti.stream().filter(p -> "Books".equals(p.getCategory()) && p.getPrice() > 100 ).toList();;
        System.out.println(catBooks);
    }
    ;
}