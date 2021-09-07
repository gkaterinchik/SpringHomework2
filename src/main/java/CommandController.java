import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommandController {
    public static String command=null;
    public static Integer id;

    public static void getCommand(String str, AnnotationConfigApplicationContext context) {
        String[] tempArr = str.split(" ");
        command = tempArr[0];
        id = Integer.getInteger(tempArr[1]);
        ProductRepository pr = ( ProductRepository)context.getBean("productRep");
        System.out.println(pr.getProductList());

    }

}
