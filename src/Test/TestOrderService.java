import com.cake.bean.Product;
import com.cake.bean.User;
import com.cake.dao.UserMapper;
import com.cake.service.AdministratorService;
import com.cake.service.Impl.OrderServiceImpl;
import com.cake.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestOrderService {

    @Autowired
    OrderService orderService;

    @Autowired
    UserMapper userMapper;
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
}
