package com.redis.controller;

import com.redis.vo.Product;
import com.redis.vo.ProductRequestVO;
import com.redis.vo.ProductResponseVO;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.JedisPool;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("redis")
public class DatastoreController {

    private static JedisPool jedisPool = null;
    
    @GetMapping(value = "products")
    public ProductResponseVO getProducts()  {
        ProductResponseVO responseVO = new ProductResponseVO();
        List<Product> products = new ArrayList<>();

        Product product = new Product();
        product.setId(String.valueOf(Math.random()));
        product.setName("iPhoneXS");

        products.add(product);
        responseVO.setProducts(products);

        return responseVO;
    }

    @PostMapping(value = "products", consumes = "application/json")
    public ProductResponseVO getProducts(@RequestBody ProductRequestVO productRequestVO)  {
        ProductResponseVO responseVO = new ProductResponseVO();
        List<Product> products = new ArrayList<>();
        Product product = productRequestVO.getProducts().get(0);


        products.add(product);
        responseVO.setProducts(products);

        return responseVO;
    }


}
