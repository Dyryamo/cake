import com.cake.service.CartService;
import com.cake.service.Impl.CartServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCart {


    @Autowired
    CartServiceImpl cartService ;

    @Test
    public void TestGetAllCartList(){
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        cartService = (CartServiceImpl)ctx.getBean("CartServiceImpl") ;

        System.out.println(cartService);
//        System.out.println(cartService.getAllCartList());

    }
}
