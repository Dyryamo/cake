
import com.cake.dao.CartMapper;
import com.cake.service.CartService;
import com.cake.service.Impl.CartServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestCart {

    @Autowired
    CartService cartService;

    @Test
    public void TestGetAllCartList(){
        System.out.println(cartService);
    }
}
