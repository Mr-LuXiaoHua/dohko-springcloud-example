dohko-eureka-client-zuul
---

服务网关，外部请求通过网关访问内部的微服务

```
zuul:
 routes:
    order-service: #订单服务
      path: /order-service/**
      serviceId: DOHKO-EUREKA-CLIENT-ORDER-SERVICE #/order-service/开头的路径转发至订单微服务
```

访问http://127.0.0.1:8080/order-service/orders/1

实际会由zuul转发到 http://127.0.0.1:8801/orders/1
