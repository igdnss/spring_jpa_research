package com.research.product.dao;

import com.research.product.ProductApplication;
import com.research.product.entity.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

/**
 * @author ：cn406c0
 * @date ：Created in 2021/3/27 13:11
 * @description：${description}
 */
@RunWith(SpringRunner.class)

@SpringBootTest(classes = ProductApplication.class)
public class ProductDaoTest {

    @Autowired
    ProductDao productDao;

    @Test
    public void testFindOne(){
        Product product = productDao.getOne(1L);
        System.out.println(""+product);
    }
}
