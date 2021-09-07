import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SpringConfiguration {
    @Bean(name = "productRep")
    public ProductRepository productRepository() {
        List<Product> productList=new ArrayList<Product>();
        productList.add(new Product(1,"Lemon",103.0));
        productList.add(new Product(2,"Orange",203.0));
        productList.add(new Product(3,"Potato",133.0));
        productList.add(new Product(4,"Carrot",45.0));
        productList.add(new Product(5,"Cucumber",111.0));
        return new ProductRepository(productList);
    }

    @Bean(name = "cart")
    @Scope("prototype")
    public Cart cart() {
        return new Cart();
    }
}
