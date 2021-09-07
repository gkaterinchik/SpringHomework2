import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Product> products=new ArrayList<Product>();

    public void addProduct(Product product){
        products.add(product);
    }
    public void deleteProductById(Integer id){

        int index= -1;

        for (Product p:products
             ) {
            System.out.println("id= "+id);
            if (p.getId().equals(id)){
               index = products.indexOf(p);
                products.remove(index);
                return;

            }
        }

    }
}
