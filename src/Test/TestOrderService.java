import com.cake.bean.*;
import com.cake.dao.*;
import com.cake.service.AdministratorService;
import com.cake.service.Impl.OrderServiceImpl;
import com.cake.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestOrderService {

    @Autowired
    OrderService orderService;

    @Autowired
    UserMapper userMapper;
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    LcMapper lcMapper;

    @Autowired
    ZMapper mapper;
    @Autowired
    AssociateOrderAndProductMapper associateOrderAndProductMapper;
    @Test
    public void TestOrderService(){
        System.out.println(orderService.getLastId());
    }
    @Test
    public void TestOrderAdd(){
        User user = userMapper.selectByPrimaryKey(1);
        Map<String,String >obj = new HashMap<>();
        obj.put("1","1");
        orderService.createOrder(user,1,obj);
    }
    @Test
    public void TestGetOrder(){
        List<Order> li = orderService.getOrderByUserID(1);
        System.out.println(li);
    }
    @Test
    public void TestMyMapper(){
        System.out.println(mapper.selectOrderTmp(1));
    }
    @Test
    public void TestGetAssociate(){
//        OrderExample orderExample = new OrderExample();
//        OrderExample.Criteria criteria = orderExample.createCriteria();
//        criteria.andUseridEqualTo(id);
//        List<Order> result =  orderMapper.selectByExample(orderExample);

//        CartExample cartExample = new CartExample();
//        CartExample.Criteria criteria = cartExample.createCriteria();
//        criteria.andIdEqualTo(id);
//        criteria.
//
//        Cart cart = cartMapper.selectByPrimaryKey(id);
//        cart.setNumber(number);
//        cartMapper.updateByPrimaryKey(cart);
//        orderMapper.(1);

        AssociateOrderAndProductExample associateOrderAndProductExample = new AssociateOrderAndProductExample();
        AssociateOrderAndProductExample.Criteria criteria = associateOrderAndProductExample.createCriteria();
        criteria.andProductidEqualTo(1);
        List<AssociateOrderAndProduct> result = associateOrderAndProductMapper.selectByExample(associateOrderAndProductExample);

        for (AssociateOrderAndProduct associateOrderAndProduct  :result){
            System.out.println(associateOrderAndProduct);
        }
    }
}
