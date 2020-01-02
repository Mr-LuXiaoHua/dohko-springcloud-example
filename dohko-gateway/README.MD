dohko-gateway
---

基于Spring Cloud Gateway的网关

```
routes:
  - id: DOHKO-SERVICE-AGGREGATION
    uri: lb://DOHKO-SERVICE-AGGREGATION
    predicates:
      - Path=/aggregation-service/**
    filters:
    - StripPrefix=0
  - id: DOHKO-STOCK-SERVICE
    uri: lb://DOHKO-STOCK-SERVICE
    predicates:
    - Path=/stock-service/**
    filters:
    - StripPrefix=0
  - id: DOHKO-ORDER-SERVICE
    uri: lb://DOHKO-ORDER-SERVICE
    predicates:
    - Path=/order-service/**
    filters:
    - StripPrefix=0
```
在routes标签下添加你的微服务配置

- id:  路由标识，唯一
- uri: 要代理的微服务名称
- predicates:

      Path: 要匹配的访问路径
		这样配置之后，通过网关就可以访问你的微服务了
		http://127.0.0.1:8080/aggregation-service/unified-order
		
		- StripPrefix=1 在转发之前将前缀 /order-service 去掉
        就会映射到 http://127.0.0.1:8083/unified-order
        
        - StripPrefix=0 在转发之前保留映射前缀 /order-service
        就会映射到 http://127.0.0.1:8083/aggregation-service/unified-order
