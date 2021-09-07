import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpringApplication {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Cart cart = (Cart) context.getBean("cart");
        ProductRepository productRepository = (ProductRepository) context.getBean("productRep");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("введите команду");
            String command = reader.readLine();
            if (command.equals("/getProductList"))
                productRepository.getProductList();
            else if (command.equals("/end"))
                return;
            else if (command.equals("/getProductsInCart"))
                System.out.println(cart.products);
            else if (command.equals("/addProduct")) {
                System.out.println("введите id  товара который хотите добавить в корзину");
                //reader = new BufferedReader(new InputStreamReader(System.in));

                cart.addProduct(productRepository.getProductById(Integer.parseInt(reader.readLine())));

               // System.out.println("added" + reader.readLine());
                System.out.println(cart.products);

            }
            else if (command.equals("/deleteProductById")) {
                System.out.println("введите id  товара который хотите убрать из корзины");
                cart.deleteProductById(Integer.parseInt(reader.readLine()));

                System.out.println(cart.products);

            }
            else System.out.println("undefined command");
        }

    }

}
