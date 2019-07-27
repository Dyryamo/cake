import com.cake.bean.Product;
import com.cake.service.AdministratorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestAdminstratorService {

    @Autowired
    AdministratorService administratorService;


    @Test
    public void TestAdminstratorAdd(){
        Product product = new Product();
        product.setName("小布丁");product.setPrice(1.0f);
        product.setDiscount(8);product.setFlavourid(1);
        product.setRelationid(1);
        product.setThemeid(1);product.setPhotopath("Resource/");
        product.setStar(5);product.setNumber(5);
        administratorService.addProduct(product);
    }
    @Test
    public void TestAdminstratorGetAllProduct(){

        System.out.println(administratorService.getAllProduct());
    }
    @Test
    public void TestAdminstratordeleteAllProduct(){

        Product product = new Product();
        product.setId(2);
        administratorService.deleteProduct(product);

    }
}
