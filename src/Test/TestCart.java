
import com.cake.bean.Cart;
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
    CartMapper cartMapper;
    @Autowired
    CartService cartService;

    @Test
    public void TestGetAllCartList(){
        List<Cart> list = cartService.getAllCartList();
        System.out.println(list);
    }
    @Test
    public void TestAlterCartList(){
        Cart cart = cartMapper.selectByPrimaryKey(1);
        System.out.println(cart);
        cart.setNumber(100);
        cartService.alterCartListByCartList(cart);
        System.out.println(cart);
    }
    @Test
    public void TestAddCartList(){
        Cart cart = cartMapper.selectByPrimaryKey(1);
        cartService.addCartList(cart);
    }
    @Test
    public void TestDeleteCartList(){
        Cart cart = new Cart();
        cart.setId(2);
        cartService.deleteCartList(cart);
    }
}
