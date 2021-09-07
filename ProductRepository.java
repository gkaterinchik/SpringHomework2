import java.util.List;

public class ProductRepository {
    List<Product> productList;

    public ProductRepository(List<Product> productList) {
        this.productList = productList;
        System.out.println(productList.toString());
    }
    public void addProduct(Product product){
        productList.add(product);
    }
    public Product getProductById(int id){
        for (Product p:productList
             ) {
            if (p.getId().equals(id))
                return p;
        }
    return productList.get(id);
    }
    public List<Product> getProductList(){
        for (Product p:productList
             ) {
            System.out.println(p.toString());
        }
        return productList;
    }

    @Override
    public String toString() {
        return "ProductRepository{" +
                "productList=" + productList +
                '}';
    }
}
