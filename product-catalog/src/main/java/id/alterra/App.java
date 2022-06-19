package id.alterra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import id.alterra.config.AppConfig;
import id.alterra.domain.Seller;
import id.alterra.dto.ProductDetailDTO;
import id.alterra.service.ProductService;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	
    	 ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
//    	ApplicationContext appContext = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
//        System.out.println( "Hello World!" );
//        Seller seller = new Seller();
//        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = (ProductService) appContext.getBean("productService");
        ProductDetailDTO productDetailDTO =  productService.findProductDetailById(2L);
        System.out.println("product detail ="+productDetailDTO.toString());
//                Seller seller = (Seller) appContext.getBean("seller");
//        System.out.println("Seller detail " + seller.toString());
    }
}
